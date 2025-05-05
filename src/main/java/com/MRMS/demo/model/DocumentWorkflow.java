package com.MRMS.demo.model;

import com.MRMS.demo.enums.WorkflowState;
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
public class DocumentWorkflow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Document document;
    private WorkflowState workflowState;
    private LocalDate lastModifiedDate;
    private Long lastModifiedBy;
    private String comments;
}