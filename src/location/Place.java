package location;

public enum Place {
    FLOOR(0,0),
    ROOM(0,100);
    private final int coordinateX;private final int coordinateY;


    Place(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

}
