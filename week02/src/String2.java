/**
 * Stringsplit
 */
public class String2 {

    public static void main(String[] args) {
    String s= "I@love@my@country";
    String [] a= s.split("@");
    for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
    }
    }
}