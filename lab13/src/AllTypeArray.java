//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import java.util.Arrays;

public class AllTypeArray<T> {
    private T[] array;

    public AllTypeArray(T[] array) {
        this.array = array;
    }

    public T get(int i) {
        return this.array[i];
    }

    public String toString() {
        String var10000 = Arrays.toString(this.array);
        return "EveryType{array=" + var10000 + ", " + this.array[0].getClass() + "}";
    }

    public static void main(String[] args) {
        Integer[] arrayInt = new Integer[]{1, 2, 3};
        Double[] arrayDouble = new Double[]{1.1D, 2.2D, 3.3D};
        String[] arrayString = new String[]{"a", "b", "c"};
        AllTypeArray etInt = new AllTypeArray(arrayInt);
        AllTypeArray etDouble = new AllTypeArray(arrayDouble);
        AllTypeArray etString = new AllTypeArray(arrayString);
        System.out.println(etInt);
        System.out.println(etDouble);
        System.out.println(etString);
        System.out.println("================");
        System.out.println(etInt.get(0));
        System.out.println(etDouble.get(1));
        System.out.println(etString.get(2));
    }
}