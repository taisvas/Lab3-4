package person;

import location.Place;
import person.interfaces.Personable;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Human implements Personable {
    private String name;
    protected Condition condition;
    protected Arms hands;
    protected Legs leg;
    protected Head head;
    private int x;
    private int y;
    protected Place place;

    public class Arms extends Body {
        protected Position position;
        public ArrayList<Body> armSubjects;

        public Arms() {
            this.armSubjects = new ArrayList<>();
            position = Position.DOWN;
        }

        public void haveSubjects(Body body) {
            if (armSubjects.size() < 2) {
                armSubjects.add(body);
                System.out.printf("В руках %s теперь есть %s ", name, armSubjects);
            } else {
                System.out.println("У человека не может быть больше двух рук!");
            }
        }

        public void removeSubjects() {
            armSubjects.remove(0);
            System.out.printf("В руках %s теперь ничего нет ", name);
        }

        public Position getPosition(){
            return position;
        }

        public void setPosition(Position position){
            this.position = position;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static class Body{
        public Body(){}
    }
    public class Legs extends Body {
        public ArrayList<Body> legSubjects;

        public Legs() {
            legSubjects = new ArrayList<>();
        }
    }

    public class Head extends Body {
        public ArrayList<Body> subjects;

        public Head() {
            subjects = new ArrayList<>();
        }
    }

    public Human(String name, int x, int y) {
        this.name = name;
        this.condition = Condition.CALM;
        this.hands = new Arms();
        this.leg = new Legs();
        this.head = new Head();
        this.x= x;
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    @Override
    public Place getPlace() {
        return this.place;
    }

    public Legs getLeg() {
        return leg;
    }

    public void takeToArm(Body body) {
        removeFromArms(); // Удаляем предыдущие предметы из руки
        hands.haveSubjects(body); // Добавляем новый предмет
        System.out.printf("В руках %s теперь есть %s ", name, hands.armSubjects);
    }


    public void removeFromArms() {
        if (!hands.armSubjects.isEmpty()) { // Проверяем, что в руках что-то есть
            hands.removeSubjects(); // Удаляем предметы из руки
            System.out.printf("В руках %s теперь ничего нет ", name);
        }
    }


    public void wave(){
        System.out.printf("%s начал махать руками. ", this.name);
        hands.setPosition(Position.UP);
        System.out.printf("(Руки переведены в позицию %s)", hands.getPosition());
        hands.setPosition(Position.DOWN);
        System.out.printf("(Руки переведены в позицию %s)", hands.getPosition());
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", condition=" + condition +
                ", x=" + x +
                ", y=" + y +
                ", place=" + place +
                ", hands subjects=" + hands.armSubjects +
                ", hands position=" + hands.position +
                '}';
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + condition.hashCode();
        result = 31 * result + x;
        result = 31 * result + y;
        result = 31 * result + (place != null ? place.hashCode() : 0);
        result = 31 * result + hands.armSubjects.hashCode();
        result = 31 * result + hands.position.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (x != human.x) return false;
        if (y != human.y) return false;
        if (!name.equals(human.name)) return false;
        if (condition != human.condition) return false;
        if (!Objects.equals(place, human.place)) return false;
        if (!hands.armSubjects.equals(human.hands.armSubjects)) return false;
        return hands.position == human.hands.position;
    }

}
