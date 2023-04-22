package com.example.dossier.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.springframework.validation.annotation.Validated;

@Validated
public class DossierItemRequest {

  @NotNull
  @Min(value = 1L)
  private long itemType;
  @NotNull
  @Min(value = 1L)
  private long unitId;
  @NotNull
  @Min(value = 1, message = "Quantity must be greater than 0")
  private long quantity;
  @Pattern(regexp = "\\d{2}/\\d{2}/\\d{4}")
  private String expirationDate;

  // constructor, getters, setters

  public long getItemType() {
    return itemType;
  }

  public void setItemType(long itemType) {
    this.itemType = itemType;
  }

  public long getUnitId() {
    return unitId;
  }

  public void setUnitId(long unitId) {
    this.unitId = unitId;
  }

  public long getQuantity() {
    return quantity;
  }

  public void setQuantity(long quantity) {
    this.quantity = quantity;
  }

  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }
}
