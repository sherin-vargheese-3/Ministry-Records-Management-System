package com.MRMS.demo.model;

import com.MRMS.demo.enums.ApprovalStatus;
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
public class Approval {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Document workflow;
    private Department approverDepartment;
    private ApprovalStatus approvalStatus;
    private LocalDate approvalDate;
    private Long approverId;
    private String Comments;
}
