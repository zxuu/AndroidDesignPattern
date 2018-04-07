����ģʽ
public class EagerSingleton {
    //��������ģʽ
    //�������ʱ������˳�ʼ������������ؽ���������ȡ������ٶȿ�

    private static EagerSingleton instance = new EagerSingleton();//��̬˽�г�Ա���ѳ�ʼ��

    private EagerSingleton() {
        //˽�й��캯��
    }

    public static EagerSingleton getInstance() {
        //��̬������ͬ���������ʱ�ѳ�ʼ���������ж��̵߳����⣩
        return instance;
    }
}

�ؼ��㣺
1��˽�й��캯��


2����̬˽�г�Ա--�������ʱ�ѳ�ʼ��


3���������ʵ�getInstance-----����Ҫͬ������Ϊ�������ʱ�Ѿ���ʼ����ϣ�Ҳ����Ҫ�ж�null��ֱ�ӷ���


����ʽ�����ע���߳����⡢д�������ˡ��������á��������Ǽ�����ʱ����ʵ�������������һ������ģʽ�������˺ܶ�ʵ����
��ô�͵ÿ���Ч�����⣬��Ϊ�����һ�����������ʵ�������ò���һ�鴴����
����ʽ���ŵ�����ʱ���ء�ȱ����Ӧ����ͬ������
ʵҲ���Բ���ͬ��������������ˣ��ഴ��һ���������õķ϶�����ʵҲûʲô���ˡ�


����ģʽ
public class LazySingleton {
    //����ʽ����ģʽ
    //�Ƚ������������ʱ��������ʵ�������������ٶȿ죬������ʱ��ȡ������ٶ���

    private static LazySingleton instance = null;//��̬˽�ó�Ա��û�г�ʼ��

    private LazySingleton() {
        //˽�й��캯��
    }

    public static synchronized LazySingleton getInstance() {
        //��̬��ͬ�����������ʵ�
        
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}

�ؼ��㣺
1�����캯������Ϊ˽��----�����ڱ����������ȡ����Ķ���ֻ�����������еõ��Լ��Ķ���


2����Ա����Ϊstatic�ģ�û�г�ʼ��----����ؿ죬���������Ψһʵ������static��֤���������л�ȡ�������


3���������ʵ�getInstance�� public��synchronized��-----public��֤���⹫����ͬ����֤���߳�ʱ����ȷ�ԣ���Ϊ����������ڼ���
ʱ��ʼ���ģ�


