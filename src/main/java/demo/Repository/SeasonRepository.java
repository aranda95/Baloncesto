package demo.Repository;


import demo.Model.Season;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SeasonRepository extends PagingAndSortingRepository<Season,Long> {
    public Season findByYear(int year);

}
