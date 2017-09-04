package Latihan3;

public class Gajah extends Hewan{
    public static void testClassMethod(){
        System.out.println("The Class method in Hewan...");
    }
    public void testInstanceMethod(){
        System.out.println("The instance method in Gajah...");
    }
    public static void main (String[]args){
        Gajah myGajah = new Gajah();
        Hewan myHewan = myGajah;
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
}
