package words.backend.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import words.backend.model.Post;

@Repository
public interface postRepo extends MongoRepository<Post, String> {
}