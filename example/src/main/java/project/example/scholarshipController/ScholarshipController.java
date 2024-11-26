package project.example.scholarshipController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.example.scholarshipEntity.Scholarship;
import project.example.scholarshipService.ScholarshipServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/college/scholarships")
public class ScholarshipController {
    @Autowired
    private ScholarshipServiceImpl scholarShipService;

    @GetMapping
    public ResponseEntity<List<Scholarship>> getAllScholarships(){
        List<Scholarship> scholarshipList=scholarShipService.getAllScholarships();
        return new ResponseEntity<>(scholarshipList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Scholarship> createScholarship(@RequestBody Scholarship scholarship){
        Scholarship scholarship1=scholarShipService.createScholarship(scholarship);
        return new ResponseEntity<>(scholarship1,HttpStatus.CREATED);
    }
}
