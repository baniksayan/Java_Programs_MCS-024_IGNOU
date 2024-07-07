//simple Java program that takes a binary input from the user and allows them to
// choose the desired conversion to hexadecimal, octal, or decimal.
class deci_to_any
{
    public static void main(String args[])
    {
        int n,b,i,j,k=1;
        n=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);

        j=n;
        while(j>=b)
        {
            k=k*b;
            j=j/b;
        }
        while(k>0)
        {
            i=n/k;
            switch(i)
            {
                case 10:System.out.print("A ");break;
                case 11:System.out.print("B ");break;
                case 12:System.out.print("C ");break;
                case 13:System.out.print("D ");break;
                case 14:System.out.print("E ");break;
                case 15:System.out.print("F ");break;
                default:System.out.print(i+" ");
            }
            n=n%k;
            k=k/b;
        }
    }
}