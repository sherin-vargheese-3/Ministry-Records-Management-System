package com.MRMS.demo.service;

import com.MRMS.demo.contract.ResponseDTO;
import com.MRMS.demo.enums.DocumentType;
import com.MRMS.demo.enums.SecurityClassification;
import com.MRMS.demo.model.Document;
import com.MRMS.demo.repository.DocumentRepository;

import java.time.LocalDate;
import java.util.List;

public class DocumentService {

    private final DocumentRepository documentRepository;

    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public List<ResponseDTO> getDocument(
            String title,
            String documentNumber,
            String departmentCode,
            DocumentType documentType,
            SecurityClassification securityClassification,
            LocalDate createdFrom, LocalDate createdTo) {
        List<Document> documentsByDocumentNumber = documentRepository.findByDocumentNumber(documentNumber);
        List<Document> documentsByTitle = documentRepository.findAllByTitle(title);
        List<Document> documentsByDepartmentCode = documentRepository.findByDepartment_DepartmentCode(departmentCode);
        List<Document> documentsByDocumentType = documentRepository.findAllByDocumentType(documentType);
        List<Document> documentsBySecurityClassification = documentRepository.findAllBySecurityClassification(securityClassification);
        List<Document> documentsByCreationDate = documentRepository.findByCreationDate(createdFrom, createdTo);

    }
}
