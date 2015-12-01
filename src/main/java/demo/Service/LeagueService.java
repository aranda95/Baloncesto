package demo.Service;


import demo.Model.League;
import demo.Model.Season;
import demo.Repository.LeagueRepository;
import demo.Repository.SeasonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class LeagueService {

    @Autowired
    private LeagueRepository leagueRepository ;

    public void CrearLiga (){

        League league1 = new League();
        league1.setName("LigaACB");
        leagueRepository.save(league1);


    }
}
