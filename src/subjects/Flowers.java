package subjects;

import subjects.interfaces.Fallable;
import person.Human;

public class Flowers extends Subject implements Fallable {

    public Flowers(String name, int weight, int x, int y) {
        super(name, weight, x, y);
    }

    public boolean distanceToSubject(Human human) {
        return Math.abs(human.getX() - getX()) <= 20;
    }

    @Override
    public String makeSound() {
        if (this.getWeight() >= 10) {
            return " с дребезгом";
        } else {
            return " с шелестом";
        }
    }

    @Override
    public void fall(Human human) {
        if (distanceToSubject(human)) {
            String sound = makeSound();
            if (this.centre.getWeightCentreSide() > 5) {
                System.out.printf(" %s полетели на пол %s ", this.getName(), sound);
            } else {
                System.out.printf(" %s полетели на пол %s ", this.getName(), sound);
            }
            this.setY(0);
            System.out.printf("(Координата (Y) у %s изменилась на 0) ", this.getName());
        }
    }
}
