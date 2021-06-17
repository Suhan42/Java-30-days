package eg;
//5.21
import java.util.Scanner;

public class ���ļ��� {
	//passwd����Կ
	static String encrypt(String sourceString, String passwd) {
		char []p = passwd.toCharArray();				//toCharArray() �Ѵ�ת�����ַ�����
		int n = p.length;
		char []s = sourceString.toCharArray();
		int m = s.length;
		
		for(int i=0; i<m; i++) {
			int demo = s[i]+p[i%n];					//i%n ��i==nʱ�ֱ��0���γɻ�
			s[i] = (char)demo;
		}
		return new String(s);
	}
	
	static String decrypt(String sourceString, String passwd) {
		char []p = passwd.toCharArray();
		int n = p.length;
		char []s = sourceString.toCharArray();
		int m = s.length;
		
		for(int i=0; i<m; i++) {
			int demo = s[i]-p[i%n];
			s[i] = (char)demo;
		}
		return new String(s);
	}
	
	public static void main(String[] args) {
		String sourceString = "����ʧ�ܣ�Ц��";
		System.out.println("���ݣ�"+sourceString);
		
		Scanner scanner = new Scanner(System.in);
		String passwd = scanner.nextLine();
		scanner.close();
		
		String secret = encrypt(sourceString, passwd);
		System.out.println("���ģ�"+secret);
		
		String source = decrypt(secret, passwd);
		System.out.println("���ģ�"+source);
		
				

	}
}