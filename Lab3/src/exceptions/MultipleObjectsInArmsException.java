package exceptions;

public class MultipleObjectsInArmsException extends RuntimeException {
    private final int objectsCount;

    public MultipleObjectsInArmsException(int objectsCount) {
        super("Невозможно удержать более одного объекта, но попытались удержать: " + objectsCount);
        this.objectsCount = objectsCount;
    }

    public int getObjectsCount() {
        return objectsCount;
    }
}