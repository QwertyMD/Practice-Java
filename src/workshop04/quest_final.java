package workshop04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class quest_final {
    public static char choice;

    public static void main(String[] args) {
        quest_final quest = new quest_final();
        quest.displayWelcome();
    }

    public void displayWelcome() {
        System.out.println("1. Sign Up");
        System.out.println("2. Quit Application");
        Scanner choices = new Scanner(System.in);
        System.out.println("Choose option: ");
        choice = choices.next().charAt(0);
        if (choice == '1') {
            signUp();
        } else if (choice == '2') {
            return;
        } else {
            System.out.println("Invalid Choice");
            displayWelcome();
        }
    }

    public void signUp() {
        String name, phone, pass, rePass, date;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter full name: ");
            name = scanner.nextLine();
        } while (!validateName(name));

        do {
            System.out.println("Enter phone number: ");
            phone = scanner.nextLine();
        } while (!validatePhone(phone));

        do {
            System.out.println("Enter password: ");
            pass = scanner.nextLine();
        } while (!validatePass(pass));

        do {
            System.out.println("Re-Enter password: ");
            rePass = scanner.nextLine();
        } while (!validateRePass(pass, rePass));

        do {
            System.out.println("Enter DOB (DD/MM/YYYY or MM/DD/YYYY): ");
            date = scanner.nextLine();
        } while (!validateDOB(date));

        System.out.println("SignUp completed successfully");
        displayWelcome();
    }

    public boolean validateName(String name) {
        if (name.length() <= 4) {
            System.out.println("Full name must be greater than four characters.");
            return false;
        }
        return true;
    }

    public boolean validatePhone(String phone) {
        if (!phone.matches("0\\d{9}")) {
            System.out.println("Phone number must have 10 digits starting with 0.");
            return false;
        }
        return true;
    }

    public boolean validatePass(String pass) {
        if (!pass.matches("^[A-Za-z].*[@&]\\d+$")) {
            System.out.println("Password must start with an alphabet, contain @ or & and end with numeric.");
            return false;
        }
        return true;
    }

    public boolean validateRePass(String pass, String rePass) {
        if (!pass.equals(rePass)) {
            System.out.println("Passwords do not match.");
            return false;
        }
        return true;
    }

    public boolean validateDOB(String date) {
        LocalDate dob;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[dd/MM/yyyy][MM/dd/yyyy]");
            dob = LocalDate.parse(date, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format.");
            return false;
        }

        int currentYear = LocalDate.now().getYear();
        int birthYear = dob.getYear();
        if (currentYear - birthYear < 21) {
            System.out.println("User must be at least 21 years old.");
            System.out.println("Failed to SignUp due to underage");
            displayWelcome();
        }
        return true;
    }
}