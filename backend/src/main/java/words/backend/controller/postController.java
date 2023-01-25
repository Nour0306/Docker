package words.backend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;
import words.backend.model.Post;
import words.backend.repo.postRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE}, allowedHeaders = {"Content-Type"})
@RestController
public class postController {

    private final Logger log = LoggerFactory.getLogger(postController.class);

    @Autowired
    private postRepo postsrepo;

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/posts")
    public List getPosts(HttpServletResponse response) {

        // Test the connection to MongoDB
        List<Post> testData = mongoTemplate.findAll(Post.class);
        log.info("Test data from MongoDB: {}", testData);

        List<Post> allpost = postsrepo.findAll();
        log.info("Retrieved posts: {}", allpost);
        return  allpost;
    }


    @PostMapping("/posts")
    public Post addpost(@RequestBody Post postadded){return postsrepo.save(postadded); }
}