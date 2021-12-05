//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ex1;

import java.util.Hashtable;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws INNException {
        Scanner in = new Scanner(System.in);
        Hashtable<String, String> base = new Hashtable();
        base.put("Фамилия Имя Отчество", "1234567890");
        base.put("Павлова Екатерина Николаевна", "1234567190");
        base.put("Иванов Андрей Владимирович", "344567890");
        base.put("Пушкина Светлана Сергеевна", "1234877890");
        System.out.println("Для оформления заказа введите данные:");
        System.out.print("ФИО: ");
        String FIO = in.nextLine();
        System.out.print("ИНН: ");
        String INN = in.next();
        String dINN = (String)base.get(FIO);
        if (Objects.equals(INN, dINN)) {
            System.out.println("Заказ для пользователя " + FIO + " оформлен.");
        } else {
            throw new INNException("Введенный ИНН не действителен для данного пользователя.");
        }
    }
}