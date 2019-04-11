package MVCDesignPattern;

public class StudentController {
	
	private StudentModel studentModel;
	private StudentView studentView;
	
	public StudentController(StudentModel studentModel, StudentView studentView) {
		this.studentModel = studentModel;
		this.studentView = studentView;
	}
	
	public void setStudentId(int id)
	{
		studentModel.setId(id);
	}
	
	public void setStudentName(String name)
	{
		studentModel.setName(name);
	}
	
	public int getStudentId()
	{
		return studentModel.getId();
	}
	
	public String getStudentName()
	{
		return studentModel.getName();
	}
	
	
	public void updateView()
	{
		studentView.studentDetail(studentModel);
	}

	
	

}
