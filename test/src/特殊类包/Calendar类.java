package �������;
//5.25

import java.util.Calendar;
import java.util.GregorianCalendar;

/* �����࣬��̭��Date
 * �������һ��������
 * ���Բ��� new
*/
public class Calendar�� {
	public static void main(String[] args) {
		//������������ʼ������һ��
		Calendar ca1 = Calendar.getInstance();
		@SuppressWarnings("unused")
		Calendar ca2 = new GregorianCalendar();
		
		int year = ca1.get(Calendar.YEAR);
		int month = ca1.get(Calendar.MONDAY)+1;	//0��һ�µ�����11��ʾʮ����
		int day = ca1.get(Calendar.DATE);		//���DATE��ʵ��DAY_OF_MONTHһ��Ч����ͬ������
		@SuppressWarnings("unused")
		int day2 = ca1.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = ca1.get(Calendar.DAY_OF_WEEK)-1;	//1��ʾ���գ�7��ʾ����
		int dayOfYear = ca1.get(Calendar.DAY_OF_YEAR);
		int weekOfMonth = ca1.get(Calendar.WEEK_OF_MONTH);
		int weekOfYear = ca1.get(Calendar.WEEK_OF_YEAR);
		@SuppressWarnings("unused")
		int hour = ca1.get(Calendar.HOUR);			//12Сʱ��
		int hour2 = ca1.get(Calendar.HOUR_OF_DAY);	//24Сʱ��
		
		int minute = ca1.get(Calendar.MINUTE);
		int sec = ca1.get(Calendar.SECOND);
		
		System.out.println(year+"��"+0+month+"��"+day+"�գ�������"+dayOfWeek);
		System.out.println("������"+hour2+":"+minute+":"+sec);
		System.out.println("�����ǽ���ĵ�"+dayOfYear+"�죬\n����������µĵ�"+weekOfMonth+"�ܣ��ǽ���ĵ�"+weekOfYear+"��");
	}
}
