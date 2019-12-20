package quantitymeasurement;

public class UnitsMismatchException extends Throwable {

    public ExceptionType type;

    public enum ExceptionType {
        TYPE_MISMATCH
    }

    public UnitsMismatchException(ExceptionType type) {
        this.type = type;
    }


}
