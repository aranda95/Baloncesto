package demo.Repository;


import demo.Model.League;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface LeagueRepository extends PagingAndSortingRepository<League,Long> {
        public League findByNameLike(String name);

}

