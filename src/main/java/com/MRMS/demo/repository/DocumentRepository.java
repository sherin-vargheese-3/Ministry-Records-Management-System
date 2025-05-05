package com.MRMS.demo.repository;

import com.MRMS.demo.enums.DocumentType;
import com.MRMS.demo.enums.SecurityClassification;
import com.MRMS.demo.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface DocumentRepository extends JpaRepository<Document, Long>{
    List<Document> findByDocumentNumber(String documentNumber);
    List<Document> findAllByTitle(String title);
    List<Document> findByDepartment_DepartmentCode(String departmentCode);
    List<Document> findAllByDocumentType(DocumentType documentType);
    List<Document> findAllBySecurityClassification(SecurityClassification securityClassification);
    List<Document> findByCreationDate(LocalDate createdFrom, LocalDate createdTo);
}
