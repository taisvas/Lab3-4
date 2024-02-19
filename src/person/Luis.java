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
            System.out.printf("%s начал рыдать. ", this.getName());
            setCondition(Condition.CRYING);
            System.out.printf("(Настроение %s поменялось на %s) ", this.getName(), this.getCondition());
        }
    }

    public void sit() throws NegativeCoordinateException {
        if (this.getPlace() == place) {
            System.out.printf("%s перевернулся на бок и сел.", this.getName());
            int newY = this.getY() + 50;
            if (newY < 0) {
                throw new NegativeCoordinateException("Y", newY);
            }
            this.setY(newY);
            System.out.printf("(Координата (Y) у %s изменилась на %s). ",  this.getName(), this.getY());
        }
    }

    public void grab(Body part) {
        try {
            System.out.printf(" %s схватил его за ногу обеими руками — прочно, словно футбольный мяч. ", this.getName());
            this.takeToArm(part);
        } catch (MultipleObjectsInArmsException e) {
            System.out.println("Ошибка: " + e.getMessage());
            return;
        }
        this.setCondition(Condition.AGRESSIVE);
        System.out.printf("(Настроение %s поменялось на %s) ", this.getName(), this.getCondition());
    }

    public void push(Human human) throws NegativeCoordinateException {
        this.removeFromArms();
        System.out.printf(" %s толкнул назад %s ", this.getName(), human.getName());
        int newX = human.getX() - 20;
        if (newX < 0) {
            throw new NegativeCoordinateException("X", newX);
        }
        human.setX(newX);
        System.out.printf("(координата (X) у %s изменилась на 20) ", human.getName());
    }

    public static class Thoughts {
        private String thoughts;

        public Thoughts(String thoughts) {
            this.thoughts = thoughts;
        }

        public String getThoughts() {
            return this.thoughts;
        }

        public void setThoughts(String thoughts) {
            this.thoughts = thoughts;
        }

    }
    public void think(String dreams) {
        Thoughts thoughts = new Thoughts(dreams);
        System.out.printf("«%s», — подумал %s почему-то. ", thoughts.getThoughts(), this.getName());
        this.setCondition(Condition.CALM);
        System.out.printf("(Настроение %s поменялось на %s) ", this.getName(), this.getCondition());
    }
    public void cry() {
        if (this.getY() == 0) {
            System.out.print("Сидя на полу, ");
        } else if (0 < this.getY() && this.getY() < 30) {
            System.out.print("Нагнувшись, ");
        } else {
            System.out.print("Стоя, ");
        }

        System.out.printf("%s закрыл лицо руками. ", this.getName());
        this.takeToArm(this.head);
        this.shout();
    }
}
