public class String1 {
    public static void main(String[] args) {
        String s = "Jasia Zaman Saba";
        String s1= "Bangladesh";

        System.out.println("Length = " + s.length());
        System.out.println("Upper = " + s.toUpperCase());
        System.out.println("Lower = " + s.toLowerCase());
        System.out.println("Character = " + s.charAt(6));

        System.out.println("\n");
        if(s.equals(s1)){
            System.out.println("This is equal");
        }
        else{
            System.out.println("Not equal");
        }

    }
}
