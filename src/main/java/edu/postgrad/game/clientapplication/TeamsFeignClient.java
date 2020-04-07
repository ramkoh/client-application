package edu.postgrad.game.clientapplication;

import java.util.List;

import com.edu.postgrad.game.common.Player;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "teams-service")
public interface TeamsFeignClient {

    @GetMapping("players")
    List<Player> getAllPlayers();
}
