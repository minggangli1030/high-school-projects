package Class9.Jul11;

public class StartsWEndsWExercise {

	public static void main(String[] args) {
		String filename = "test.mp4";
		if (filename.endsWith("mp4")) 
			System.out.println("支持此格式");
		else
			System.out.println("不支持此格式");
		
		String title = "test.mp4";
		if (title.startsWith("test")) 
			System.out.println("支持此名称");
		else
			System.out.println("不支持此名称");

	}
// Java是一个很注意大小写的语言，同一个单词如果大小写不同就会完全不同
// 空格也是一个字符
}
