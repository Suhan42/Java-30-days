package �ӿڰ�;
//4.30
import java.util.Arrays;

public class Comparable�ӿ����Ƚ� {
	public static void main(String []args) {
		
//Comparable �ǽӿ�����
		Comparable<String> s1 = "hello";
		String s2 = "zzzzz";
		String s3 = "helloo";
		
//compareTo()�����������ȶ�
		int result = s1.compareTo(s2);		//s1-s2
		int result2 = s1.compareTo(s3);
		
		System.out.println(result);
		System.out.println(result2);
		

		String[] sun = {"mjn", "kmf", "lkg", "idnfd", "dsnhf"};
		
//����(ǰ��������Ȼ˳��)
		Arrays.sort(sun);
		
		
		//���
		for(String s:sun) {
			System.out.println(s);
		}
		
	}
}
