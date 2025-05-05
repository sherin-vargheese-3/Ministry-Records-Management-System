package com.MRMS.demo.controller;

import com.MRMS.demo.contract.ResponseDTO;
import com.MRMS.demo.enums.DocumentType;
import com.MRMS.demo.enums.SecurityClassification;
import com.MRMS.demo.service.DocumentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/documents")
public class DocumentController {

    private final DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<ResponseDTO>> getDocument(
            @RequestParam String documentNumber,
            @RequestParam String title,
            @RequestParam String departmentCode,
            @RequestParam DocumentType documentType,
            @RequestParam SecurityClassification securityClassification,
            @RequestParam LocalDate createdFrom, @RequestParam LocalDate createdTo){
        return ResponseEntity.ok(documentService.getDocument(
                title,
                documentNumber,
                departmentCode,
                documentType,
                securityClassification,
                createdFrom, createdTo));
    }
}
