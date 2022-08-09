import java.util.Random;

public class MagicBox<T> {

    private T[] items;


    public MagicBox(int itemQuantity) {
        this.items = (T[]) new Object[itemQuantity];
    }

    boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("Item added");
                return true;
            }
        }
        System.out.println("No room for more items");
        return false;
    }

    T pick() {
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Коробка еще не полна! Осталось заполнить "
                        + (items.length - i) + " ячеек");
            }
        }
        return items[randomInt];
    }
}
