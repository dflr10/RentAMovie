package net.danielfelipe.projects.RentAMovie.exception;

public class ObjectNotFoundException extends RuntimeException {

    private final String objectNorFoundName;

    private final Throwable cause;

    public ObjectNotFoundException(String objectNorFoundName) {
        this.objectNorFoundName = objectNorFoundName;
        this.cause = null;
    }

    public ObjectNotFoundException(String objectNorFoundName, Throwable cause) {
        this.objectNorFoundName = objectNorFoundName;
        this.cause = cause;
    }

    @Override
    public String getMessage() {
        return super.getMessage().concat("(Object not found: ")
                .concat(this.objectNorFoundName).concat(")");
    }

    public String getObjectNorFoundName() {
        return objectNorFoundName;
    }
}
