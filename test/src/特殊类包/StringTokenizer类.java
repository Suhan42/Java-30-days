package �������;
//5.21
import java.util.StringTokenizer;

//StringTokenizer�ཫ�ַ������зָ�
public class StringTokenizer�� {
	public static void main(String[] args) {
		String str = "google,baidu,facebook,zhihu,suhan";
		StringTokenizer st = new StringTokenizer(str, ",");		//�����ǰ�str�Ž�ȥ֮��ָ�� , Ϊ�ָ���ǣ������strҲ����ֱ���Ǵ���
		
		while(st.hasMoreTokens()) { 	 //hasMoreTokens()�����Ƿ��зָ���
            System.out.println(st.nextToken());			//nextToken()���شӵ�ǰλ�õ���һ���ָ������ַ���
        }
		
		StringTokenizer st2 = new StringTokenizer("you,are good#programmer:engineer", " ");
		System.out.println(st2.nextToken("#"));		//nextToken(String delim)��ָ���ķָ������ؽ��
	}
}