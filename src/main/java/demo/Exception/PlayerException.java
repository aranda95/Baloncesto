package demo.Exception;


public class PlayerException extends RuntimeException{
        public PlayerException(Long id) {
            super("NO EXIST PLAYER WITH ID: "+ id);
        }
}

