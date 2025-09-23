
public class DebugCircle
{
        private final int radius;
        private final int diameter;
        private final double PI = 3.14159;
        private final double area;

        public DebugCircle(int r)
        {

       radius = r;
       diameter = 2 * r;
       area = PI * r * r;
       

        }

       public int getRadius()
        {
       return radius;
        }
       public int getDiameter()
        {
       return diameter;
        }
       public double getArea()   
        {
       return area;
        }

         public static void main (String[] args)
        {
         
        }

}
