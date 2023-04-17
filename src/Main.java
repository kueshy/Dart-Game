import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard=new Scanner(System.in);

        System.out.println("Enter the first(x) coordinate");
        int x=keyboard.nextInt();


        System.out.println("Enter the second(y) coordinate");
        int y=keyboard.nextInt();

        System.out.println(score(x,y));
    }

    public static String score(int x, int y){
        double distance_to_origin = Math.sqrt(x*x + y*y);

        if(distance_to_origin > 10){
            return "Score is "+ 0;
        }else if (distance_to_origin > 5){
            return "Score is "+ 1;
        }else if(distance_to_origin > 1){
            return "Score is "+ 5;
        }else {
            return "Score is "+ 10;
        }
    }
}