import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во лошадей (n): ");
        int n = in.nextInt();
        startHorses(n);
    }

    public static void startHorses(int horses_number)
    {
        Object lock = new Object();
        List<Thread> horses = new ArrayList<Thread>(horses_number);
        String number;
        for (int i = 1; i < horses_number + 1; i++)
        {
            number = i < 10 ? ("0" + i) : "" + i;
            Thread horse_i = new Thread(new HorseThread(lock, "Лошадь_" + number));
            horses.add(horse_i);
        }
        for (int i = 0; i < horses_number; i++)
        {
            horses.get(i).start();
        }
    }
}

class HorseThread implements Runnable
{
    private Object lock;
    private String name;

    public HorseThread(Object lock, String name)
    {
        this.lock = lock;
        this.name = name;
    }

    @Override
    public void run()
    {
        synchronized (lock)
        {
            String s = "";
            for (int i = 0; i < 10001; i++)
            {
                if (i == 10000)
                {
                    s = " финишировала!";
                    System.out.println(name + s);
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    lock.notify();
                    try
                    {
                        lock.wait(1000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
