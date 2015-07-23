package singleton;

//饿汉式单例模式
/* 饿汉式单例模式是典型的用空间换时间， 当类装载时就会创建类的实例，不管用不用，先创建出来，然后每次调用时，就不用在创建，可以节省时间*/
public class Singleton1 {
	//实例化
	private static Singleton1 instance = new Singleton1();
	//私有构造函数
	private Singleton1(){}
	//静态工厂方法
	public Singleton1 getInstance(){
		return instance;
	}
}
