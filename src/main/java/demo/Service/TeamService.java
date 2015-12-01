package demo.Service;

import demo.Model.Season;
import demo.Model.Team;
import demo.Repository.SeasonRepository;
import demo.Repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Calendar;


@Service
@Transactional

public class TeamService {

    @Autowired
    private PlayerService playerService;
    @Autowired
    private TeamRepository teamRepository;
    @Autowired
    private SeasonRepository seasonRepository;

    Calendar cal=Calendar.getInstance();
    public void crearEquipos (){
        Team team1 = new Team();
        cal.set(1886, Calendar.JANUARY, 25);
        team1.setCreacion(cal.getTime());
        team1.setName("Los Puyol");
        team1.setLocal("Puyolandia");
        teamRepository.save(team1);

        Team team2 = new Team();
        cal.set(1906, Calendar.JULY, 25);
        team2.setCreacion(cal.getTime());
        team2.setName("Los Burlaos");
        team2.setLocal("Rolling Squad");
        teamRepository.save(team2);

        Team team3 = new Team();
        cal.set(1902, Calendar.SEPTEMBER, 07);
        team3.setCreacion(cal.getTime());
        team3.setName("Los Chunguitos");
        team3.setLocal("Dame Veneno");
        teamRepository.save(team3);

        Team team4 = new Team();
        cal.set(1902, Calendar.SEPTEMBER, 07);
        team4.setCreacion(cal.getTime());
        team4.setName("Los Pantoja");
        team4.setLocal("Cantora");
        teamRepository.save(team4);

        Team team5 = new Team();
        cal.set(1909, Calendar.FEBRUARY, 17);
        team5.setCreacion(cal.getTime());
        team5.setName("Willyrex");
        team5.setLocal("Vegetta777");
        teamRepository.save(team5);
    }


   public void demoTemporada(){

       Season season1 = seasonRepository.findByYear(2015);

        season1.getTeams().add(teamRepository.findByName("Los Pantoja"));
        seasonRepository.save(season1);

       season1.getTeams().add(teamRepository.findByName("Willyrex"));
       seasonRepository.save(season1);

       season1.getTeams().add(teamRepository.findByName("Los Chunguitos"));
       seasonRepository.save(season1);


    }
    public void preguntas(){

        System.out.println("PRIIIIIMERRRAAA KUERRRRRII"+teamRepository.findByLocal("Cantora"));

    }

}
