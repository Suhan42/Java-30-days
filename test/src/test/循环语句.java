package test;
//3.26
//һ��������ֻ��һ�� public ��
public class ѭ����� {
	public static void main(String []args) {
		
		//�ۼӵ�m
		int n1=0, m=20;
		n1=(1+m)*m/2;
		System.out.println(n1);
		//�����״
		int n=10;
		Gra ga = new Gra(n);
		ga.putout();
	}
}

class Gra{
	int n;
	Gra() {
		n=5;
	}
	Gra(int n) {
		this.n=n;
	}
	void putout() {
		for(int i=1; i<n; i++) {
			for(int j=0; j<n-i; j++)
				System.out.print(" ");
			
			for(int j=0; j<i; j++) 
				System.out.print("*");
		
			for(int j=0; j<i-1; j++) 
				System.out.print("*");
			
			System.out.println();
		}
	}
}
