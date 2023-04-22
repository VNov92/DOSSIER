package com.example.dossier.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Table(name = "dossier_item")
public class DossierItem {

  @Id
  @GeneratedValue
  @Column(name = "ID")
  private long id;
  @Column(name = "DOSSIER_ID")
  private String dossierId;
  @Column(name = "ITEM_TYPE")
  private long itemType;
  @Column(name = "UNIT_ID")
  private long unitId;

  @Column(name = "QUANTITY")
  private long quantity;
  @Column(name = "EXPIRATION_DATE")
  private LocalDate expirationDate;
  @Column(name = "USER_INSERT_ID")
  private String userInsertId;
  @Column(name = "USER_UPDATE_ID")
  private String userUpdateId;
  @Column(name = "DATE_INSERT")
  private Timestamp dateInsert;
  @Column(name = "DATE_UPDATE")
  private Timestamp dateUpdate;

  // constructor, getters, setters

  public String getDossierId() {
    return dossierId;
  }

  public void setDossierId(String dossierId) {
    this.dossierId = dossierId;
  }

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

  public LocalDate getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUserInsertId() {
    return userInsertId;
  }

  public void setUserInsertId(String userInsertId) {
    this.userInsertId = userInsertId;
  }

  public String getUserUpdateId() {
    return userUpdateId;
  }

  public void setUserUpdateId(String userUpdateId) {
    this.userUpdateId = userUpdateId;
  }

  public Timestamp getDateInsert() {
    return dateInsert;
  }

  public void setDateInsert(Timestamp dateInsert) {
    this.dateInsert = dateInsert;
  }

  public Timestamp getDateUpdate() {
    return dateUpdate;
  }

  public void setDateUpdate(Timestamp dateUpdate) {
    this.dateUpdate = dateUpdate;
  }
}
