import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Создать класс Cat(name, poroda, weighrt,color,color Eye)
 * Создать коллекцию ArrayList
 * Реализовать интерфейс - implements
 * Реализовать метод для сравнения в классе
 */

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("src/text.txt"));

        List<Cat> catList = new ArrayList<Cat>();
// Создаем коллекцию из файла(считывание, парсинг, создание объекта, занесение в коллекцию).
        while (scanner.hasNext()) {
            String stroka = scanner.nextLine();
//            System.out.println(stroka);
            String[] data = stroka.split(" ");
//            System.out.println(Arrays.toString(data));
            String name = data[0];
            String poroda = data[1];
            int weight = Integer.valueOf(data[2]);// valueOf - пробразование строки в int число.
            String color = data[3];
            String colorEye = data[4];

            Cat cat = new Cat(name, poroda, weight, color, colorEye);
            catList.add(cat);// добавление в коллекцию
//            System.out.println(cat);
        }

//        for (int i = 0; i < catList.size(); i++) {
//            if (catList.get(i).getColor().equals("black"))
//                System.out.println(catList.get(i));
//        }
//        System.out.println("Вес кота больше 3х");
//        for (int i = 0; i < catList.size(); i++) {
//            if (catList.get(i).getWeight() > 3)
//                System.out.println(catList);
//        }

        System.out.println("=========================================");

        for (Cat cat : catList) {
            System.out.println(cat);
        }
        Comparator<Cat> comparator = new CatComp();
    }
}
