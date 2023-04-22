package com.example.dossier.models;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;

public class DossierItemHolder {

  @NotBlank
  private String dossierId;
  @NotNull
  @Valid
  List<DossierItemRequest> dossierItems;

  public String getDossierId() {
    return dossierId;
  }

  public void setDossierId(String dossierId) {
    this.dossierId = dossierId;
  }

  public List<DossierItemRequest> getDossierItems() {
    return dossierItems;
  }

  public void setDossierItems(List<DossierItemRequest> dossierItems) {
    this.dossierItems = dossierItems;
  }
}