package �������;
//5.21

//��Ϊ�ڴ����ʵ���У����� StringBuffer Ҫ��
/*
 * StringBuffer��StringBuilder��Ķ����ܹ�����ε��޸ģ����Ҳ������µ�δʹ�ö���
 * ����StringBuffer֮������ͬ���ڣ�StringBuilder�ķ��������̰߳�ȫ�ģ�����ͬ�����ʣ���
 * ���� StringBuilder ����� StringBuffer ���ٶ����ƣ����Զ�������½���ʹ�� StringBuilder �ࡣ
 * Ȼ����Ӧ�ó���Ҫ���̰߳�ȫ������£������ʹ�� StringBuffer �ࡣ
 */
public class StringBuilder�� {
	public static void main(String[] args) {
		
		StringBuffer sBuffer = new StringBuffer("java student:");
		sBuffer.append("su");
		sBuffer.append("h");
		sBuffer.append("an");
		
		System.out.println(sBuffer);
	}
}