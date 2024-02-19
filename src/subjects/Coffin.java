package subjects;

import subjects.interfaces.Fallable;
import person.Human;

public class Coffin extends Subject implements Fallable {
    private final Human deadBody;

    public Coffin(String name, int weight, int x, int y, Human deadBody) {
        super(name, weight, x, y);
        deadBody.setX(x);
        deadBody.setY(y);
        this.deadBody = deadBody;
    }

    public Coffin(String name, int weight, int x, int y) {
        super(name, weight, x, y);
        this.deadBody = null;
    }

    public boolean isWithinDistanceOfHuman(Human human) {
        return Math.abs(human.getX() - getX()) <= 20;
    }

    @Override
    public String makeSound() {
        String noise="";
        if (this.getWeight() >= 20) {
            noise = "с грохотом";
        }
        return noise;
    }

    @Override
    public void fall(Human human) {
        if (isWithinDistanceOfHuman(human)) {
            String sound = makeSound();
            if (this.leftSide.getWeightLeftSide() > this.rightSide.getWeightRightSide()) {
                System.out.printf(" Сперва упал левый край, а потом правый %s. ", sound);
            } else {
                System.out.printf(" Сперва упал правый край, а потом левый %s. ", sound);
            }
        }

        if (this.deadBody != null) {
            this.deadBody.setY(0);
            System.out.printf("(Координата (Y) у %s изменилась на 0) ", this.deadBody.getName());
        }
    }
}
