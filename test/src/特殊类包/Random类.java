package �������;
//5.25
import java.util.Random;

public class Random�� {
	//random�������0~1֮�����
	public static void main(String[] args) {
		//�����
		int[] nm = new int[10];
		for(int i=0;i<nm.length; i++) {
			nm[i] = (int)(Math.random()*21)+80;	//�����(80-100]֮��
		}
		
		Random r1 = new Random(123);	//����123�����ӣ������������һ������������һ��
		
		int i=0;
		while(true) {
			i++;
			int r = r1.nextInt(100);
			System.out.print(r+" ");
			if(i==10) break;
		}
	}
}
