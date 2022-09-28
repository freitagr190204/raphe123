import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1252");
        System.out.println("Wieviele Primzahlen wollen Sie?");
        int i = sc.nextInt();
        EratosthenesPrimeSieve eps = new EratosthenesPrimeSieve(i);
        eps.printPrimes();
    }
}