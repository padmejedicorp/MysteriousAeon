import java.util.Scanner;

public class CrypticEmpyreal {
    private String message;
    private int attempts;

    public CrypticEmpyreal() {
        this.message = "Rdvh jxuqj sd rdvhj, htrj kxn jxuqj sd jxuqj.";
        this.attempts = 0;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Can you decipher the cryptic message?");

        while (true) {
            displayMessage();
            System.out.print("Enter your guess: ");
            String guess = scanner.nextLine();

            if (decode(guess)) {
                System.out.println("Congratulations! You've deciphered the message.");
                break;
            } else {
                System.out.println("Sorry, that's not correct. Keep trying.");
                attempts++;
            }
        }

        System.out.println("You solved the message in " + (attempts + 1) + " attempts!");
    }

    private void displayMessage() {
        String decodedMessage = decode(message);
        System.out.println("Cryptic Message: " + message);
        System.out.println("Decoded Message: " + decodedMessage);
    }

    private boolean decode(String input) {
        // Perform your decoding logic here
        // For simplicity, we'll just compare the input to a known decoded message
        String decodedMessage = "When the night is darkest, heroes are born.";
        return input.equalsIgnoreCase(decodedMessage);
    }

    public static void main(String[] args) {
        CrypticEmpyreal crypticGame = new CrypticEmpyreal();
        crypticGame.play();
    }
}
