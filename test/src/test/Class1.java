package test;
//3.30
import java.util.Scanner;
	//�����������

public class Class1 {		//����һ��������ĸ��д
	
//��Ա�������ڶѣ���Ĭ��ֵΪ0
	//ʵ��������ÿ�������е�����һ��
	int height;
	//��̬������ֻ��һ�ݣ���һ������
	static int above;//�ϵ�
	static int bottom;//�µ�
	
	//����Ҳ�о�̬�Ǿ�̬֮�֣���̬������ֻ�ܵ��þ�̬����������main�����Ǿ�̬�����Ե���
	void setheight(int height) {
		this.height=height;//���÷�ʽ
	}
	
	int putnum(){
		return (above+bottom)*height/2;
	}
	
	
	public static void main(String[] args) {
		//�ֲ���������ջ
		String str="�������ϵס��µס��ߣ�";
		//���ֱ������
		Class1 hc=new Class1();
		System.out.print(hc.height);
		
		System .out.print(above);
		
		System.out.println(str);
		
		//�������
		Scanner win =new Scanner(System.in);
		above=win.nextInt();
		bottom=win.nextInt();
		int x=win.nextInt();
		win.close();
		hc.setheight(x);
		
		System.out.println(hc.putnum());
		
		//������ʹ�úͱ������ƣ��������һ���Ǿ�̬���������ԣ�
		System.out.println((new Class1()).putnum());
	}
}
