
package Latihan4;

public class B extends A {
    private int b;
    public void setB (int nilai)
    {
        b = nilai;
    }
    public int getB()
    {
        return b;
    }
    public void tampilkanNilai()
    {
        super.tampilkanNilai();
        System.out.println ("Nilai b :"+getB());
    }
}
