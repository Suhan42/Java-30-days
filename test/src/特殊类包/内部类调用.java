package �������;
//5.7
public class �ڲ������ {
	public static void main(String []args) {
		InnerClass no = new InnerClass();
		
		InnerClass.A noa = no.new A(2);
		//B �Ǿ�̬��
		InnerClass.B nob = new InnerClass.B(4);
		
		no.outclass();
		noa.out();
		nob.out();
		
		//���������д
		Anonymous an = new Anonymous() {
			void out() {
				int num=2;
				for(int i=0; i<3; i++, num++) 
					System.out.print(num+" ");
			}
		};
		an.out();
	}
}
