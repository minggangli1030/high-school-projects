
// 外部类
public class MOuter { // 封装 - ⽅法内部类
	// 外部类中的方法
	public void show() {
		final int a = 25;
		int b = 13;
		// 方法内部类
		class MInner {
			int c = 2;
			public void print() {
				System.out.println("Outer class a: " + a);
				System.out.println("Inner class c: " + c);
			}
		}
		MInner mi = new MInner();
		mi.print();
	}
	// 调试方法内部类
	public static void main(String[] args) {
		MOuter mo = new MOuter();
		mo.show();
	}
}

//⽅法内部类就是内部类定义在外部类的⽅法中，⽅法内部类只在该⽅法的内部可⻅，即只在该⽅法内可使⽤

//如果⼀个类只在某个⽅法中使⽤，则可以考虑使⽤⽅法内部类

//由于⽅法内部类不能在外部类的⽅法以外的地⽅使⽤，因此⽅法内部类不能使⽤访问控制符和static修饰符
