package eg;
//6.11
import java.util.Scanner;
//random������� [0,1)֮�����
public class Random_out {
	//���n-m֮��������
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("���뿪ͷ��β�����֣���");
		int n, m;
		n = in.nextInt();
		m = in.nextInt();
		in.close();
		
		if(n>m) {
			System.err.println("m>n");	//����
			System.exit(0); 		//0���������������0���Ƿ��������
		}
		int r;
		
	//��ȡ���
		System.out.println("��[n,m):");
		for(int i=0; i<10; i++) {
			r = (int)(Math.random()*(m-n) )+n;
			System.out.print(r+" ");
		}
		System.out.println();
		
		
		System.out.println("��[n,m]:");
		for(int i=0; i<10; i++) {
			r = (int)(Math.random()*(m-n+1) )+n;
			System.out.print(r+" ");
		}
	}
}
