package demo.Repository;


import demo.Model.Player;
import demo.Service.PlayerService;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface PlayerRepository  extends PagingAndSortingRepository<Player,Long> {

    public List<Player> findByNameContaining (String name);
    public List<Player> findByNumcanGreaterThan (int numcan);
    public List<Player> findByAsisBetween (int asis1 , int asis2);
    public List<Player> findByPosiContaining (String posi);
    public List<Player> findByBirthdayLessThan (Date Birthday);
    public List<Player> findByNumcanGreaterThanAndBirthdayBefore (int numcan,Date Birthday);
    public List<Player> findByTeamName (String name);
    public List<Player> findByTeamNameAndPosi (String name,String posi);
    public List<Player> findFirstByOrderByNumcanDesc();
    public List<Player> findFirst5ByOrderByAsisDesc();

    @Query("SELECT p FROM Player p where p.team.name = :teamName order by p.numcan desc")
    List<Player> findPlayerOrderByScoreFromTeam(@Param("teamName")String teamName);
}

