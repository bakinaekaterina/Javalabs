//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ex2;

        import java.util.ArrayList;
        import java.util.Comparator;
        import java.util.Iterator;
        import java.util.List;
        import java.util.Objects;
        import java.util.Scanner;

public class Main {
    private static final Scanner in;

    public Main() {
    }

    public static void main(String[] args) throws StudNotFoundException {
        System.out.print("Введите количество студентов: ");
        String Kstudy = in.nextLine();
        int Kstud = Integer.parseInt(Kstudy);
        Student[] st = new Student[Kstud];
        List<Student> stu = new ArrayList();
        System.out.print("Введите ФИО студентов: ");

        for(int i = 0; i < Kstud; ++i) {
            String name = in.nextLine();
            int id = (int)(Math.random() * 200.0D);
            int b = (int)(Math.random() * 100.0D);
            st[i] = new Student(name, id, b);
            stu.add(new Student(name, id, b));
        }

        System.out.println("--------------------------------------------");
        System.out.println("Для вывода списка студентов с оценками нажмите \"1\".");
        System.out.println("Для сортировки списка студентов с оценками нажмите \"2\".");
        System.out.println("Для поиска студента нажмите \"3\".");
        System.out.println("Для завершения работы программы нажмите \"0\".");
        System.out.println("--------------------------------------------");

        for(String flag = in.nextLine(); !Objects.equals(flag, "0"); flag = in.nextLine()) {
            byte var12 = -1;
            switch(flag.hashCode()) {
                case 49:
                    if (flag.equals("1")) {
                        var12 = 0;
                    }
                    break;
                case 50:
                    if (flag.equals("2")) {
                        var12 = 1;
                    }
                    break;
                case 51:
                    if (flag.equals("3")) {
                        var12 = 2;
                    }
            }

            label49:
            switch(var12) {
                case 0:
                    System.out.println("Список студентов: ");
                    Iterator var14 = stu.iterator();

                    while(true) {
                        if (!var14.hasNext()) {
                            break label49;
                        }

                        Student i = (Student)var14.next();
                        System.out.println(i);
                    }
                case 1:
                    Comparator<Student> comp = new SortingStudentsByGPA();
                    stu.sort(comp);
                    System.out.println("Отсортированный список студентов: ");
                    Iterator var15 = stu.iterator();

                    while(true) {
                        if (!var15.hasNext()) {
                            break label49;
                        }

                        Student i = (Student)var15.next();
                        System.out.println(i);
                    }
                case 2:
                    int help = find(st, Kstud);
                    if (help == -1) {
                        throw new StudNotFoundException("Такой студент отсутствует в списке.");
                    }

                    System.out.println("Студент найден: " + st[help]);
            }

            System.out.print("Введите номер следующего действия: ");
        }

    }

    public static int find(Student[] st, int Kstud) {
        System.out.print("Введите ФИО искомого студента: ");
        String Ffio = in.nextLine();

        for(int i = 0; i < Kstud; ++i) {
            if (st[i].getFIO().equals(Ffio)) {
                return i;
            }
        }

        return -1;
    }

    static {
        in = new Scanner(System.in);
    }
}
