package StudentsRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import StudentsEntity.Students;


public interface StudentsnamesRepository extends JpaRepository<Students , Long> {

	

}