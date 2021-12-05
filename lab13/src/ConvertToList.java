//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;

public class ConvertToList {
    public ConvertToList() {
    }

    public <E> ArrayList<E> ConvertArrayList(E[] array) {
        ArrayList<E> list = new ArrayList();
        Object[] var3 = array;
        int var4 = array.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            E element = (E) var3[var5];
            list.add(element);
        }

        return list;
    }

    public static void main(String[] args) {
        ConvertToList ctl = new ConvertToList();
        Integer[] arrayInt = new Integer[]{1, 2, 3};
        Double[] arrayDouble = new Double[]{1.1D, 2.2D, 3.3D};
        String[] arrayString = new String[]{"a", "b", "c"};
        ArrayList<Integer> listInt = ctl.ConvertArrayList(arrayInt);
        ArrayList<Double> listDouble = ctl.ConvertArrayList(arrayDouble);
        ArrayList<String> listString = ctl.ConvertArrayList(arrayString);
        System.out.println(listInt);
        System.out.println(listDouble);
        System.out.println(listString);
        System.out.println(((Integer)listInt.get(0)).getClass().getSimpleName());
        System.out.println(((Double)listDouble.get(0)).getClass().getSimpleName());
        System.out.println(((String)listString.get(0)).getClass().getSimpleName());
    }
}




