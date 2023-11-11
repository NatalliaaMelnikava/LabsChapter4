import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Dog puppy = new Dog("Sharick");
        Main main = new Main();
        main.console(puppy);
    }
    public void console(Dog puppy) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the command: ");
        int choice;
        do {
            System.out.println("Command pallet");
            System.out.println("0 - quite");
            System.out.println("1 - run");
            System.out.println("2 - jump");
            System.out.println("3 - bite");
            System.out.println("4 - name");
            System.out.println("5 - bark");
            System.out.println("Choice: ");
            choice = scan.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Good-bye");
                    break;
                case 1:
                    puppy.run();
                    break;
                case 2:
                    puppy.jump();
                    break;
                case 3:
                    puppy.bite();
                    break;
                case 4:
                    System.out.println("My name is "
                            + puppy.getName());
                    break;
                case 5:
                    puppy.bark();
                    break;
                default:
                    System.out.println("Sorry, but "
                            + choice + "isn't a valid choice");
            }
        } while (choice != 0);
    }
}