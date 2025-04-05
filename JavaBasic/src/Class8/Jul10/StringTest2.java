package Class8.Jul10;

public class StringTest2 {

	public static void main(String[] args) {
//		String s = "你好 #hello";
//		int n = s.length();
//		System.out.print(n);

//		String s = "你好hello";
//		String sub = s.substring(0,2);
//		System.out.println(sub);

//		String s1 = new String("nihao");
//		String s2 = new String("nihao");	
//		if(s1.equals(s2))
//			System.out.println("相同");
//		else
//			System.out.println("不相同");

		String s1 = "liming";
		String s2 = "lilei";
		if (s1.compareTo(s2) < 0)
			System.out.println(s1 + "位于前面");
		else
			System.out.println(s2 + "位于前面");
	}
}
