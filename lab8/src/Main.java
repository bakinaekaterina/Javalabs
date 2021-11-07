import java.util.HashMap;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Pet> hashmap = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String s;

        // Получение набора котов.
        System.out.println("Введите клички котов. Чтобы остановить ввод, нажмите 0");
        s = input.next();
        while (!Objects.equals(s, "0")) {
            hashmap.put(s, new Cat(s));
            s = input.next();
        }

        // Получение набора собак.
        System.out.println("Введите клички собак. Чтобы остановить ввод, нажмите 0");
        s = input.next();
        while (!Objects.equals(s, "0")) {
            hashmap.put(s, new Dog(s));
            s = input.next();
        }

        // Получение набора сов.
        System.out.println("Введите клички сов. Чтобы остановить ввод, нажмите 0");
        s = input.next();
        while (!Objects.equals(s, "0")) {
            hashmap.put(s, new Owl(s));
            s = input.next();
        }

        System.out.println("--------------------------------------------------------");

        System.out.println("Отображение полученного набора:");
        System.out.println(hashmap);
        System.out.println("--------------------------------------------------------");

        hashmap.put("Снежок", new Cat("Снежок"));
        hashmap.put("Бусинка", new Dog("Бусинка"));
        hashmap.put("Стеша", new Owl("Стеша"));

        System.out.println("Отображение после добавления элементов:");
        System.out.println(hashmap);

        System.out.println("--------------------------------------------------------");
        System.out.println("Подсчет повторов после рандомной генерации:");
        Random random = new Random();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 100; i++)
        {
            int number = random.nextInt(21);
            Integer frequency = hashMap.get(number);
            hashMap.put(number, frequency == null ? 1 : frequency + 1);
        }
        System.out.println(hashMap);
    }
}
