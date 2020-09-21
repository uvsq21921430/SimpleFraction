import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        System.out.println(" HELLO WORLD GIVE ME A FRACTTION NUMBER");
        Scanner sc =new Scanner(System.in);

        int numerator,denumerator;

        numerator=sc.nextInt();
        denumerator=sc.nextInt();

        Fraction F1=new Fraction(numerator,denumerator);

        System.out.println("the fraction number : "+F1.toString());

        F1.add(new Fraction(1,5));
        System.out.println("the fraction number after the addition : "+F1.toString());

        F1.subs(new Fraction(2,5));
        System.out.println("the fraction number after the substraction : "+F1.toString());



    }
}
