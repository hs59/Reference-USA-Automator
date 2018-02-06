package main.Java.com.tersch.main;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        // Welcome message
        Messages msg = new Messages();
        msg.welcomeMessage();

        // Scanner obj to get username and password from user
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your username?: ");
        String username = scan.nextLine();
        System.out.println("What is your password?: ");
        String password = scan.nextLine();

        // Create new client and pass credentials
        Authenticate client = new Authenticate(username, password);

        // Login
        client.login();

        /** // Scrape some stuff
         String page = client.get("https://calgary.bibliocommons.com/user_dashboard");
         Elements header = Jsoup.parse(page).select("cp_header");
         for(Element message : header) {
         System.out.println(message.text() + "\n");
         */

    }
}
