package eg;
//6.11

import java.util.Scanner;

public class GetRoot {
	
/*���Ԫһ�η��̵Ľ�
 *��=b*b-4*a*c
 */
	public static void main(String[] args) {
		double x1, x2, a, b, c, d;
		Scanner in = new Scanner(System.in);
		
		System.out.println("����������a, b, c");
		a=in.nextDouble();
		b=in.nextDouble();
		c=in.nextDouble();
		in.close();
		
		d=b*b-4*a*c;
		
		if(d>0) {
			x1=(-b + Math.sqrt(d))/2*a;
			x2=(-b - Math.sqrt(d))/2*a;
			System.out.println("����������root���ֱ���"+x1+"��"+x2);
		}
		if(d==0) {
			x1=(-b - Math.sqrt(d))/2*a;
			System.out.println("������һ��root��x="+x1);
		}
		else {
			double aa, bb;
			aa = -b/2*a;
			bb = Math.sqrt(-d)/2*a;
			System.out.println("����û��ʵ����������������ֱ��ǣ�"+aa+"+"+bb+"i  ��  "+aa+"-"+bb+"i");
		}

	}
}

		