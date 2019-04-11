package DaoDesignPattern;

import java.util.List;

public class Main {
	public static void main(String[] args)
	{
		//create an obj for studentDao class
		Dao<Student> studentDao = new StudentDao();
		
		//call getAll() and store the returned data in "list"
		List<Student> list = studentDao.getAll();
		System.out.println(list);
		
		//get a single user by index of the array
		Student student = studentDao.getId(1);
		System.out.println(student);
		
		//insert a new student 
		studentDao.insert(new Student(849,"Sakona"));
		System.out.println(list);
		
		//delete a student(1) 
		studentDao.delete(student);
		System.out.println(list);

		
	}
	
}
