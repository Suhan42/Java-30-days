package �������;
//5.25
import java.math.BigInteger;

//�����ر�������
public class BigInteger�� {
	
	static int x = 2;
	
	public static void main(String[] args) {
		BigInteger sum = new BigInteger("0");
		BigInteger one = new BigInteger("1209257039");
		BigInteger two = new BigInteger("1204567890");
		BigInteger three = new BigInteger("-1209257039");
		
		sum = one.add(two);			//��ӣ��ͣ�
		System.out.println("�ͣ�"+sum);
		
		sum = one.subtract(two);	//���one - two���
		System.out.println("�"+sum);
		
		sum = one.multiply(two);	//��ˣ�����
		System.out.println("����"+sum);
		
		sum = one.divide(two);		//������̣�
		System.out.println("�̣�"+sum);
		
		sum = one.remainder(two);	//����
		System.out.println("�ࣺ"+sum);
		
		int a = one.compareTo(two);	//����������ıȣ�1�����ڡ�-1��С�ڡ�0������
		System.out.println("��ϵ��"+a);
		
		sum = three.abs();			//���ؾ���ֵ
		System.out.println("abs��"+sum);
		
		sum = one.pow(x);			//���� one �� 2 �η�
		System.out.println(x+"�η���"+sum);
		
		String str = one.toString();
		System.out.println(str);
		
		str = one.toString(x);		//���ص�ǰ���� 2 �����ַ���
		System.out.println(str);
	}
}
