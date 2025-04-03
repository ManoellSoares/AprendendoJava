package ControleFluxo;
import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

public class Contador {

    public static void main(String [] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.print("Primeiro parametro: ");
        int primeiroParametro = terminal.nextInt();

        System.out.print("Segundo parametro: ");
        int segundoParametro = terminal.nextInt();

        try {

            contar(primeiroParametro, segundoParametro);

        } catch (ParametrosInvalidosException e) {

            System.out.println(e.getMessage());
            terminal.close();

        }

    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {

        if(primeiroParametro >= segundoParametro) {

            throw new ParametrosInvalidosException("O primeiro parametro precisa ser menor que o segundo");

        }

        int contagem =  segundoParametro - primeiroParametro;

        for(int i = 0; i <= contagem; i++){

            System.out.printf("N°: %d \n", i);

        }

    }
}


