public class Converter {


    public static String convert(int number, int base)
    {
        int quotient = number / base;
        int remainder = number % base;

        if (quotient == 0) 
        {
            return Integer.toString(remainder);      
        }
        else
        {
            return convert(quotient, base) + Integer.toString(remainder);
        }            
    }
    public static void main ( String args[] )  {
    System.out.println(convert(692, 2));
    }
}
