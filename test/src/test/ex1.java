package test;

//import java.util.Scanner;
import java.util.*;//������������ȫ���ó�����������ֻ������һ������İ�����������Ӱ��Ͳ�������

public class ex1 {
	public static void main(String args[]){
		System.out.println("scanf:");
		
		Scanner reader=new Scanner(System.in);
		
		//Data da=new Data();
		
		//Ҳ����ʹ�� �������ͣ���������int->Integer(��)
		Integer sum=42;
		System.out.println("����һ�����֣�");
		int x=reader.nextInt();
		
		String s1, s2;
		System.out.println("������������ʹ�ÿո��������");
		s1=reader.next();
		s2=reader.nextLine();
		
		reader.close();	//��������close�رգ���Ȼ�ᾯ��
		
		System.out.println(x+" suhan "+sum);
		System.out.println(s1+" and "+s2);
		
		boolean bool = s1 instanceof String;//instanceof ������ж�ǰ��Ķ����������ں������(�������Ҳ�����Ǹ���),���ڵĻ�����true,����false
		boolean bool2 = sum instanceof Object;
		System.out.println(bool+" "+bool2);
	}
}