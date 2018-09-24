import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        recorder(scanner);
        scanner.close();
    }

    private static void recorder(Scanner scanner) {
        System.out.println("Enter your year of birth");

        boolean hasNextInt = scanner.hasNextInt();

        //Checks if the user entered a string value
        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            int yearOfBirthLength = String.valueOf(yearOfBirth).length();

            //Checks if the user entered a negative or less than 4 digit value
            if(yearOfBirthLength < 4 || yearOfBirth <= 0) {
                System.out.println("Invalid year of birth. Please try again");
                recorder(scanner);
            }
            // handle next line character (enter key)
            scanner.nextLine();
            String name = getName(scanner);

            int age = 2018 - yearOfBirth;

            System.out.println("Your name is " + name + ", and you are " + age + " years old");

        } else {
            System.out.println("Invalid year of birth. Please try again");
            scanner.nextLine();
            recorder(scanner);
        }
    }

    private static String getName(Scanner scanner) {
        System.out.println("Enter your name: ");
        boolean hasNextInt = scanner.hasNextInt();

        //Checks if the user entered an integer
        if(!hasNextInt) {
            String name = scanner.nextLine();
            return name;
        }

        System.out.println("Name should start a letter. Please try again");
        scanner.nextLine();
        return getName(scanner);
    }

}
