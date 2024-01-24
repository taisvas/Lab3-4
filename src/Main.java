import exceptions.NegativeCoordinateException;
import subjects.Coffin;
import subjects.Flowers;
import person.*;

public class Main {
    public static void main(String[] args) throws NegativeCoordinateException {
        Luis luis= new Luis(60, 0);
        Rachel rachel = new Rachel(80, 160);
        Goldmen goldmen = new Goldmen(40, 170);
        Gage gage = new Gage(20, 20);
        Coffin coffin = new Coffin("гроб", 80, 20, 100, gage);
        Flowers flowers = new Flowers("Цветы", 10, 10, 20);

        luis.sit();
        luis.grab(goldmen.getLeg());
        luis.push(goldmen);
        System.out.println();
        goldmen.fall();
        goldmen.hit(coffin);
        luis.think();
        coffin.fall(goldmen);
        rachel.shout();
        System.out.println();
        luis.cry();
        goldmen.wave();
        flowers.fall(goldmen);
    }
}