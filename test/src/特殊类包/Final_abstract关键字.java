package �������;
//4.25
public class Final_abstract�ؼ��� {
	public static void main(String []args) {
		//final����
		final String a = "19510187956";
		Si SIM = new Mobile();
		SIM.setNumber(a);
		System.out.println(SIM.giveN() );
		System.out.println(SIM.giveCorpName() );
	}
}

//������
abstract class Si{
	/* 1.������ new ���������󣬵����Խ�������� ��ת�Ͷ���ʹ�����ࣩ
	 * 2.��������������г��󷽷���abstract������,Ҳ����û��
	  * ������󷽷�û�й���
	 */
	public abstract void setNumber(String n);
	public abstract String giveN();
	public abstract String giveCorpName();
}

//final�� ���ܱ��̳У������������ࣩ
final class Mobile extends Si{
	String number;
	
	//final���� ���ܱ�������д��ֻ�ܼ̳�
	public final void setNumber(String n) {
		number = n;
	}
	@Override
	public final String giveN() {
		return number;
	}
	@Override
	public final String giveCorpName() {
		return "�й��ƶ�";
	}
}

//final�� ���ܱ��̳У������������ࣩ
final class Unicom extends Si{
	String number;
	
	//final���� ���ܱ�������д��ֻ�ܼ̳�
	public final void setNumber(String n) {
		number = n;
	}
	@Override
	public final String giveN() {
		return number;
	}
	@Override
	public final String giveCorpName() {
		return "�й���ͨ";
	}
}
