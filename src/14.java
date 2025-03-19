import java.util.Random;

public class MathHomework {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10) + 1;
        System.out.println("The answer is: " + number);
    }
}
