package �ӿڰ�;
//4.30
import java.util.ArrayList;
import java.util.Iterator;

public class ������������ {
	public static void main(String []args) {
		
		char word = 64;
		ArrayList<String> al = new ArrayList<>();
		for(int i=0; i<5; i++) {
			word++;
			al.add(word+" ");
		}
		
		//���ص�����
		Iterator<String> it = al.iterator();
		
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
		}
	}
}
