public class Q1_Multiples_Of_3_Or_5 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=3;i<1000;i++){
            if(i%3==0 || i%5==0){
                sum += i;
            }
        }
        System.out.println("The sum of all the multiples of 3 or 5 below 1000 is: "+sum);
    }
}
