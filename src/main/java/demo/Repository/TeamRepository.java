package demo.Repository;

import demo.Model.Team;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface TeamRepository extends PagingAndSortingRepository <Team,Long>{

    public Team findByNameContaining (String name);
    public Team findByLocal (String local);



    Team findByName(String name);
}
