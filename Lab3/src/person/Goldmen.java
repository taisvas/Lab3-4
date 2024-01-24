package person;

import objects.Coffin;

public class Goldmen extends Human {
    public Goldmen(int x, int y) {
        super("Goldmen", x,y);
    }

    public void beat(Human human) {
        System.out.printf("%s попытался пнуть %s. ", this.name, human.name);
    }

    public void fall() {
        System.out.printf("%s полетел на пол, размахивая руками, чтобы удержаться. ", this.name);
        this.setY(0);
        System.out.printf("(Координата (y) у %s изменилась на 0) ", this.name);

    }

    public void shout() {
        System.out.printf("%s издавал вопли. ", this.name);
        this.setCondition(Condition.CRYING);
        System.out.printf("(Настроение %s поменялось на %s) ", this.name, this.getCondition());
    }

    public void hit(Coffin coffin) {
        System.out.printf("Ненароком %s задел гроб Гэджа «Вечный покой», изготовленный в городе Сторивилле, штат Огайо, и стоивший недешево. ", this.name);
        coffin.setY(coffin.getY());
        System.out.printf("(Координата (y) у %s изменилась на 0) ", coffin.getName());
    }
}