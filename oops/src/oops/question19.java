package oops;

import java.util.Optional;  // ✅ Add this
import java.util.Scanner;

public class question19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter address (or press Enter to simulate null): ");
        String input = sc.nextLine();

        String address = input.isEmpty() ? null : input;
        Optional<String> optionalAddress = Optional.ofNullable(address);

        String result = optionalAddress.orElse("India");
        System.out.println("Address: " + result);
        sc.close();
    }
}
