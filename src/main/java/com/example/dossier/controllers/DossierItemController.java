package com.example.dossier.controllers;

import com.example.dossier.models.DossierItemHolder;
import com.example.dossier.services.impl.DossierItemService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/dossier-item")
public class DossierItemController {

  private final DossierItemService dossierItemService;

  public DossierItemController(DossierItemService dossierItemService) {
    this.dossierItemService = dossierItemService;
  }

  @PostMapping
  public ResponseEntity<?> createDossierItem(
      @RequestBody @Valid DossierItemHolder dossierItemHolder) {
    dossierItemService.save(dossierItemHolder);
    return ResponseEntity.ok().build();
  }

  @GetMapping
  public ResponseEntity<String> index() {
    return new ResponseEntity<>("Hello Postman", HttpStatus.OK);
  }
}
