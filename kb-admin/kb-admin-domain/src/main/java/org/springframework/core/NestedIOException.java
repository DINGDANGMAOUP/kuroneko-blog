package org.springframework.core;


public class NestedIOException extends Exception {

  public NestedIOException(String msg) {
    super(msg);
  }

  public NestedIOException(String msg, Throwable cause) {
    super(msg, cause);
  }
}
