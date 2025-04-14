package com.example.productEX.product.dto;

import lombok.Data;

import java.util.List;

@Data
public class ProductReadDTO {

    private Long pno;
    private String pname;
    private String pdesc;
    private String seller;
    private List<String> imNames;

    public ProductReadDTO(Long pno, String pname, String pdesc, String seller, List<String> imNames) {
        this.pno = pno;
        this.pname = pname;
        this.pdesc = pdesc;
        this.seller = seller;
        this.imNames = imNames;
    }
}
