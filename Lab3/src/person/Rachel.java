package person;

public class Rachel extends Human {
    public Rachel(int x, int y) {
        super("Rachel", x, y);
    }

    public void shout() {
        System.out.printf("%s издавала крики. ", this.name);
        this.setCondition(Condition.CRYING);
        System.out.printf("(Настроение %s поменялось на %s) ", this.name, this.getCondition());
    }
}