package person;

import exceptions.MultipleObjectsInArmsException;
import exceptions.NegativeCoordinateException;
import person.interfaces.Personable;

public class Luis extends Human implements Personable {
    public Luis(int x, int y) {
        super("Luis", x, y);
    }

    public void shout() {
        if (getCondition() == Condition.CALM) {
            System.out.printf("%s начал рыдать. ", this.name);
            setCondition(Condition.CRYING);
            System.out.printf("(Настроение %s поменялось на %s) ", this.name, this.getCondition());
        }
    }

    public void sit() throws NegativeCoordinateException {
        if (this.getPlace() == place) {
            System.out.printf("%s перевернулся на бок и сел.", this.name);
            int newY = this.getY() + 50;
            if (newY < 0) {
                throw new NegativeCoordinateException("Y", newY);
            }
            this.setY(newY);
            System.out.printf("(Координата (Y) у %s изменилась на %s). ",  this.name, this.getY());
        }
    }

    public void grab(Body part) {
        try {
            System.out.printf(" %s схватил его за ногу обеими руками — прочно, словно футбольный мяч. ", this.name);
            this.takeToArm(part);
        } catch (MultipleObjectsInArmsException e) {
            System.out.println("Ошибка: " + e.getMessage());
            return;
        }
        this.setCondition(Condition.AGRESSIVE);
        System.out.printf("(Настроение %s поменялось на %s) ", this.name, this.getCondition());
    }

    public void push(Human human) throws NegativeCoordinateException {
        this.removeFromArms();
        System.out.printf(" %s толкнул назад %s ", this.name, human.name);
        int newX = human.getX() - 20;
        if (newX < 0) {
            throw new NegativeCoordinateException("X", newX);
        }
        human.setX(newX);
        System.out.printf("(координата (X) у %s изменилась на 20) ", human.name);
    }

    public void think() {
        System.out.printf(" «Оз Великий и Узасный спустился на моего сына», — подумал %s почему-то. ", this.name);
        this.setCondition(Condition.CALM);
        System.out.printf("(Настроение %s поменялось на %s) ", this.name, this.getCondition());
    }
    public void cry() {
        System.out.printf("Сидя на полу, %s закрыл лицо руками. ", this.name);
        this.takeToArm(this.head);
        this.shout();
    }
}
