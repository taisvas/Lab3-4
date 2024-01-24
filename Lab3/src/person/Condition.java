package person;

public enum Condition {
    HAPPY(1),
    CRYING(0),
    AGRESSIVE(3),//роменять чтобы агреесивный бьыл самым сильным ударом
    CALM(2);

    private final double mood;

    Condition(double mood) {
        this.mood = mood;
    }

    public double getMood() {
        return mood;
    }
}
