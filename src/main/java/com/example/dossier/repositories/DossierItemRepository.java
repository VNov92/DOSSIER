package com.example.dossier.repositories;

import com.example.dossier.models.DossierItem;
import java.sql.Timestamp;
import java.time.LocalDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface DossierItemRepository extends JpaRepository<DossierItem, Long> {

  @Procedure
  void add_dossier_item(
      String dossier,
      long itemType,
      long unitId,
      long quantity,
      LocalDate expirationDate,
      String userCreated,
      String userModified,
      Timestamp createdDate,
      Timestamp modifiedDate);
}
