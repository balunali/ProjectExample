package project.example.hallofFameRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.example.hallOfFameEntity.HallOfFame;

public interface HallOfFameRepository extends JpaRepository<HallOfFame,Long> {

}
