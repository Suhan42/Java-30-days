package eg;
//6.18


/*ʹ��System.currentTimeMillis()��ʾ����һ��Сд��ĸ
 */
public class ��ȡ���Сд��ĸ {
	public static void main(String[] args) {
		long t = System.currentTimeMillis();		//��ȡһ����
		int r = (int)(t%26);						//ת���� [0,25] ֮�����
		
		//int r = (int) (Math.random()*26);
		
		char ch = (char)('a'+r);
		
		System.out.println(r+": "+ch);
		
	}
}
