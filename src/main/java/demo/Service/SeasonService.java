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
public class SeasonService {

@Autowired
private SeasonRepository seasonRepository ;

    @Autowired
    private LeagueRepository leagueRepository ;

public void CrearTemp (){

    League league1 = leagueRepository.findByNameLike("LigaACB");

            Season season1 = new Season();
            season1.setName("LigaACB");
            season1.setYear(2015);
            season1.setLeague(league1);
            seasonRepository.save(season1);


}

}
