package ����_�����;
//6.1
import java.io.*;

public class �ֽ���_���� {

	//��һ���ļ���������һ���ļ�
	public static void main(String[] args) {
		int bufSize = 1024;
		byte[] buf = new byte[bufSize];
		InputStream in = null;
		OutputStream out = null;
		int len = -1;
		
		try {
			in = new FileInputStream("./demo\\src\\233.rar");
			out = new FileOutputStream("./demo\\des\\3.rar");//�����Զ������ļ���
			
			long start = System.currentTimeMillis();//��ʱ��
			
			while( (len = in.read(buf)) != -1) {
				out.write(buf, 0, len);
			}
			
			in.close();
			out.close();
			
			long elapse = System.currentTimeMillis()-start;
			
			System.out.println("Success, what it space time is:"+elapse);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
