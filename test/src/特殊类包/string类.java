package �������;
//5.14
import java.io.UnsupportedEncodingException;

public class string�� {
	//ֻ����д
	//����д������߶����ٶȣ���ʡ�ڴ�
	public static void main(String[] args) {
		//t1,t2�� new �����ģ���������������
		String t1 = new String("one");//t1�����ñ��������ַ
		String t2 = new String("one");
		System.out.println(t1==t2);
		//compareTo���������ֵ��������ָ����String������жԱȣ�������t1-t2��
		int r1 = t1.compareTo(t2);		//t1-t2
		//equals��String��һ��������Ҳ���еȱȽ�
		boolean r2 = t1.equals(t2);		
		System.out.println("t1-t2="+r1+"\nequals is:"+r2);
		
		//ss,tt��Ȼ�ǲ�ͬ�д������࣬��������һ���������Ż���������һ���ָࣨ��ͬһ�����ַ��
		String ss ="two";
		String tt ="two";
		//ֻ��String���еȵ�
		System.out.println(ss==tt);
		
		//��Ϊ������ new �����ģ������ǲ�ͬһ����
		Object o1 = new Object();
		Object o2 = new Object();
		boolean r3 = o1.equals(o2);		//����� equals ��ֱ���е� == ͬһЧ�����ǱȽϵ�ַ
		System.out.println(r3);
		//length��String��һ�����������ش��ĳ���
		System.out.println(ss.length());
		System.out.println();
//---------------------------------------------------------
		
	//ƴ��
		String s1 = "��";
		String s2 = "��";
		String s12;
		s12 = s1+s2;
		System.out.println(s12);
		
		String str = "asd";
		str += "lmn";
		System.out.println(str);
		System.out.println();
//---------------------------------------------------------
		
	//����
		String str1 = "you are good javahhh  ";
		String str2 = "what are you from";
		//startsWith�����жϵ�ǰString����ǰ���ǲ���ָ���ģ�������you��
		System.out.println("str1: "+str1.startsWith("you"));
		System.out.println("str2: "+str2.startsWith("you"));
		//ͬ��endsWith�����жϵ�ǰString����������ǲ���ָ���ģ�������a��
		System.out.println(str1.endsWith("a"));
		
		//contains�����жϵ�ǰString�����Ƿ����ĳһ������������good��
		System.out.println("str1������ "+str1.contains("good"));
		
		//indexOf��������ָ���ַ���������good����String�����еĵ�һ�γ��ִ���������������ַ�����û���������ַ����򷵻�-1
		System.out.println(str1.indexOf("good"));
		System.out.println(str1.indexOf("sd"));
		
		//substring��������ԭString�����е�(��ʼ���Ƶ��±꣬�������±�)
		String str11 = str1.substring(1,5);
		System.out.println(str11);
		
		//trim��������ԭString��������ݣ�����ȥ���ö���ĩβ�Ŀո�
		String str1_trim = str1.trim();
		System.out.println(str1);
		System.out.println(str1_trim);
		
		System.out.println();
//-------------------------------------------------------------------------
		
	//�ַ���ת��
		int x;
		double d;
		byte b;
		long l;
		float f;
		String str0 = "123";
		x = Integer.parseInt(str0);
		d = Double.parseDouble(str0);
		b = Byte.parseByte(str0);
		l = Long.parseLong(str0);
		f = Float.parseFloat(str0);
		System.out.println(x+" "+d+" "+b+" "+l+" "+f);
		
		char []c = new char[3];
		String strc = "nihao";
		//getChars�����������strc���±�Ϊ1��3(�ǵ�<4)�����Ƶ�����c�У���0��ʼ
		strc.getChars(1, 4, c, 0);
		System.out.println(c);
		//toCharArray������ǰ������ݱ�Ϊchar�洢
		char []cc = "hello world!".toCharArray();
		System.out.println(cc);
		
		
		try {
			@SuppressWarnings("unused")
			byte []bb = "hello world!".getBytes("UTF-8");		//getBytes��ǰ��ת�����ֽڣ�ʹ��utf-8(��ϸ��../����_�����/�ֽ���.java)
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		
		
		
		
		
		
		double sum=0, item=0;
		boolean computable=true;
		//�����в���args
		for(String s:args) {
			try{
				item = Double.parseDouble(s);
				sum = sum+item;
			}
			catch(NumberFormatException e) {
				System.out.println("�������˷Ƿ��ַ���"+e);
				computable = false;
			}
		}
		if(computable)
			System.out.println("sum:"+sum);
		
		
		
	}
}
