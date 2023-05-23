package methodoverloadandoverrideExample;

public class Students {

	public void getStudentInfo(int id, String name) {
		System.out.println("Student Id is : " + id);
        System.out.println("Student Name is : " +name);
	}
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Student EmailId is :" +email);
		System.out.println("Student PhoneNumber is : " +phoneNumber);
	}
	public static void main(String[] args) {
		Students student = new Students();
		student.getStudentInfo(1234, "Mahalakshmi.S");
		student.getStudentInfo("maha123@gmail.com", 1234567890L);
	}

}
