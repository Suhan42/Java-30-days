package ����_�����;
//5.28
import java.io.File;
import java.io.IOException;

public class �ļ����� {
	public static void main(String[] args) {
		File f = new File("D:\\workspace\\test","example.txt");
		if(f.exists()) {
			System.out.println(f.getName()+"�ǿɶ�����"+f.canRead());
			System.out.println(f.getName()+"�ĳ��ȣ�"+f.length());
			System.out.println(f.getName()+"�ľ���·����"+f.getAbsolutePath());
		}
		
		File f2 = new File("new.txt");
		try {
			f2.createNewFile();		//�������ļ�
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		if(f2.exists()) 
			System.out.println(f2.getName()+"�ǿɶ�����"+f2.canRead());
		f2.delete();		//ɾ���ļ�
		if(!f2.exists()) 
			System.out.println(f2.getName()+"������");
		
		
		
//�򿪼��±�
		Runtime ce = Runtime.getRuntime();
		File n = new File("C:/windows","Notepad.exe");
		try {
			ce.exec(n.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
