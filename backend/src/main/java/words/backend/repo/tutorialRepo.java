package words.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import words.backend.model.Tutorial;

@Repository
public interface tutorialRepo extends JpaRepository<Tutorial, Integer> {

}
