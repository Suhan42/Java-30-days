package eg;
//5.18


/*�е�����*/


//�������ݽӿں�������е�
public  class Student implements Comparable<Student>{		//ʵ�ֽӿڣ���֤��Ȼ˳��
	private String id;
	private String name;
	
	public Student() {}
	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	//��д
	public int compareTo(Student arg0) {
		return this.name.compareTo(arg0.getName());
	}

//	public int compareTo(String arg0) {
//		return this.name.compareTo(arg0);
//	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}	
	
	@Override
	public boolean equals(Object arg0) {
		return this.id.equals( ((Student)arg0).getId() );
	}
	
}
