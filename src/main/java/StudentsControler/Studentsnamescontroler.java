package StudentsControler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import StudentsEntity.Students;
import StudentsService.StudentsService;




@RestController
public class Studentsnamescontroler {

	@Autowired
	private StudentsService studentsService;

	@PostMapping(path = "/students")
	public ResponseEntity<Students> createEmployee(@RequestBody Students students) {
		return new ResponseEntity<>(studentsService.createStudents(students), HttpStatus.CREATED);
	}

	@PutMapping(path = "/students")
	public ResponseEntity<Students> updateStudents(@RequestBody Students students) {
		return new ResponseEntity<>(studentsService.updateStudents(students), HttpStatus.CREATED);
	}

	@DeleteMapping( path = "/students/{studentsId}")
	public ResponseEntity<String> deleteStudents(@PathVariable(value="studentsId") Long studentsId) {
		studentsService.deleteStudents(studentsId);
		return new ResponseEntity<>("Students with StudentsId : " + studentsId + " deleted successfully", HttpStatus.OK);
	}

	@GetMapping(path = "/students/{studentsId}")
	public ResponseEntity<Students> getEmployee(@PathVariable(value = "studentsId") Long studentsId) {
		return new ResponseEntity<>(studentsService.getStudents(studentsId), HttpStatus.OK);
	}

	@GetMapping(path = "/students")
	public ResponseEntity<List<Students>> getAllStudents() {
		return new ResponseEntity<>(studentsService.getAllStudents(), HttpStatus.OK);
	}


}