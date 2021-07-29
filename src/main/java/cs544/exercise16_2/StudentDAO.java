package cs544.exercise16_2;

import org.hibernate.SessionFactory;

public class StudentDAO {

	// private Collection<Student> studentlist = new ArrayList<Student>();
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public StudentDAO() {
		/*
		 * Student student = new Student(11334, "Frank", "Brown"); Course course1 = new
		 * Course("Java", "A"); Course course2 = new Course("Math", "B-");
		 * student.addCourse(course1); student.addCourse(course2);
		 * 
		 * sessionFactory.getCurrentSession().save(student);
		 */
	}

	public Student load(long studentid) {

		return (Student) sessionFactory.getCurrentSession().get(Student.class, studentid);
	}
}
