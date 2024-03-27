//  IMPORTING PROJECT TOOLS
import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class chat {
    public static void main(String[] args) {


        //COMMENTED SOCKET CODE AS APP DOES NOT RUN WHEN IS COMMENTED OUT
        //  CREATE SERVER SOCKET (DOOR)
        /* To welcome client's contact*/
        //final ServerSocket serverSocket;

        //  CLIENT CONTACTS SERVER BY:
        //  CREATE TCP CLIENT SOCKET
        /* Specify the IP address and port number of server process.
        * When created, client TCP establishes connection to server TCP.*/
        //final Socket clientSocket;

        //  TO READ DATA FROM THE clientSocket
        //final BufferedReader in;
        //  TO WRITE DATA INTO THE clientSocket
        //final PrintWriter out;


        //  INITIATE serverSocket
        /*try {
            serverSocket = new ServerSocket(29001);
            clientSocket = serverSocket.accept();
            //  TO WRITE TO THE clientSocket
            out = new PrintWriter(clientSocket.getOutputStream());
            //  TO READ FROM THE clientSocket
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        //INITIATE clientSocket









        //  SCANNER TO GET USER INPUT
        Scanner scanner_for_help = new Scanner(System.in);
        System.out.println("\n*************WELCOME TO iCHAT**************\n");
        System.out.println("Type 'help' for information about the available user interface options.");
        System.out.println("Else, type 'exit' to exit this program.\n");
        System.out.println("Please enter your option: ");


        String help_string_holder = scanner_for_help.nextLine();

        //  USER MENU WITH ERROR CHECKING
        try {
            if (help_string_holder.equals("help")) {

                Scanner input = new Scanner(System.in);

                int choice = 0;
                while (choice != 7) {
                    System.out.println("\n*************INTERFACE OPTIONS**************\n");
                    System.out.println("Available user interface options:");
                    System.out.println("1) myIP: Display the IP address of this computer");
                    System.out.println("2) myPort: Display the port number in which this process runs on");
                    System.out.println("3) Connect: Establish a new TCP connection to the specified destination and port");
                    System.out.println("4) List: List of all the connections this process is part of");
                    System.out.println("5) Terminate: Terminate the connection");
                    System.out.println("6) send: send messages to peers");
                    System.out.println("7) Exit: Close all connections and terminate this process");
                    System.out.println("\nPlease enter the number of your choice: ");

                    choice = input.nextInt();

                    switch (choice) {
                        case 1:
                            // TO SHOW THE ACTUAL IP ADDRESS OF THE COMPUTER
                            System.out.println("\nmyIP:");
                            InetAddress myIP = InetAddress.getLocalHost();
                            System.out.println("The IP address is " + myIP.getHostAddress());
                            break;
                        case 2:
                            //  TO PRINT THE PASSED PORT NUMBER FROM THE COMMAND LINE ARGUMENT
                            /* DELETE THIS COMMENT LATER->THIS SECTION ONLY RUNS IN THE COMMAND PROMPT, NOT IN HERE AS WE NEED TO PASS IN A COMMAND LINE ARGUMENT
                              WHEN RUNNING PROGRAM */
                            System.out.println("\nmyPort:");
                            System.out.println("The program runs on port number " + args[0]);
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
                //  CLOSING PROGRAM WHEN USER TYPES ANOTHER THING OTHER THAN help OR exit
                System.out.println("Command not found. Please try again.\n");
                System.exit(0);
            }
        } catch (InputMismatchException e) {
            //  HANDLING USER INPUT WHEN AN EXCEPTION OCCURS (USER TYPE INCORRECT INPUT TYPE)
            System.out.print("Command not found. Please try again.\n");
            System.exit(0);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
