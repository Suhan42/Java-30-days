package �������;
//5.14
public class ���� {
//���Ե�ʱ������
	
	public static void main(String[] args) {
		int [] score= {12, 200, 12, -12};
		int sum=0;
		for(int number:score) {
			//���ԣ�������ʱ������
			//Run Configurations/Arguments/VM arguments: -ea��������
			assert number > 0:"�����Ǹ���";		//����
			sum = sum+number;
		}
		System.out.println(sum);
	}

}
