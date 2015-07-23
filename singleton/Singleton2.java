package singleton;

//懒汉式单例模式
/*懒汉式单例模式 是典型的以时间换空间，每次获得实例都需要判断，看是否需要创建实例，判断浪费时间， 如果不需要创建实例 则可以节省空间*/
public class Singleton2 {
	private static Singleton2 instance = null;
	//私有构造函数
	private Singleton2(){}
	//抽象工厂方法
	/*对静态工厂方法使用了同步化，适合多线程环境*/
	public static synchronized Singleton2 getInstance(){
		if(instance == null){
			instance = new Singleton2();
		}
		return instance;
	} 
}
