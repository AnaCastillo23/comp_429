//Importing tools
import java.util.Scanner;

public class chat {
    public static void main(String[] args) {

        //Scanner to get user input
        Scanner scanner_for_help = new Scanner(System.in);
        System.out.println("\n*************WELCOME TO iCHAT**************\n");
        System.out.println("Type 'help' for information about the available user interface options.");
        String help_string_holder = scanner_for_help.nextLine();


        if (help_string_holder.equals("help")) {

            Scanner input = new Scanner(System.in);
            boolean mainLoop = true;

            int choice = 0;
            while (choice != 4) {
                System.out.println("\n");
                System.out.println("*************INTERFACE OPTIONS**************");
                System.out.println("1)myip: display IP address");
                System.out.println("2)connect: connect to another peer");
                System.out.println("3)send: send messages to peers");
                System.out.println("4)Exit");
                System.out.println("\nPlease enter your option");

                choice = input.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("myIp\n");
                        break;
                    case 2:
                        System.out.println("connect\n");
                        break;
                    case 3:
                        System.out.println("send\n");
                        break;
                    case 4:
                        System.out.println("Exiting Program...");
                        System.out.println("Have a good day!");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Command not found. Please enter 1,2,3 or 4\n");
                        break;
                }
            }
        } else {
            System.out.println("Command not found. Please type 'help' for information about the available user interface options or command manual.");
            System.exit(0);
        }
    }
}
