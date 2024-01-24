package person;

import subjects.Coffin;

public class Goldmen extends Human {
    public Goldmen(int x, int y) {
        super("Goldmen", x,y);
    }

    public void fall() {
        System.out.printf("%s полетел на пол. ", this.name);
        this.setY(0);
        System.out.printf("(Координата (y) у %s изменилась на 0) ", this.name);

    }

    public void shout() {
        System.out.printf("%s издавал вопли. ", this.name);
        this.setCondition(Condition.CRYING);
        System.out.printf("(Настроение %s поменялось на %s) ", this.name, this.getCondition());
    }

    public void hit(Coffin coffin) {
        System.out.printf("Ненароком %s задел %s. ", this.name, coffin.getName());
        coffin.setY(coffin.getY());
        System.out.printf("(Координата (y) у %s изменилась на 0) ", coffin.getName());
    }
}