import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            Contador.contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            exception.printStackTrace();
        }
    }
}
