import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

    public class main {
        public static List<String> add_s (List<String> a, String s) {
            a.add(s);
            return a;
        }
        public static List<String> del_s (List<String> a, int i) {
            a.remove(i);
            return a;
        }
        public static List<String> change (List<String> a, int i) {
            java.util.Scanner in = new java.util.Scanner(System.in);
            a.set(i, in.next());
            return a;
        }
        public static List<String> shuffle_a (List<String> a) {
            Collections.shuffle(a);
            return a;
        }
        public static String select (List<String> a) {
            return a.get((int) (Math.random() * 3));
        }
        public static int index_s (List<String> a, String s) {
            return a.indexOf(s);
        }
        public static String find_s (List<String> a, String s) {
            if (index_s(a, s) == -1)
                return "Элемента нет в списке";
            return "Элемент есть в списке";
        }
        public static List<String> reverse_s (List<String> a) {
            Collections.reverse(a); //разворачивает список
            return a;
        }
        public static void main(String[] args) {
            String Mercury = new String("Меркурий");
            String Venus = new String("Венера");
            String Earth = new String("Земля");
            String Mars = new String("Марс");
            String Jupiter = new String("Юпитер");
            String Saturn = new String("Сатурн");
            String Uranus = new String("Уран");
            String Neptune = new String("Нептун");
            List<String> Solar_system_1 = new ArrayList<String>(Arrays.asList(Mercury, Venus, Earth, Mars));
            List<String> Solar_system_2 = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(Jupiter, Saturn, Uranus, Neptune)));
            System.out.println(Solar_system_1);
            Solar_system_1 = add_s(Solar_system_1, "Юпитер");
            System.out.println(Solar_system_1);
            Solar_system_1 = del_s(Solar_system_1, 2);
            System.out.println(Solar_system_1);
            Solar_system_1 = change(Solar_system_1, 2);
            System.out.println(Solar_system_1);
            Solar_system_1 = shuffle_a(Solar_system_1);
            System.out.println(Solar_system_1);
            System.out.println(select(Solar_system_1));
            System.out.println(index_s(Solar_system_1, "Земля"));
            System.out.println(find_s(Solar_system_1, "Уран"));
            Solar_system_1 = reverse_s(Solar_system_1);
            System.out.println(Solar_system_1);
            System.out.println(Solar_system_2);
            System.out.println(select(Solar_system_2));
            System.out.println(index_s(Solar_system_2, "Земля"));
            System.out.println(find_s(Solar_system_2, "Уран"));
            Solar_system_2 = reverse_s(Solar_system_2); //на этой строке выдастся ошибка, т. к. немодифицируемый список изменять нельзя
        }
    }
