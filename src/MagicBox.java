import java.util.*;

public class MagicBox<T> {
    protected int size;
    protected T[] items;

    public MagicBox(int size) {
        this.size = size;
        items = (T[]) new Object[size];


    }


    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public void pick() throws RuntimeException {
        int emptyCell = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                emptyCell++;
            }
        }
        if (emptyCell != 0) {
            throw new RuntimeException("Коробка не полна и осталось ещё " +
                    emptyCell + " ячеек заполнить");
        } else {
            Random random = new Random();
            int randomInt = random.nextInt(size);
            System.out.println(items[randomInt]);
        }

    }


    @Override
    public String toString() {
        return "MagicBox{" + Arrays.toString(items) + '}';
    }
}