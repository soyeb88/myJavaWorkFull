package BasicJava;

import java.util.Random;

public class RandomNumberDemo {

    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10); //start from 0 to 9
        System.out.println("Random Number between 0 to 9: " + randomNumber);

        randomNumber = rand.nextInt(10) + 1; //start from 1 to 10
        System.out.println("Random Number between 1 to 10: : " + randomNumber);

        randomNumber = rand.nextInt(6) + 5; //start from 5 to 10
        System.out.println("Random Number between 5 to 10: " + randomNumber);

        randomNumber = rand.nextInt(91) + 10; //start from 10 to 100
        System.out.println("Random Number between 10 to 100: " + randomNumber);

        randomNumber = (int) (Math.random() * 10);
        System.out.println("Random Number between 1 to 9: " + randomNumber);

        randomNumber = (int) (Math.random() * 10) + 1;
        System.out.println("Random Number between 1 to 10: " + randomNumber);

        randomNumber = (int) (Math.random() * 6) + 5;
        System.out.println("Random Number between 5 to 10: " + randomNumber);

        randomNumber = (int) (Math.random() * 91) + 10;
        System.out.println("Random Number between 10 to 100: " + randomNumber);
    }
}
