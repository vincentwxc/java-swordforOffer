package singleton;

//lazy initialization holder class 模式
/*优点是 getInstance并没有被同步，并且只是进行了一个域的访问，因此延迟初始化并没有增加访问成本。*/


public class Singleton4 {
	private Singleton4(){}
	/*
	 * 类级的内部类，也就是静态的成员式内部类，该内部类的实例和外部类的实例没有绑定关系
	 * 而且只有被调用时才会被装载，实现了延迟装载*/
	public static class SingletonHolder{
		private static Singleton4 instance = new Singleton4();
	}
	//静态抽象工厂方法
	public static Singleton4 getInstance(){
		return SingletonHolder.instance;
	}

}
