package �ӿڰ�;
//4.27
/*�ӿڿ���������
  * �ӿڣ������ڼ̳�
 */
import p1.p2.p3.Interface����;

//�� , ʵ�ֶ���ӿ�
public class �ӿ�{
	
	public static void main(String []args) {
		Interface���� ex = new InterfaceClass();
		double s = ( (InterfaceClass)ex).area();	//ǿ������ת�� ��
		System.out.println("Բ�ε����"+s);
	}
}



//������һ������ʵ�ֽӿڣ�Ҳ�����ö������ʵ�ֽӿڶ�̬
class InterfaceClass implements Interface����,Iarea{
	@Override
	public double area() {
		return pi*r*r;
	}
}
