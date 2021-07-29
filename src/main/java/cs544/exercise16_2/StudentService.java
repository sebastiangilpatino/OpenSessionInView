package cs544.exercise16_2;

public class StudentService {
	private StudentDAO studentdao;

	public StudentService() {
		studentdao = new StudentDAO();
	}

	public Student getStudent(long studentid) {
		// Transaction tx = sessionFactory.getCurrentSession().beginTransaction();
		Student student = studentdao.load(studentid);
		// tx.commit();
		return student;
	}
}
