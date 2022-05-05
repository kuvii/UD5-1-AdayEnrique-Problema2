package Utils;

public class Stack {
    private static final int CAPACIDAD_INICIAL = 2;

    private CustomCollection collection = new CustomCollection(CAPACIDAD_INICIAL);

    public void push(int element) {
        collection.insert(element, 0);
    }

    public int pop() {
        return (int) collection.delete(0);
    }
}
