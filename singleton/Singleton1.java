package singleton;

//����ʽ����ģʽ
/* ����ʽ����ģʽ�ǵ��͵��ÿռ任ʱ�䣬 ����װ��ʱ�ͻᴴ�����ʵ���������ò��ã��ȴ���������Ȼ��ÿ�ε���ʱ���Ͳ����ڴ��������Խ�ʡʱ��*/
public class Singleton1 {
	//ʵ����
	private static Singleton1 instance = new Singleton1();
	//˽�й��캯��
	private Singleton1(){}
	//��̬��������
	public Singleton1 getInstance(){
		return instance;
	}
}
