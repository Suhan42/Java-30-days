package test;

//import java.lang.reflect.Array;

/*
 * �����в��� ���ݲ����� args
 * ��run�����confi...
*/
public class ��ʼֵ_����ֵ_�ж���� {
	public static void main(String []args) {
		System.out.println(args.length);
		
		for(String s:args) {//for(int i=0; i!=args.length; i++) {
			System.out.println(s);//System.out.println(args[i]);
		}
	//�ж����
		int a[]= {1, 2, 3};
		int b[]= {4, 5, 6};
		int c[]= {1, 2, 3};
		System.out.println(a==b);//�ж��Ƿ���ȣ�����true or false
		System.out.println(a==c);//�жϵ�ַ
		System.out.println(c[1]==a[1]);//�ж�Ԫ��
		
	
		//ֵ������
		int[] grades=new int[20];
		for(int i=0; i!=grades.length; i++) {
			grades[i]=(int)(Math.random()*41)+60;//�����(1-100֮��)
		}
		for(int grade:grades) {
			System.out.print(grade+" ");
		}
		System.out.println();
		int max=grades[0];
		for(int i=0; i!=grades.length; i++){
			if(max<grades[i])
				max=grades[i];
		}
		//find max
		System.out.println("max is:"+max);
	}
}