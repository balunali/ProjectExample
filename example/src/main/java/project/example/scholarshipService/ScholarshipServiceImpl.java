package project.example.scholarshipService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.example.scholarshipEntity.Scholarship;
import project.example.scholarshipRepository.ScholarshipRepository;

import java.util.List;
@Service
public class ScholarshipServiceImpl {
    @Autowired
    private ScholarshipRepository scholarshipRepository;

    public List<Scholarship> getAllScholarships() {
        return scholarshipRepository.findAll();
    }

    public Scholarship createScholarship(Scholarship scholarship) {
        return scholarshipRepository.save(scholarship);
    }

}
