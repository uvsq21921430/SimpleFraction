import javax.lang.model.type.NullType;

public class Fraction
{
    private int numerator;

    public int getNumerator() {
        return numerator;
    }
    public void setNumerator(int a) {
        this.numerator = a;
    }
    public int getDenumerator() {
        return denumerator;
    }
    public void setDenumerator(int b) {
        this.denumerator = b;
    }

    private int denumerator;

    public Fraction (int a,int b)
    {
        this.numerator=a;
        if (b == 0)
        {
            throw new AssertionError();
        }
        this.denumerator=b;
    }

    public Fraction multiply (Fraction F1)
    {
        Fraction F= new Fraction(this.numerator*F1.getNumerator(), this.denumerator*F1.getDenumerator());
        return F;
    }

    public Fraction add (Fraction F1)
    {
        Fraction F;
        F= new Fraction( ((this.numerator*F1.getDenumerator())+(this.denumerator*F1.getNumerator())),
                this.denumerator*F1.getDenumerator()
        );
        return F;
    }
    public Fraction subs (Fraction F1)
    {
        Fraction F;
        F= new Fraction( ((this.numerator*F1.getDenumerator())-(this.denumerator*F1.getNumerator())),
                this.denumerator*F1.getDenumerator()
        );
        return F;
    }

    public String toString ()
    {
        return " "+this.numerator+" / "+this.denumerator+" ";
    }


}
