package feb26;

public class FractionRunner
{
    public static void main(String args[])
    {
        Fraction f1 = new Fraction (1, 4);
        Fraction f2 = new Fraction (1, 3);
        Fraction f3 = f1;
        System.out.println(f1.compareTo(f2));
        String s1 = "Frog";
        String s2 = "Frog";
        System.out.println(s1==s2);
        System.out.println(f1==f3);
    }
}
