package subjects;
import subjects.interfaces.*;
import person.Human;
public class Coffin extends Subject implements Fallable {
    private final Human deadBody;

    public Coffin(String name, int weight, int x, int y, Human deadBody) {
        super(name, weight, x, y);
        this.deadBody = deadBody;
    }
    public Coffin(String name, int weight, int x, int y) {
        super(name, weight, x, y);
        this.deadBody = null;
    }

    String noise = " ";

    public boolean distanceToSubject(Human human ) {
        return Math.abs(human.getX() - getX()) <= 20;
    }

    @Override
    public String makeSound() {
        if (weight >= 20) {
            noise = "с грохотом";
        }
        return "";
    }

    @Override
    public void fall(Human human) {
        if (distanceToSubject(human)) {
            makeSound();
            if (leftSide.getWeightLeftSide() > rightSide.getWeightRightSide()) {
                System.out.printf(" Сперва упал левый край, а потом правый %s. ", noise);
            } else {
                System.out.printf(" Сперва упал правый край, а потом левый %s. ", noise);
            }
        }

        if (this.deadBody != null) {
            this.deadBody.setY(0);
            System.out.printf("(Координата (Y) у %s изменилась на 0) ", this.deadBody.name);
        }
    }
}
