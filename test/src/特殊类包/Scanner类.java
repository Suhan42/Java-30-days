package �������;
//5.21
import java.util.Scanner;

public class Scanner�� {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		boolean bool;
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		String str, ss;
		
		bool = reader.nextBoolean();
		b = reader.nextByte();
		s = reader.nextShort();
		i = reader.nextInt();
		l = reader.nextLong();
		f = reader.nextFloat();
		d = reader.nextDouble();
		str = reader.next();		//next�������У�tab���ո񡢻س������Խ��������ǣ���next�лس�֮��nextLine�Ͳ������붫����
		ss = reader.nextLine();		//nextLine�������У�ֻ�лس����Խ���
		
		reader.close();				//�رգ���Ȼ�ᾯ��
		
		
		System.out.print("bool:"+bool+"    byte:"+b);		//print������ỻ��
		System.out.println("    short:"+s+"    int:"+i);		//println������Զ�����
		System.out.println("long:"+l+"    float:"+f+"    string:"+str);
		
		System.out.printf("%d    %s\n", i, ss);		//\n����
		System.out.printf("%5d\n", i);			//���int�����ݣ�ռ5��
		System.out.printf("%5.4f", d);			//������������ݣ�ռ5�У�С���㱣��4λ
	}
}
