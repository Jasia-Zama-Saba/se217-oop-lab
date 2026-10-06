import java.util.Scanner;;
public class Scanneruserinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x;
        

        System.out.println("Enter the value of x: ");
        x = input.nextDouble();
        System.out.println("X = "+ x);
     
        String s=input.nextLine();
        s = input.nextLine();
        System.out.println("You Entered : " + s);
       
        

        input.close();
    }
}
