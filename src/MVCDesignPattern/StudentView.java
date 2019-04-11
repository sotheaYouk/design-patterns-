package MVCDesignPattern;

public class StudentView {

	public void studentDetail(StudentModel studentModel)
	{
		System.out.println("ID: "+studentModel.getId());
		System.out.println("Name: "+studentModel.getName());
		
	}
}
