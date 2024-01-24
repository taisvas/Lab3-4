package exceptions;

public class NegativeCoordinateException extends Exception {
    private final int coordinateValue;
    private final String coordinateName;

    public NegativeCoordinateException(String coordinateName, int coordinateValue) {
        super(coordinateName + " координата не может быть отрицательной, но была: " + coordinateValue);
        this.coordinateName = coordinateName;
        this.coordinateValue = coordinateValue;
    }

    public int getCoordinateValue() {
        return coordinateValue;
    }

    public String getCoordinateName() {
        return coordinateName;
    }
}