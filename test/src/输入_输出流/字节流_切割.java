package ����_�����;
//6.1
import java.io.*;

public class �ֽ���_�и� {

	public static void main(String[] args) {
		int bufSize = 1024*100; //1024����1k�������100
		byte[] buf = new byte[bufSize];
		InputStream in = null;
		OutputStream out = null;
		int len = -1;
		int count;

		
	//�и�
		try {
			in = new FileInputStream("./demo\\src\\233.rar");
			count = 1;
			while((len = in.read(buf)) != -1) {
				out = new FileOutputStream("./demo\\des\\2."+count);
				out.write(buf, 0 ,len);
				out.close();
				count++;
			}
			in.close();
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("�и� Success");
		

		
	//�ϲ�
		try {
			count = 1;
			out = new FileOutputStream("./demo\\back.rar");
			
			while(count<=8) {
				in = new FileInputStream("./demo\\des\\2."+count);
				len = in.read(buf);
				out.write(buf, 0 ,len);
				
				in.close();
				count++;
			}
			out.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("�ϲ� Success");

		
	}

}
