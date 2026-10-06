public class Forloop {
    public static void main(String1[] args) {
        //even number 1-19
        for(int i=1;i<20;i+=2){
            System.out.println(i);
        }
        System.out.println("\n");

        for(int i=100;i>0;i-=10){
            System.out.println(i);
        }
    System.out.println("\n"); 
  int sum =0;
        for(int i=30;i<=120;i++){
            if(i%3==0 && i%5==0){
                 sum += i;
                //System.out.println(sum);
            }
        }
        System.out.println(sum);
    }
}
