package exceptions;

import java.util.UUID;

public class ParametrosInvalidosException extends Exception {
  private static final UUID serialVersionUID = UUID.randomUUID();

  public ParametrosInvalidosException() {
    super();
  }

  public ParametrosInvalidosException(String msg) {
    super(serialVersionUID + " : " + msg);
  }

  public ParametrosInvalidosException(String msg, Throwable cause) {
    super(serialVersionUID + " : " + msg, cause);
  }
}