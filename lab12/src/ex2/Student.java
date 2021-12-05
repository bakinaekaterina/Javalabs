//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ex2;

public class Student implements IStudent {
    private String FIO;
    private int iDNumber;
    private int bal;

    public Student(String FIO, int iDNumber, int bal) {
        this.FIO = FIO;
        this.iDNumber = iDNumber;
        this.bal = bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    public int getBal() {
        return this.bal;
    }

    public int getiDNumber() {
        return this.iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public String getFIO() {
        return this.FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String toString() {
        return "ID: " + this.iDNumber + ", ФИО: " + this.FIO + ", Оценка: " + this.bal;
    }
}
