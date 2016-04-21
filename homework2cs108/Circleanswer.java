public class Circleanswer
{
    //instance variables
   public double x;
   public double y;
   public double R;


   public Circleanswer() //default constructor
   {
      this.x = 0;
      this.y = 0;
      this.R = 1;
   }


   public Circleanswer(double t1, double t2, double t3)
   {                 //customized costructor
      this.x = t1;
      this.y = t2;
      this.R = t3;
   }


   public double whatsMyArea()   //instance method (``behavious``)
   {
      return Math.PI*this.R*this.R;
   }


   public static double calcAreaForThisRadius(double r)
   {                    //class method
      return Math.PI*r*r;
   }

}

