package StudentsService;

import java.util.List;

import StudentsEntity.Students;

public interface StudentsService {

	

	Students updateStudents(Students students);

	Students getStudents(Long studentsId);

	void deleteStudents(Long studentsId);

	List<Students> getAllStudents();

	Students createStudents(Students students);

}
