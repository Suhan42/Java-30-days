package �������;
//5.11
public class �쳣�� {

	public static void main(String[] args) {
		
		int a=1, b=2, c=3;
		
		try {
			a = Integer.parseInt("1234");	//�Ѵ�ת������
			b = Integer.parseInt("a123");	//���ﴮ��������ĸ���Գ����ˣ�Ҳ��û�и�ֵ
			c = 12;			//��Ϊ����һ�г����ˣ�����ֱ��catch����һ�о�û��ִ��
		}
		catch(NumberFormatException e){
			System.out.println(e.getMessage()+"\n");
			//e.printStackTrace();	//ֱ�ӱ���
		}
		//Exception �������쳣��ĸ��࣬�����Բ���
		catch(Exception e){
			System.out.println(e.getMessage()+"\n");
		}
		
		//finally����䣬����try�Ƿ��쳣������ִ��finally���
		finally {
			System.out.println("a is "+a+"\nb is "+b+"\nc is "+c);
		}
//�������
		try {
			System.out.println("�����׳��쳣����");
			throw new java.io.IOException("�����");		//throw �׳��쳣
		}
		catch(java.io.IOException e) {
			System.out.println("�����쳣��"+e.getMessage());
		}		
//���ò���
		try {
			hello();
		}
		catch(Exception e){
			System.out.println(e.getMessage()+"\n");
		}
	}
	
	static void hello() throws Exception  {
			System.out.println("helloword");
			throw new java.io.IOException("I/OҲ�ǹ����׳��쳣");
	}
}
