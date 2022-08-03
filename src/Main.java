import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создаем Generics
        MagicBox<String> boxStr = new MagicBox<>(2);
        // Добавляем значения в MagicBox <String> варианты для true
        System.out.println(boxStr.add("hjkj"));
        System.out.println(boxStr.add("авиав"));
        // Демонстрация работы исключения
        boxStr.pick();
        // Добавляем значения в MagicBox <String> варианты для false
        System.out.println(boxStr.add("hjkj"));
        // Выводим на печать наш массив
        System.out.println(boxStr.toString());

        System.out.println();

        MagicBox<Integer> boxI = new MagicBox<>(10);
        // Добавляем значения в MagicBox <Integer> варианты для true
        System.out.println(boxI.add(2));
        System.out.println(boxI.add(5));
        // Демонстрация работы исключения
        boxI.pick();
        // Добавляем значения в MagicBox <Integer> варианты для false
        System.out.println(boxI.add(10));
        // Выводим на печать наш массив
        System.out.println(boxI.toString());


    }
}
