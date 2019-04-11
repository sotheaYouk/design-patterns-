package MVCDesignPattern;

public class Main {

	public static void main(String[] args) {
		
		StudentModel student = new StudentModel();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(student, view);
		
		controller.setStudentId(123);
		controller.setStudentName("Sothea");
		
		System.out.println(controller.getStudentId());
		
		controller.updateView();

	}

}
