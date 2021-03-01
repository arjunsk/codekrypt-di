package com.arjunsk.codekrypt.di.core.exceptions;

public class InvokeException extends RuntimeException {

  public InvokeException(String message) {
    super(message);
  }

  public InvokeException(String message, Throwable cause) {
    super(message, cause);
  }
}
