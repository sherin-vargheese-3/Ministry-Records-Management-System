package com.MRMS.demo.model;

import com.MRMS.demo.enums.DocumentType;
import com.MRMS.demo.enums.SecurityClassification;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
@Getter
@Setter
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true)
    private String documentNumber;
    private String title;
    private String description;
    private LocalDate creationDate;
    private Department ownerDepartment;
    private DocumentType documentType;
    private SecurityClassification securityClassification;
    private String digitalFileLocation;
    private String version;
}