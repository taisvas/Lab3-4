package objects.interfaces;

import person.Human;

public interface Fallable {
    void fall(Human human);
    String makeSound();
}
