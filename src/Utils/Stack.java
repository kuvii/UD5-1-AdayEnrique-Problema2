package Utils;

public class Stack {
    private static final int CAPACIDAD_INICIAL = 5;

    private CustomCollection collection = new CustomCollection(CAPACIDAD_INICIAL);

    public void push(int element) {
        collection.insert(element, 0);
    }

    public void pop() {
        collection.delete(0);
    }
}
