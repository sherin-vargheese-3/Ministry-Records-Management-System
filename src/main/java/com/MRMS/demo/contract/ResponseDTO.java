package com.MRMS.demo.contract;

import com.MRMS.demo.model.Document;
import lombok.Builder;

import java.awt.print.Pageable;

@Builder
public class ResponseDTO {

    private Document content;
    private Pageable pageable;
    private Long totalElements;
    private Long totalPages;
    private String last;
    private String first;
    private Long size;
    private Long number;
    private Long numberOfElements;
    private String empty;
}