
// 外部类Outer
public class Outer { // 封装 - 成员内部类
	private int a = 99; // 外部类的私有属性
	private int num = 7;
	// 内部类Inner
	public class Inner {
		int b = 2; // 内部类的成员属性
		int num = 777;
		public void test() {
			System.out.println("Outer class a: " + a);
			System.out.println("Inner class b: " + b);
			System.out.println("Outer class c: " + Outer.this.num); // this: 访问外部类中成员属性num
			System.out.println("Inner class c: " + num);
		}
	}
	// 测试成员内部类
	public static void main(String[] args) {
		Outer o = new Outer(); // 创建外部类对象名
		Inner i = o.new Inner(); // 使用外部类对象创建内部类对象
		i.test(); // 使用内部类对象的test方法
	}
}

//成员内部类的使⽤⽅法：

//1. Inner类定义在Outer类的内部，相当于Outer类的⼀个成员变量 的位置，Inner类可以使⽤任意访问控制符，如public protected private等

//2. Inner类中定义的test()⽅法可以直接访问Outer类中的数据，⽽不 受访问控制符的影响，如直接访问Outer类中的私有属性a

//3. 定义了成员内部类后，必须使⽤外部类对象来创建内部类对象， ⽽不能直接去new⼀个内部类对象，即：内部类 对象名 = 外部类 对象.new 内部类();

//4. 编译上⾯的程序后，会产⽣两个.class⽂件，成员内部类 的.class⽂件：外部类名$内部类名.class

//5. 外部类是不能直接使⽤内部类的成员和⽅法的

//可以先创建内部类的对象，然后通过内部类的对象来访问其成员变 量和⽅法

//如果外部类和内部类具有相同的成员变量或⽅法，内部类默认访问⾃⼰的成员变 量或⽅法，如果要访问外部类的成员变量，可以使⽤this关键字