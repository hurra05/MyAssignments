package studentinfo;

public class StudentDetails {
	//Class: Students
	  //    Methods: getStudentInfo()

	//Description: 
	//Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
public void getStudentInfo(int Id) {
	
	System.out.println("my Id "+ Id );
}
	public void getStudentInfo(int Id,String Name) {
		System.out.println("my ID is  "+ Id+" Name "+Name);
	}
	public void getStudentInfo(String email, long phNo) {
	
	 System.out.println("My email id is "+email+" My phone number is "+phNo);
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails obj =new StudentDetails();
		obj.getStudentInfo(123321);
		obj.getStudentInfo(326541,"Ibrahim");
		obj.getStudentInfo("ibrahim@1gmail.com", 1234567890);

	}

}