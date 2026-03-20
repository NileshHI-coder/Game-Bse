import java.util.Scanner;

public class AdventureGame {

    static int health = 100;
    static boolean hasSword = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🌲 Welcome to the Adventure Game!");
        System.out.println("You are lost in a forest...\n");

        System.out.println("Choose a path:");
        System.out.println("1. Go Left");
        System.out.println("2. Go Right");

        int choice = sc.nextInt();

        if (choice == 1) {
            leftPath(sc);
        } else if (choice == 2) {
            rightPath(sc);
        } else {
            System.out.println("Invalid choice. Game Over!");
        }

        sc.close();
    }

    static void leftPath(Scanner sc) {
        System.out.println("\nYou went LEFT and found a sword 🗡️!");
        hasSword = true;

        System.out.println("A wild monster appears! 👹");
        System.out.println("1. Fight");
        System.out.println("2. Run");

        int choice = sc.nextInt();

        if (choice == 1) {
            fightMonster();
        } else {
            System.out.println("You ran away safely. You survived!");
        }
    }

    static void rightPath(Scanner sc) {
        System.out.println("\nYou went RIGHT and fell into a trap! 🕳️");
        health -= 30;

        System.out.println("Health remaining: " + health);

        System.out.println("You see a monster ahead!");
        System.out.println("1. Fight");
        System.out.println("2. Run");

        int choice = sc.nextInt();

        if (choice == 1) {
            fightMonster();
        } else {
            System.out.println("You escaped, but you're injured. Game Over!");
        }
    }

    static void fightMonster() {
        if (hasSword) {
            System.out.println("\nYou used the sword and defeated the monster! 🏆");
            System.out.println("🎉 YOU WIN!");
        } else {
            System.out.println("\nYou have no weapon!");
            System.out.println("The monster attacked you... 💀");
            System.out.println("GAME OVER!");
        }
    }
}