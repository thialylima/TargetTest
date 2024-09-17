import java.util.Scanner;

public class CountAInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();
        scanner.close();

        int count = countA(input);
        System.out.println("A letra 'a' aparece " + count + " vezes na string.");
    }

    public static int countA(String input) {
        int count = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        return count;
    }
}
