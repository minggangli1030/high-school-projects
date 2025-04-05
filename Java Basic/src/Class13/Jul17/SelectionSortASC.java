package Class13.Jul17;

public class SelectionSortASC {

	public static void main(String[] args) {
		int[] arr = { 5, 8, 9, 3, 4 };
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) { // 寻找最小的数：arr[min]
			int min = i;
			for (int j = min + 1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (i != min) { // 替换最小的数：arr[min]和arr[i]
				int pos = arr[i];
				arr[i] = arr[min];
				arr[min] = pos;
			}
		}
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
