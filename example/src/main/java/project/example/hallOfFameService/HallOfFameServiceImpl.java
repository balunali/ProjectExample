package project.example.hallOfFameService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.example.hallOfFameEntity.HallOfFame;
import project.example.hallofFameRepository.HallOfFameRepository;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class HallOfFameServiceImpl {

    @Autowired
    private HallOfFameRepository hallOfFameRepository;

    // Create a new Hall of Fame record
    public HallOfFame createHallOfFame(HallOfFame hallOfFame) {
        return hallOfFameRepository.save(hallOfFame);
    }

    // Get all Hall of Fame records
    public List<HallOfFame> getAllHallOfFames() {
        return hallOfFameRepository.findAll();
    }
}
