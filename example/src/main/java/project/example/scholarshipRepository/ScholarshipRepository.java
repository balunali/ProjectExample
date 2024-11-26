package project.example.scholarshipRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.example.scholarshipEntity.Scholarship;

public interface ScholarshipRepository extends JpaRepository<Scholarship,Long> {
}
