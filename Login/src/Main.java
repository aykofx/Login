import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner for user input
		Scanner scanner = new Scanner(System.in);
		
		// Stores usernames and passwords during the session
		HashMap<String, String> users = new HashMap<>();
		
		// Keep the main menu running
		boolean running = true;
		
		while (running) {
			// Display main menu
			System.out.println("\n==== Login System ====");
			System.out.println("1. Register new User");
			System.out.println("2. Login");
			System.out.println("3. End");
			
			String choice = scanner.nextLine();
			
			switch (choice) {
			
			// Register a new user
			case "1":
				
				System.out.println("New username: ");
				String newUser = scanner.nextLine();
				
				// Check if username already exists
				if (users.containsKey(newUser)) {
					System.out.println("Username already exists.");
				} else { // If not, promopt for password and save user
					System.out.println("New password: ");
					String newPassword = scanner.nextLine();
					users.put(newUser, newPassword);
					System.out.println("Successfully registered.");
				}
				break;
			
			// Attempt login with existing user
			case "2":
				
				System.out.println("Username: ");
				String loginUser = scanner.nextLine();
				System.out.println("Password: ");
				String loginPass = scanner.nextLine();
				
				// If username and password matches the HashMap
				if (users.containsKey(loginUser) && users.get(loginUser).equals(loginPass)) {
					System.out.println("Login successful");
				} else {
					System.out.println("Username or password wrong.");
				}
				break;
				
			// Exit the program
			case "3":
				
				// Set running to false = while loop stops
				running = false;
				System.out.println("Program closed.");
				break;
				
			default: System.out.println("Invalid number, try again.");
				
			}
			
		}
		
		// Close scanner to prevent memory leak
		scanner.close();
	}

}
