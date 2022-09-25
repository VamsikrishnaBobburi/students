package StudentsService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import StudentsEntity.Students;
import StudentsRepository.StudentsnamesRepository;





@Service
public abstract class StudentsImpl implements StudentsService {

	@Autowired
	private StudentsnamesRepository studentsnamesRepository;

	@Override
	public Students createStudents(Students students) {
		return studentsnamesRepository.save(students);
	}

	@Override
	public Students updateStudents(Students students) {
		return studentsnamesRepository.save(students);
	}

	@Override
	public Students getStudents(Long studentsId) {
		Optional<Students> optionastudents = studentsnamesRepository.findById(studentsId);
		if(optionastudents.isPresent()) {
			return optionastudents.get();
		}
		return null;
	}

	@Override
	public void deleteStudents(Long studentsId) {
		studentsnamesRepository.deleteById(studentsId);
	}

	@Override
	public List<Students> getAllStudents() {
		return studentsnamesRepository.findAll();
	}
}