package excepions;

public class LetraNoEncontradaException extends RuntimeException{

    public LetraNoEncontradaException() {
        super("no se encuentra la letra");
    }
}
