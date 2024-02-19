import exceptions.NegativeCoordinateException;
import person.*;
import subjects.*;
public class Main {
    public static void main(String[] args) throws NegativeCoordinateException {
        Luis luis= new Luis(60, 0);
        Human rachel = new Human("Rachel", 80, 160) {
            @Override
            public void shout() {
                System.out.printf("%s издавала крики. ", this.name);
                this.setCondition(Condition.CRYING);
                System.out.printf("(Настроение %s поменялось на %s) ", this.name, this.getCondition());
            }
        };
        Goldmen goldmen = new Goldmen(40, 170);
        Gage gage = new Gage(20, 20);
        Coffin coffin = new Coffin("гроб", 80, 20, 100, gage);
        Flowers flowers = new Flowers("Цветы", 10, 10, 20);

        luis.sit();
        goldmen.beat(luis);
        luis.grab(goldmen.getLeg());
        luis.push(goldmen);
        System.out.println();
        goldmen.fall();
        goldmen.hit(coffin);

        String thoughts = "Оз Великий и Узасный спустился на моего сына";
        luis.think(thoughts);
        coffin.fall(goldmen);
        rachel.shout();
        System.out.println();
        luis.cry();
        goldmen.wave();
        flowers.fall(goldmen);
    }
}