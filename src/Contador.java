import java.util.Scanner;
import exceptions.ParametrosInvalidosException;

public class Contador {
  private Contador() {
  }

  static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    if (parametroUm > parametroDois) {
      throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
    }
    int contagem = parametroDois - parametroUm;

    for (int i = 0; i <= contagem; i++) {
      System.out.println(parametroUm + i);
    }
  }
}
