package demo.Exception;


public class TeamException  extends RuntimeException{

    public TeamException(Long id) {
        super("NO EXIST TEAM WITH ID: "+ id);
    }
}
