package Class9.Jul11;

public class IndexOfExercise {

	public static void main(String[] args) {
		String s = " JOKer";
		int name = s.indexOf("joker");
		if(name >= 0) 
			System.out.print(name);
		else
			System.out.print(name);

	}

}

//注意⚠️：输出的是首字母的下标（下标从0开始）,找不到就会显示-1，大小写不对也会错（会找完全匹配的）
// 字符串是一个整体，只会整个一起找（不会拆开找）
