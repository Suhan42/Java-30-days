package �������;
//5.7

//�����ⲿ��
public class InnerClass {
	A aa;	//�ڲ�����������
	B bb;
	InnerClass(){
		aa = new A(2);
		bb = new B(4);
	}
	
	void outclass() {
			aa.out();
			bb.out();
	}

//�ڲ�����������Ա��
	class A{
		int a;
		A(int n){
			a=n;
		}
		void out() {
			System.out.println(a);
		}
	}

//���ڲ��಻�����Ǿ�̬��staric����
//��̬�ڲ���
	static class B{
		int b;
		B(int n){
			b = n;
		}
		void out() {
			System.out.println(b);
		}
	}
}

//�����ֻࣨ�����壬û����������
abstract class Anonymous{
	void out() {}
}
