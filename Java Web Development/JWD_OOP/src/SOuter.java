
// 外部类
public class SOuter { // 封装 - 静态内部类
	static int num = 7; // 外部类的静态变量
	private int a = 9; // 外部类的私有变量 
	// 静态内部类
	public static class SInner { // static
		int num = 777; // 内部类的变量
		public void test() {
			System.out.println("Outer class c: " + SOuter.num);
			System.out.println("Inner class c: " + num);
		}
	}
	// 测试静态内部类
	public static void main(String[] args) {
		SInner si = new SInner(); // 直接创建内部类变量
		si.test();
	}
}

//静态内部类是static修饰的内部类，这种内部类的特点是：

//成员的⽅式访问

//1. 静态内部类不能直接访问外部类的⾮静态成员，但可以通过new 外部类().

//2. 如果外部类的静态成员与内部类的成员名称相同，可通过“类名.静态成员” 访问外部类的静态成员；如果外部类的静态成员与内部类的成员名称不相同，则可通过“成员名”直接调⽤外部类的静态成员

//3. 创建静态内部类的对象时，不需要外部类的对象，可以直接创建 内部类 对象名 = new 内部类();