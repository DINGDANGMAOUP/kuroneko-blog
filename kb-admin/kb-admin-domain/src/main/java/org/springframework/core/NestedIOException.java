package org.springframework.core;

import java.io.IOException;

public class NestedIOException extends Exception {

  public NestedIOException(String msg) {
    super(msg);
  }

  public NestedIOException(String msg, Throwable cause) {
    super(msg, cause);
  }
}
