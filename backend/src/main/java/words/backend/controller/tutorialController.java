package words.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import words.backend.model.Tutorial;
import words.backend.repo.tutorialRepo;

import java.util.List;


@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE}, allowedHeaders = {"Content-Type"})
@RestController
public class tutorialController {
    @Autowired
    private tutorialRepo tutoRepo;

    @GetMapping("/tutorials")
    public List getTutorials() {
        List<Tutorial> alltutorials = tutoRepo.findAll();
        return  alltutorials;
    }

    @PostMapping("/tutorials")
    public Tutorial addTutorial(@RequestBody Tutorial tutorialadded){return tutoRepo.save(tutorialadded); }
}
