package demo.Service;

import demo.Model.Player;
import demo.Model.Team;
import demo.Repository.PlayerRepository;
import demo.Repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.Date;

@Service
@Transactional

public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private TeamRepository teamRepository;

    public void testPlayer() {

        Calendar cal=Calendar.getInstance();
        Team team1 = teamRepository.findByNameContaining("Puyol");
        Team team2 = teamRepository.findByNameContaining("Burlaos");
        Team team3 = teamRepository.findByNameContaining("Chunguitos");
        Team team4 = teamRepository.findByNameContaining("Pantoja");
        Team team5 = teamRepository.findByNameContaining("Willyrex");

        Player player1 = new Player();
        cal.set(1983, Calendar.FEBRUARY, 2);
        player1.setBirthday(cal.getTime());
        player1.setName("Luis");
        player1.setNumcan(25);
        player1.setAsis(12);
        player1.setRebo(3);
        player1.setPosi("Base");
        player1.setTeam(team1);
        playerRepository.save(player1);

        Player player2 = new Player();
        cal.set(1989, Calendar.JANUARY, 18);
        player2.setBirthday(cal.getTime());
        player2.setName("Alex");
        player2.setNumcan(14);
        player2.setAsis(7);
        player2.setRebo(18);
        player2.setPosi("Pivot");
        player2.setTeam(team3);
        playerRepository.save(player2);

        Player player3 = new Player();
        cal.set(1987, Calendar.JULY, 18);
        player3.setBirthday(cal.getTime());
        player3.setName("Cristiaaan");
        player3.setNumcan(14);
        player3.setAsis(7);
        player3.setRebo(18);
        player3.setPosi("Pivot");
        player3.setTeam(team2);
        playerRepository.save(player3);

        Player player4 = new Player();
        cal.set(1982, Calendar.SEPTEMBER, 19);
        player4.setBirthday(cal.getTime());
        player4.setName("Miguel");
        player4.setNumcan(12);
        player4.setAsis(8);
        player4.setRebo(19);
        player4.setPosi("Pivot");
        player4.setTeam(team4);
        playerRepository.save(player4);

        Player player5 = new Player();
        cal.set(1986, Calendar.JANUARY, 19);
        player5.setBirthday(cal.getTime());
        player5.setName("Josemi");
        player5.setNumcan(38);
        player5.setAsis(12);
        player5.setRebo(5);
        player5.setPosi("Ala-Pivot");
        player5.setTeam(team5);
        playerRepository.save(player5);

        Player player6 = new Player();
        cal.set(1986, Calendar.FEBRUARY, 19);
        player6.setBirthday(cal.getTime());
        player6.setName("Barcenas");
        player6.setNumcan(8);
        player6.setAsis(2);
        player6.setRebo(6);
        player6.setPosi("Ala-Pivot");
        player6.setTeam(team1);
        playerRepository.save(player6);

        Player player7 = new Player();
        cal.set(1996, Calendar.JANUARY, 17);
        player7.setBirthday(cal.getTime());
        player7.setName("Rato");
        player7.setNumcan(23);
        player7.setAsis(12);
        player7.setRebo(7);
        player7.setPosi("Pivot");
        player7.setTeam(team1);
        playerRepository.save(player7);

        Player player8 = new Player();
        cal.set(1986, Calendar.MARCH, 9);
        player8.setBirthday(cal.getTime());
        player8.setName("Rajoy");
        player8.setNumcan(9);
        player8.setAsis(12);
        player8.setRebo(9);
        player8.setPosi("Base");
        player8.setTeam(team1);
        playerRepository.save(player8);

        Player player9 = new Player();
        cal.set(1990, Calendar.MARCH, 6);
        player9.setBirthday(cal.getTime());
        player9.setName("JuanCarlos");
        player9.setNumcan(18);
        player9.setAsis(9);
        player9.setRebo(2);
        player9.setPosi("Ala-Pivot");
        player9.setTeam(team1);
        playerRepository.save(player9);

        Player player10 = new Player();
        cal.set(1982, Calendar.JULY, 4);
        player10.setBirthday(cal.getTime());
        player10.setName("NegroBurlao");
        player10.setNumcan(38);
        player10.setAsis(12);
        player10.setRebo(5);
        player10.setPosi("Ala-Pivot");
        player10.setTeam(team2);
        playerRepository.save(player10);

        Player player11 = new Player();
        cal.set(1986, Calendar.JANUARY, 19);
        player11.setBirthday(cal.getTime());
        player11.setName("Encocao");
        player11.setNumcan(21);
        player11.setAsis(11);
        player11.setRebo(16);
        player11.setPosi("Pivot");
        player11.setTeam(team2);
        playerRepository.save(player11);

        Player player12 = new Player();
        cal.set(1991, Calendar.JUNE, 2);
        player12.setBirthday(cal.getTime());
        player12.setName("Cuco");
        player12.setNumcan(38);
        player12.setAsis(12);
        player12.setRebo(5);
        player12.setPosi("Base");
        player12.setTeam(team2);
        playerRepository.save(player12);

        Player player13 = new Player();
        cal.set(1993, Calendar.JUNE, 22);
        player13.setBirthday(cal.getTime());
        player13.setName("ChukiCieza");
        player13.setNumcan(13);
        player13.setAsis(11);
        player13.setRebo(3);
        player13.setPosi("Alero");
        player13.setTeam(team2);
        playerRepository.save(player13);

        Player player14 = new Player();
        cal.set(1991, Calendar.AUGUST, 28);
        player14.setBirthday(cal.getTime());
        player14.setName("Juan");
        player14.setNumcan(8);
        player14.setAsis(12);
        player14.setRebo(9);
        player14.setPosi("Ala-Pivot");
        player14.setTeam(team3);
        playerRepository.save(player14);

        Player player15 = new Player();
        cal.set(1981, Calendar.JUNE, 11);
        player15.setBirthday(cal.getTime());
        player15.setName("Jose");
        player15.setNumcan(18);
        player15.setAsis(15);
        player15.setRebo(18);
        player15.setPosi("Pivot");
        player15.setTeam(team3);
        playerRepository.save(player15);

        Player player16 = new Player();
        cal.set(1978, Calendar.JANUARY, 20);
        player16.setBirthday(cal.getTime());
        player16.setName("Encarna");
        player16.setNumcan(21);
        player16.setAsis(7);
        player16.setRebo(2);
        player16.setPosi("Base");
        player16.setTeam(team3);
        playerRepository.save(player16);

        Player player17 = new Player();
        cal.set(1991, Calendar.JUNE, 2);
        player17.setBirthday(cal.getTime());
        player17.setName("Toñi");
        player17.setNumcan(8);
        player17.setAsis(2);
        player17.setRebo(0);
        player17.setPosi("Alero");
        player17.setTeam(team3);
        playerRepository.save(player17);

        Player player18 = new Player();
        cal.set(1991, Calendar.APRIL, 2);
        player18.setBirthday(cal.getTime());
        player18.setName("Pakirrin");
        player18.setNumcan(0);
        player18.setAsis(0);
        player18.setRebo(0);
        player18.setPosi("Base");
        player18.setTeam(team4);
        playerRepository.save(player18);

        Player player19 = new Player();
        cal.set(1992, Calendar.AUGUST, 2);
        player19.setBirthday(cal.getTime());
        player19.setName("Chabelita");
        player19.setNumcan(1);
        player19.setAsis(1);
        player19.setRebo(2);
        player19.setPosi("Alero");
        player19.setTeam(team4);
        playerRepository.save(player19);

        Player player20 = new Player();
        cal.set(1971, Calendar.APRIL, 22);
        player20.setBirthday(cal.getTime());
        player20.setName("Isabel");
        player20.setNumcan(5);
        player20.setAsis(17);
        player20.setRebo(8);
        player20.setPosi("Carcel");
        player20.setTeam(team4);
        playerRepository.save(player20);

        Player player21 = new Player();
        cal.set(1961, Calendar.FEBRUARY, 18);
        player21.setBirthday(cal.getTime());
        player21.setName("JulianMuñoz");
        player21.setNumcan(7);
        player21.setAsis(11);
        player21.setRebo(6);
        player21.setPosi("Marbella");
        player21.setTeam(team4);
        playerRepository.save(player21);

        Player player22 = new Player();
        cal.set(1991, Calendar.FEBRUARY, 18);
        player22.setBirthday(cal.getTime());
        player22.setName("ElRubius");
        player22.setNumcan(7);
        player22.setAsis(11);
        player22.setRebo(6);
        player22.setPosi("Pivot");
        player22.setTeam(team5);
        playerRepository.save(player22);

        Player player23 = new Player();
        cal.set(1961, Calendar.FEBRUARY, 18);
        player23.setBirthday(cal.getTime());
        player23.setName("Wismichu");
        player23.setNumcan(16);
        player23.setAsis(15);
        player23.setRebo(9);
        player23.setPosi("Alero");
        player23.setTeam(team5);
        playerRepository.save(player23);

        Player player24 = new Player();
        cal.set(1991, Calendar.SEPTEMBER, 18);
        player24.setBirthday(cal.getTime());
        player24.setName("Vegettaaa");
        player24.setNumcan(9);
        player24.setAsis(11);
        player24.setRebo(8);
        player24.setPosi("Base");
        player24.setTeam(team5);
        playerRepository.save(player24);

        Player player25 = new Player();
        cal.set(1993, Calendar.FEBRUARY, 7);
        player25.setBirthday(cal.getTime());
        player25.setName("ElMahe");
        player25.setNumcan(11);
        player25.setAsis(9);
        player25.setRebo(6);
        player25.setPosi("Pivot");
        player25.setTeam(team5);
        playerRepository.save(player25);

        Player player26 = new Player();
        cal.set(1983, Calendar.FEBRUARY, 10);
        player26.setBirthday(cal.getTime());
        player26.setName("PruebaControler");
        player26.setNumcan(11);
        player26.setAsis(9);
        player26.setRebo(6);
        player26.setPosi("Pivot");
         playerRepository.save(player26);

        System.out.println(playerRepository.findByNameContaining("Mig"));
        System.out.println(playerRepository.findByNumcanGreaterThan(23));
        System.out.println(playerRepository.findByAsisBetween(2, 15));
        System.out.println(playerRepository.findByPosiContaining("Ala-Pivot"));
        cal.set(1990, Calendar.JANUARY, 19);
        System.out.println(playerRepository.findByBirthdayLessThan(cal.getTime()));
        System.out.println(playerRepository.findByNumcanGreaterThanAndBirthdayBefore(18, cal.getTime()));

        System.out.println("SEGUNDAAAAA KUERRRRRII" + playerRepository.findByTeamName("Los Chunguitos"));
        System.out.println("TERCERO KUERRRRRII" + playerRepository.findByTeamNameAndPosi("Los Chunguitos", "Pivot"));
        System.out.println("CUARTA KUERIIII" + playerRepository.findFirstByOrderByNumcanDesc());
        System.out.println("KINTA KUERIIII" + playerRepository.findFirst5ByOrderByAsisDesc());
        System.out.println("SEXTA KUERIIII" + playerRepository.findPlayerOrderByScoreFromTeam("Los Burlaos").get(0));


    }
}
