package edu.postgrad.game.clientapplication;

import java.util.List;

import com.edu.postgrad.game.common.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    TeamsFeignClient teamsFeignClient;

    @GetMapping("client-application/test")
    public ResponseEntity<String> testMethod(){
       return new ResponseEntity<>("Raman", HttpStatus.OK);
    }

   @GetMapping("client-application/players")
    public List<Player> getAllPlayersFromTeamService(){
        return teamsFeignClient.getAllPlayers();
   }
}
