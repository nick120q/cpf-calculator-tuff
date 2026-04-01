import java.util.Scanner;

public class CPF {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int digito1, digito2, n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11;
        String cpf;
        char n1c, n2c, n3c, n4c, n5c, n6c, n7c, n8c, n9c, n10c, n11c;

        IO.println("Qual seu cpf?");
        cpf = sc.nextLine();
        n1c = cpf.charAt(0);
        n2c = cpf.charAt(1);
        n3c = cpf.charAt(2);
        n4c = cpf.charAt(3);
        n5c = cpf.charAt(4);
        n6c = cpf.charAt(5);
        n7c = cpf.charAt(6);
        n8c = cpf.charAt(7);
        n9c = cpf.charAt(8);
        n10c = cpf.charAt(9);
        n11c = cpf.charAt(10);

        n1 = Character.getNumericValue(n1c);
        n2 = Character.getNumericValue(n2c);
        n3 = Character.getNumericValue(n3c);
        n4 = Character.getNumericValue(n4c);
        n5 = Character.getNumericValue(n5c);
        n6 = Character.getNumericValue(n6c);
        n7 = Character.getNumericValue(n7c);
        n8 = Character.getNumericValue(n8c);
        n9 = Character.getNumericValue(n9c);
        n10 = Character.getNumericValue(n10c);
        n11 = Character.getNumericValue(n11c);

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
        }else {
            IO.println("CPF inválido");
        }
    }
}