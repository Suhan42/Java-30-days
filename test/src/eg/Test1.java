package eg;
//5.18
import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		Student[] stu = new Student[4];
		stu[0] = new Student("1234", "go");
		stu[1] = new Student("5432", "tom");
		stu[2] = new Student("1432", "python");
		stu[3] = new Student("2353", "web");

		//����
		Arrays.sort(stu);
		for(Student s:stu) {
			System.out.println(s);		//��Ȼ�ŵ���һ�����󣬵��������Զ����� toString
		}
		
		//�е�
		System.out.println(stu[0].equals(stu[3]));
	}
}
