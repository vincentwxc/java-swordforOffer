package singleton;

//lazy initialization holder class ģʽ
/*�ŵ��� getInstance��û�б�ͬ��������ֻ�ǽ�����һ����ķ��ʣ�����ӳٳ�ʼ����û�����ӷ��ʳɱ���*/


public class Singleton4 {
	private Singleton4(){}
	/*
	 * �༶���ڲ��࣬Ҳ���Ǿ�̬�ĳ�Աʽ�ڲ��࣬���ڲ����ʵ�����ⲿ���ʵ��û�а󶨹�ϵ
	 * ����ֻ�б�����ʱ�Żᱻװ�أ�ʵ�����ӳ�װ��*/
	public static class SingletonHolder{
		private static Singleton4 instance = new Singleton4();
	}
	//��̬���󹤳�����
	public static Singleton4 getInstance(){
		return SingletonHolder.instance;
	}

}
