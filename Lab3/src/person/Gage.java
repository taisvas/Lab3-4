package person;

import person.interfaces.Personable;

public class Gage extends Human implements Personable {
    public Gage(int x, int y) {
        super("Gage", x, y);
    }

}