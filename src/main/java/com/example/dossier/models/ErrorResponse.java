package com.example.dossier.models;

import java.util.List;

public class ErrorResponse {
  private String message;
  private List<String> errors;

  public ErrorResponse() {
  }

  public ErrorResponse(String validationFailed, List<String> errors) {
    this.message = validationFailed;
    this.errors = errors;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(List<String> errors) {
    this.errors = errors;
  }
}
