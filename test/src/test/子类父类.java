package test;
//4.20 4.23
public class ���ุ�� extends Object {
	public static void main(String []args) {
		
		Object o1 = new Object();
		//���o1 = 1; ���������
		
		//to.String()���Զ����õ�
		System.out.println(o1.toString());
		//java.lang.Object@15db9742 ������ǵ�ַ
		Object t1 = new ���ุ��();
		System.out.println(t1);
		
		Son boy = new Son(2);
		boy.setfa(3);
		boy.out();
		
		boy.setf(5);
		boy.out();
		
	}
}

class Father {
	private int fa;
	int f;
	void setfa(int fa){
		this.fa=fa;
	}
	void out() {
		System.out.println("fa is:"+fa);
	}
}


class Son extends Father{
	int s;
	
//���������Ѿ����� f�������ֶ����ˣ����� ���ǣ�Override������Ա���������أ�
	
	int f=123;	
	
	Son(){}
	Son(int s){
		this.s=s;
	}
	void setf(int f){
		super.f=f;	//super���������صģ�ֻ������һ�㸸��
	}
	
//����Ҳ�� ������д	
	void out() {
		System.out.println("s is:"+s);
		System.out.println("f is:"+super.f);
	}
	
}