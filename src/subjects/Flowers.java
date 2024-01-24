package subjects;
import subjects.interfaces.*;
import person.Human;
public class Flowers extends Subject implements Fallable {

    public Flowers(String name, int weight, int x, int y) {
        super(name, weight, x, y);
    }
    String  noise = " ";

    public boolean distanceToSubject(Human human ) {
        return Math.abs(human.getX() - getX()) <= 20;
    }


    @Override
    public String makeSound() {
        if (weight >= 10) {
            return noise = " с дребезгом";
        }
        else{
            return  noise = "с шелестом";
        }}

    @Override
    public void fall(Human human) {
        if (distanceToSubject(human)) {
            makeSound();
            if (centre.getWeightCentreSide() > 5) {
                System.out.printf(" %s полетели на пол %s ", name, noise);
            } else {
                System.out.printf(" %s полетели на пол %s ", name, noise);
            }
            this.setY(0);
            System.out.printf("(Координата (Y) у %s изменилась на 0) ", this.name);
        }
    }

}
