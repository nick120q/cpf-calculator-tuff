import java.util.Scanner;

public class CPF {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int digito1, digito2, n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11;

        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextInt();
        n5 = sc.nextInt();
        n6 = sc.nextInt();
        n7 = sc.nextInt();
        n8 = sc.nextInt();
        n9 = sc.nextInt();
        n10 = sc.nextInt();
        n11 = sc.nextInt();


        digito1 = ((n1 * 10) + (n2 * 9) + (n3 * 8) + (n4 * 7) + (n5 * 6) + (n6 * 5) + (n7 * 4) + (n8 * 3) + (n9 * 2)) % 11;
        if (digito1 == 0 || digito1 == 1) {
            digito1 = 0;
        } else {
            digito1 = 11 - digito1;
        }
        digito2 = ((n1 * 11) + (n2 * 10) + (n3 * 9) + (n4 * 8) + (n5 * 7) + (n6 * 6) + (n7 * 5) + (n8 * 4) + (n9 * 3) + (digito1 * 2)) % 11;
        if (digito2 == 0 || digito2 == 1) {
            digito2 = 0;
        } else {
            digito2 = 11 - digito2;
        }

        if (n10 == digito1 && n11 == digito2) {
            IO.println("CPF válido");
        } else {
            IO.println("CPF inválido");
        }
    }
}