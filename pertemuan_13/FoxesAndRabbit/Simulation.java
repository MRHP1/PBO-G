import java.util.Random;

public class Simulation {
    public static void main(String[] args) {
        Animal rabbit = new Rabbit();
        Animal fox = new Fox();
        Random random = new Random();

        System.out.println("Starting simulation...\n");

        for (int day = 1; day <= 15; day++) {
            System.out.println("Day " + day + ":");
            rabbit.act();
            fox.act();

            // Simulate random events
            if (random.nextInt(10) < 2) {
                System.out.println("Rabbit encountered a predator and died.");
                rabbit = new Rabbit(); // Spawn a new rabbit
            }
            System.out.println();
        }
    }
}
