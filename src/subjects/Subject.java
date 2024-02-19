package subjects;

@SuppressWarnings("ALL")
public abstract class Subject {
    private String name;
    private int weight;
    private final int x;
    private int y;
    protected Side rightSide;
    protected Side leftSide;
    protected Side centre;

    public Subject(String name, int weight, int x, int y) {
        this.name = name;
        this.weight = weight;
        this.x = x;
        this.y = y;
        leftSide = new Side();
        rightSide = new Side();
        centre = new Side();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Side getRightSide() {
        return rightSide;
    }

    public void setRightSide(Side rightSide) {
        this.rightSide = rightSide;
    }

    public Side getLeftSide() {
        return leftSide;
    }

    public void setLeftSide(Side leftSide) {
        this.leftSide = leftSide;
    }

    public Side getCentre() {
        return centre;
    }

    public void setCentre(Side centre) {
        this.centre = centre;
    }


    @Override
    public String toString() {
        return "Object{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + weight;
        result = 31 * result + x;
        result = 31 * result + y;
        return result;
    }
}
