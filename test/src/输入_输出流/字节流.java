package ����_�����;
//5.28
import java.io.*;

public class �ֽ��� {
	public static void main(String[] args) throws IOException {
		
		int n=-1;
		byte []a=new byte[10];
		
		File f = new File("txt/example.txt");
		
//����� �����ļ�������
		byte []b = "hello world!".getBytes("UTF-8");			//getBytes��ǰ��ת�����ֽڣ�ʹ��utf-8
			//FileOutputStream��OutputStream�����࣬�ֽ������
		OutputStream out = new FileOutputStream(f);		//����������trueָ������ԭ���ı�����������ݣ���Ȼ�Ḳ��ԭ������
		System.out.println(f.getName()+"���ڵĴ�С�ǣ�"+f.length()+"�ֽ�");
		out.write(b);		//д������
		out.close();		//�ر������
		
		
		
//������ �Ǵ��ļ������ȡ
		@SuppressWarnings("resource")
		InputStream in = new FileInputStream(f);		//FileInputStream��InputStream�����࣬�ֽ�������
		while( (n=in.read(a,0,10)) != -1) {				//��0��10
			String s = new String(a,0,n);
			System.out.println(s);
		}
		
	}
}
