package demo.Controller;


import demo.Exception.PlayerException;
import demo.Model.Player;
import demo.Model.Team;
import demo.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Player save(@RequestBody Player player) { return playerRepository.save(player);
    }
    @RequestMapping(method= RequestMethod.GET)
    public List<Player> findAll() {
        List<Player> players = new ArrayList<Player>();
        Iterator<Player> iterator = playerRepository.findAll().iterator();

        while (iterator.hasNext()) {
            players.add(iterator.next());
        }

        return players;
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id) {
        Player player = playerRepository.findOne(id);

        if(player == null){throw new PlayerException(id);}

        playerRepository.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Player updateById(@PathVariable Long id, @RequestBody Player player) {
        Player p1 = playerRepository.findOne(id);

        if(p1 == null){throw new PlayerException(id);}

        return playerRepository.save(player);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Player getById(@PathVariable Long id) {
        Player p1 = playerRepository.findOne(id);

        if(p1 == null){throw new PlayerException(id);}

        return p1;
    }

    @RequestMapping(value = "/{idPlayer}/team/{idTeam}", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Player addPlayer(@PathVariable Long idPlayer, @RequestBody Player player) {
        if (playerRepository.findOne(idPlayer) == null) throw new PlayerException(idPlayer);
        return playerRepository.save(player);
    }


    @RequestMapping(value ="/{idPlayer}/team", method = RequestMethod.GET)
    public Player getByTeam(@PathVariable Long idPlayer) {
        Player p1 = playerRepository.findOne(idPlayer);

        if(p1 == null){throw new PlayerException(idPlayer);}

        return p1;

    }

}
