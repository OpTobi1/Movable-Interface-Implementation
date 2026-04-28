package moveKITA;
import java.util.Random;

public class MainLab7 {
    public static void main(String[] args) {
        Movable[] items = {
                new Ball(),
                new Car(),
                new Player("John")
        };

        System.out.println("####### CREATE #######");
        printAll(items);

        simulateMovement(items);

        System.out.println("\n####### START #######");
        printAll(items);
        System.out.println("####### END #######");
    }

    public static void printAll(Movable[] items) {
        for (Movable m : items) {
            System.out.println(m);
        }
    }

    public static void simulateMovement(Movable[] items) {
        Random rand = new Random();
        for (Movable m : items) {
            // Random horizontal movement for all
            int left = rand.nextInt(11);
            int right = rand.nextInt(11);
            for (int i = 0; i < left; i++) m.moveLeft();
            for (int i = 0; i < right; i++) m.moveRight();

            // Random vertical movement only for Ball
            if (m instanceof Ball) {
                Ball b = (Ball) m;
                int up = rand.nextInt(11);
                int down = rand.nextInt(11);
                for (int i = 0; i < up; i++) b.moveUp();
                for (int i = 0; i < down; i++) b.moveDown();
            }
        }
    }
}