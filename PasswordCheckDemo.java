import java.util.Scanner;

class InvalidPasswordException extends Exception {
    InvalidPasswordException(String s) {
        super(s);
    }
}

class PasswordCheckDemo {
    public static boolean isPasswordCorrect(String s) {
        boolean digitFlag = false;
        boolean symbolFlag = false;
        boolean lengthFlag = false;

        char[] temp = s.toCharArray();

        if (s.length() == 8) {
            lengthFlag = true;
        }

        for (char c : temp) {
            if (Character.isDigit(c)) {
                digitFlag = true;
                break;
            }
        }

        for (char c : temp) {
            if ((c < 32 || c > 126) || (c >= 32 && c <= 47) || (c >= 58 && c <= 64) || (c >= 91 && c <= 96) || (c >= 123)) {
                symbolFlag = true;
                break;
            }
        }

        return digitFlag && symbolFlag && lengthFlag;
    }

    public static void main(String[] args) {
        String name, password;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter login Id");
            name = sc.next();
            System.out.println("Enter password");
            password = sc.next();
            if (isPasswordCorrect(password)) {
                System.out.println("Login Successful!");
            } else {
                throw new InvalidPasswordException("Invalid password. It must be 8 characters long, include at least one digit, and one special symbol.");
            }
        } catch (InvalidPasswordException ipx) {
            System.out.println("Exception: " + ipx.getMessage());
        }
    }
}

*****OUTPUT****
D:\New folder>javac PasswordCheckDemo.java

D:\New folder>java PasswordCheckDemo
Enter login Id
paraskadam
Enter password
parask@1
Login Successful!
