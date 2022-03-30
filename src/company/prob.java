package company;

public class prob {
    public static void main(String[] args) {
        int i,c=0;
        double p=0.0;
        for(i=1;i<=6;i++){
            if(i%2==0){
                c++;
            }
        }
        p=c/3;
        System.out.println(c);
        System.out.println("Probability of dice for even is " +p);
    }
}
