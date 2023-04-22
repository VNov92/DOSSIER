package com.example.dossier.services.impl;

import com.example.dossier.models.DossierItemHolder;
import com.example.dossier.repositories.DossierItemRepository;
import com.example.dossier.services.IDossierItemService;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.springframework.stereotype.Service;

@Service
public class DossierItemService implements IDossierItemService {

  private final DossierItemRepository dossierItemRepository;

  public DossierItemService(DossierItemRepository dossierItemRepository) {
    this.dossierItemRepository = dossierItemRepository;
  }

  @Override
  public void save(DossierItemHolder dossierItemHolder) {
    dossierItemHolder.getDossierItems().forEach(item -> {
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      LocalDate expirationDate = LocalDate.parse(item.getExpirationDate(), formatter);
      Timestamp createdDate = new Timestamp(System.currentTimeMillis());

      String createdBy = "vunt";
      dossierItemRepository.add_dossier_item(
          dossierItemHolder.getDossierId(),
          item.getItemType(),
          item.getUnitId(),
          item.getQuantity(),
          expirationDate,
          createdBy,
          createdBy,
          createdDate,
          createdDate
      );
    });
  }
}
