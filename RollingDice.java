import java.util.Random;

public class RollingDice {
    public static void main(String[] args){
        Random number = new Random();
        int x = number.nextInt(6)+1;
        System.out.println("you rolled a:"+ x);

    }
}
