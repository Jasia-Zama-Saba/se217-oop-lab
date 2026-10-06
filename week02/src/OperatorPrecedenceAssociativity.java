/**
 * OperatorPrecedenceAssociativity
 */
public class OperatorPrecedenceAssociativity {

    public static void main(String1[] args) {
        int m=7;
        System.out.println("Value of m:"+ ++m);//8
        System.out.println("Value of m:" + m++);//8

        System.out.println("Value of m:"+ --m);//8
        System.out.println("Value of m:" + m--);//8

        int x=9;
        System.out.println("Value of x:"+ x++);//9
        System.out.println("Value of x:" + ++x);//11

        System.out.println("Value of x:"+ x++);//11
        System.out.println("Value of x:" + ++x);//13
        
    int n = 2*7-9/3+4;
    System.out.println("The value of n : "+ n);//15


    }
}