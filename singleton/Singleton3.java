package singleton;

//˫�ؼ�����
/*�ȿ���ʵ���̰߳�ȫ���ֿ���ʹ���ܲ��ܴܺ��Ӱ�죬 �����Ϊ�� ������ÿ�ν���getInstance()��Ҫ����ͬ���� �������ж�ʵ���Ƿ���ڣ����������
 * �����ͬ���飬���ǵ�һ�ؼ�飬 ����ͬ��������ж�ʵ���Ƿ���ڣ����������򴴽�ʵ���������Ϳ���ֻͬ��һ��*/

/*volatile: ��volatile���α�����ֵ�������ᱻ�����̻߳��棬���жԸñ����Ķ�д����ֱ�Ӳ��������ڴ棬�Ӷ���֤����߳��ܹ���ȷ����ñ���*/

public class Singleton3 {
	private volatile static Singleton3 instance = null;
	//˽�й��캯��
	private Singleton3(){}
	//���󹤳�����
	public static Singleton3 getInstance(){
	//�ȼ��ʵ���Ƿ���ڣ������ڲŽ���ͬ����
		if(instance == null){
	//ͬ���飬 �̰߳�ȫ�Ĵ���ʵ��
			synchronized(Singleton3.class){
	//���ʵ���Ƿ���ڣ���������ڲŴ���ʵ��
				if(instance == null){
					instance = new Singleton3();
				}
			}
		}
		return instance;
	}

}
