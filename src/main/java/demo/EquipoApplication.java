package demo;

import demo.Model.League;
import demo.Service.LeagueService;
import demo.Service.PlayerService;
import demo.Service.SeasonService;
import demo.Service.TeamService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EquipoApplication {

    public static void main(String[] args) {
      ConfigurableApplicationContext context = SpringApplication.run(EquipoApplication.class, args);
        LeagueService leagueService=context.getBean(LeagueService.class);
        leagueService.CrearLiga();
        SeasonService seasonService=context.getBean(SeasonService.class);
        seasonService.CrearTemp();
        TeamService teamService=context.getBean(TeamService.class);
        teamService.crearEquipos();
        teamService.demoTemporada();
        teamService.preguntas();
        PlayerService playerService = context.getBean(PlayerService.class);
        playerService.testPlayer();




    }
}
