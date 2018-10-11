import java.io.*;



  public class Fraction {
      int num,den;

      public Fraction()
      {
          this.num = 10;
          this.den = 7;


      }
      public Fraction(int num , int den)
      {
        this.num = num;
        this.den = den;
      }

      public String toString()
      {
        return   this.num + "\n--\n" + this.den;
      }


  }
