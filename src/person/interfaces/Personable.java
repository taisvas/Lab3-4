package person.interfaces;

import location.Place;
import person.Condition;

public interface Personable {
    int getX();
    int getY();
    Condition getCondition();
    Place getPlace();
}
