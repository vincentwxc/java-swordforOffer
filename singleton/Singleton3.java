package singleton;

//双重检查加锁
/*既可以实现线程安全，又可以使性能不受很大的影响， 其机制为： 并不是每次进入getInstance()都要进行同步， 而是先判断实例是否存在，如果不存在
 * 则进入同步块，这是第一重检查， 进入同步块后，再判断实例是否存在，若不存在则创建实例，这样就可以只同步一次*/

/*volatile: 被volatile修饰变量的值，将不会被本地线程缓存，所有对该变量的读写都是直接操作共享内存，从而保证多个线程能够正确处理该变量*/

public class Singleton3 {
	private volatile static Singleton3 instance = null;
	//私有构造函数
	private Singleton3(){}
	//抽象工厂方法
	public static Singleton3 getInstance(){
	//先检查实例是否存在，不存在才进入同步块
		if(instance == null){
	//同步块， 线程安全的创建实例
			synchronized(Singleton3.class){
	//检查实例是否存在，如果不存在才创建实例
				if(instance == null){
					instance = new Singleton3();
				}
			}
		}
		return instance;
	}

}
