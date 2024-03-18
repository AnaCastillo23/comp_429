//Importing tools
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class chat {
    public static void main(String[] args) {

        //Scanner to get user input
        Scanner scanner_for_help = new Scanner(System.in);
        System.out.println("\n*************WELCOME TO iCHAT**************\n");
        System.out.println("Type 'help' for information about the available user interface options.");
        System.out.println("Else, type 'exit' to exit this program.\n");
        System.out.println("Please enter your option: ");


        String help_string_holder = scanner_for_help.nextLine();

        try {
            if (help_string_holder.equals("help")) {

                Scanner input = new Scanner(System.in);

                int choice = 0;
                while (choice != 7) {
                    System.out.println("\n*************INTERFACE OPTIONS**************\n");
                    System.out.println("Available user interface options:");
                    System.out.println("1)myIP: Display the IP address of this process");
                    System.out.println("2)myPort: Display the port in which this process is listening for incoming connections");
                    System.out.println("3)Connect: Establish a new TCP connection to the specified destination and port");
                    System.out.println("4)List: List of all the connections this process is part of");
                    System.out.println("5)Terminate: Terminate the connection");
                    System.out.println("6)send: send messages to peers");
                    System.out.println("7)Exit: Close all connections and terminate this process");
                    System.out.println("\nPlease enter the number of your choice: ");


                    choice = input.nextInt();
                    //WE STILL NEED TO IMPLEMENT ERROR CHECKING FOR choice TO MAKE SURE USER DOES NOT INPUT A STRING


                    switch (choice) {
                        case 1:
                            // TO SHOW THE ACTUAL IP ADDRESS OF THE COMPUTER
                            System.out.println("\nmyIP:");
                            InetAddress myIP = InetAddress.getLocalHost();
                            System.out.println("The IP address is " + myIP.getHostAddress());
                            break;
                        case 2:
                            System.out.println("myPort");
                            break;
                        case 3:
                            System.out.println("Connect");
                            break;
                        case 4:
                            System.out.println("List");
                            break;
                        case 5:
                            System.out.println("terminate");
                            break;
                        case 6:
                            System.out.println("send");
                            break;
                        case 7:
                            System.out.println("Exiting program...");
                            System.out.println("Have a good day!");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Command not found. Please enter a number 1-7.\n");
                            break;
                    }
                }
            } else if (help_string_holder.equals("exit")) {
                System.out.println("Exiting program...");
                System.out.println("Have a good day!");
                System.exit(0);
            } else {
                System.out.println("Command not found. Please try again.\n");
                System.exit(0);
            }
        } catch (InputMismatchException e) {
            // TO MAKE SURE USER HAS INPUTTED THE RIGHT TYPE OF INPUT
            System.out.print("Command not found. Please try again.\n");
            System.exit(0);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
