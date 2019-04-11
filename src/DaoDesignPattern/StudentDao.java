package DaoDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentDao implements Dao<Student>
{
	//create a list of student for the student class
	List<Student> studentlist = new ArrayList<Student>();
	
	//add students to the list using constructor of StudentDao class
	public StudentDao ()
	{
		studentlist.add(new Student(123, "Sothea"));
		studentlist.add(new Student(585, "Vinly"));
	}

	@Override
	public List<Student> getAll() {
		
		return studentlist;
	}

	@Override
	public Student getId(int id) {
		return studentlist.get(id) ;
	}

	@Override
	public void insert(Student student) {
		studentlist.add(student);
		
	}

	@Override
	public void delete(Student student) {
		studentlist.remove(student);
		
	}
	

}
