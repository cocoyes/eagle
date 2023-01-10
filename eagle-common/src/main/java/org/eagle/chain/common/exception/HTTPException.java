package org.eagle.chain.common.exception;

/**
 * HTTPException wraps generic HTTP errors.
 */
public class HTTPException extends EagleException {
  /**
   * Initializes exception with its message attribute.
   * @param message error message
   */
  public HTTPException(String message) {
    super(message);
  }

  /**
   * Initializes new exception while storing original cause.
   * @param message the error message
   * @param cause the original cause
   */
  public HTTPException(String message, Throwable cause) {
    super(message, cause);
  }
}
