package objects;

public abstract class Object {
    String name;
    int weight;
    protected Side rightSide;
    protected Side leftSide;
    protected Side centre;
    private final int x;
    private int y;

    public Object(String name, int weight, int x, int y) {
        this.name = name;
        this.weight=weight;
        leftSide = new Side();
        rightSide = new Side();
        centre = new Side();
        this.x=x;
        this.y=y;
    }
    public String getName() {
        return name;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    protected static class Side {
        protected double weightLeft;
        protected double weightRight;
        protected double weightCentre;

        public Side() {
            weightLeft = Math.random() * (40 - 20) + 20;
            weightRight = Math.random() * (40 - 20) + 20;
            weightCentre = Math.random() * (40 - 20) + 20;
        }

        public double getWeightLeftSide() { return weightLeft; }
        public double getWeightRightSide() {
            return weightRight;
        }
        public double getWeightCentreSide() {
            return weightCentre;
        }
    }

    @Override
    public String toString() {
        return "Object{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", x=" + x +
                ", y=" + y +
                ", leftSide weight=" + leftSide.weightLeft +
                ", rightSide weight=" + rightSide.weightRight +
                ", centre weight=" + centre.weightCentre +
                '}';
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + weight;
        result = 31 * result + x;
        result = 31 * result + y;
        result = 31 * result + Double.hashCode(leftSide.weightLeft);
        result = 31 * result + Double.hashCode(rightSide.weightRight);
        result = 31 * result + Double.hashCode(centre.weightCentre);
        return result;
    }

}

