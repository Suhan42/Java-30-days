package eg;
//6.11
import java.util.Scanner;

/*���¶ȼ���
 * Q = M*(��ֹt - ��ʼt)*4184
 */
public class Temperature {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double M, Q, end, first;
		
		System.out.println("Please input the amount of warter:");
		M = input.nextDouble();
		System.out.println("input start temperature:");
		first = input.nextDouble();
		System.out.println("input final temperature:");
		end = input.nextDouble();
		
		input.close();
		
		Q=M*(end-first)*4184;
		
		System.out.println("Energy is:"+Q);
	}
}
