package Class13.Jul17;

public class InsertionSortASC {

	public static void main(String[] args) {
		int arr[] = {5,8,9,3,4};
		int i = 0;
		int j = 0;
		int n = arr.length;
		for (i = 1; i < n; i++) {
			int pos = arr[i];
			for (j = i - 1; j >= 0 && arr[j] > pos; j--) {
				arr[j + 1] = arr[j]; // 寻找pos合适的位置，记录(a[i]=a[j+1]) +  令其他往后移，为插入pos作准备
			}
			arr[j + 1] = pos; //将pos插入到arr[j]的后面
		}
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
