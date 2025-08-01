package io.github.ricardoandradem;

import java.util.Scanner;

public class ContaTerminal {

    private static final String PROMPT_GET_NUMERO = "Por favor, digite o número da conta: ";
    private static final String PROMPT_GET_AGENCIA = "Por favor, digite o número da Agência: ";
    private static final String PROMPT_GET_NOME = "Por favor, digite seu nome: ";
    private static final String PROMPT_GET_SALDO = "Por favor, digite o saldo: ";
    private static final String OUTPUT_MESSAGE =
            "\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s,\n" +
                    "conta %d e seu saldo %.2f já está disponível para saque.\n";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(PROMPT_GET_NUMERO);
        int numero = input.nextInt();
        System.out.print(PROMPT_GET_AGENCIA);
        String agencia = input.next();
        System.out.print(PROMPT_GET_NOME);
        String nome = input.next();
        System.out.print(PROMPT_GET_SALDO);
        int saldo = (int) (input.nextFloat() * 100);

        System.out.printf(OUTPUT_MESSAGE, nome, agencia, numero, ((float) saldo / 100 ));
    }
}