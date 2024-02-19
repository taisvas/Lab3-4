package person;
import subjects.*;
public class Goldmen extends Human {
    public Goldmen(int x, int y) {
        super("Goldmen", x,y);
    }

    public void fall() {
        System.out.printf("%s полетел на пол. ", this.getName());
        this.setY(0);
        System.out.printf("(Координата (y) у %s изменилась на %s) ", this.getName(), this.getY());
    }

    public void shout() {
        System.out.printf("%s издавал вопли. ", this.getName());
        this.setCondition(Condition.CRYING);
        System.out.printf("(Настроение %s поменялось на %s) ", this.getName(), this.getCondition());
    }

    public void beat(Human human) {
        System.out.printf("%s еще раз попытался пнуть %s. ", this.getName(), human.getName());
        if (Math.random() > 0.5) { System.out.printf("(%s попал) ", this.getName());}
        else {System.out.printf("(%s промахнулся) ", this.getName());}
    }
    public void hit(Coffin coffin) {
        System.out.printf("Ненароком %s задел %s. ", this.getName(), coffin.getName());
        coffin.setY(coffin.getY());
        System.out.printf("(Координата (y) у %s изменилась на %s) ", this.getName(), this.getY());
    }
}