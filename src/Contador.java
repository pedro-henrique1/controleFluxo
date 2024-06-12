import exeptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {

//    int num1;
//    int num2;

    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int num1 = ler.nextInt();
        System.out.println("Digite o segundo numero");
        int num2 = ler.nextInt();

        try {
            contar(num1, num2);

        } catch (Exception e) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro" + e.getMessage());
        }

    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException {
        if (num1 > num2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        int contagem = num2 - num1;


        for (int i = 0; i <= contagem; i++) {
            System.out.println("imprimindo o numero " + i);
        }

    }

}
