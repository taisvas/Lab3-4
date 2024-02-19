package subjects;

public class Side {
    private double weightLeft;
    private double weightRight;
    private double weightCentre;

    public Side() {
        final double MIN_WEIGHT = 20.0;
        final double MAX_WEIGHT = 40.0;

        weightLeft = Math.random() * (MAX_WEIGHT - MIN_WEIGHT) + MIN_WEIGHT;
        weightRight = Math.random() * (MAX_WEIGHT - MIN_WEIGHT) + MIN_WEIGHT;
        weightCentre = Math.random() * (MAX_WEIGHT - MIN_WEIGHT) + MIN_WEIGHT;
    }


    public double getWeightLeftSide() {
        return weightLeft;
    }

    public void setWeightLeftSide(double weightLeft) {
        this.weightLeft = weightLeft;
    }

    public double getWeightRightSide() {
        return weightRight;
    }

    public void setWeightRightSide(double weightRight) {
        this.weightRight = weightRight;
    }

    public double getWeightCentreSide() {
        return weightCentre;
    }

    public void setWeightCentreSide(double weightCentre) {
        this.weightCentre = weightCentre;
    }
}
