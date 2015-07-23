package singleton;

//����ʽ����ģʽ
/*����ʽ����ģʽ �ǵ��͵���ʱ�任�ռ䣬ÿ�λ��ʵ������Ҫ�жϣ����Ƿ���Ҫ����ʵ�����ж��˷�ʱ�䣬 �������Ҫ����ʵ�� ����Խ�ʡ�ռ�*/
public class Singleton2 {
	private static Singleton2 instance = null;
	//˽�й��캯��
	private Singleton2(){}
	//���󹤳�����
	/*�Ծ�̬��������ʹ����ͬ�������ʺ϶��̻߳���*/
	public static synchronized Singleton2 getInstance(){
		if(instance == null){
			instance = new Singleton2();
		}
		return instance;
	} 
}
