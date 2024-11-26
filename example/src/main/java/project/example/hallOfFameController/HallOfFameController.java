package project.example.hallOfFameController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.example.hallOfFameEntity.HallOfFame;
import project.example.hallOfFameService.HallOfFameServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/college/hall-of-fame")
public class HallOfFameController {

    @Autowired
    private HallOfFameServiceImpl hallOfFameService;

    @PostMapping
    public ResponseEntity<HallOfFame> createHallOfFame(@RequestBody HallOfFame hallOfFame) {
        HallOfFame hall=hallOfFameService.createHallOfFame(hallOfFame);
        return new ResponseEntity<>(hall,HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<HallOfFame>> getAllHallOfFames() {
        List<HallOfFame> hallOfFameLists=hallOfFameService.getAllHallOfFames();
        return new ResponseEntity<>(hallOfFameLists,HttpStatus.OK);
    }
}
