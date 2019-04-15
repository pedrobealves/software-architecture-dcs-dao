package br.edu.utfpr.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CountryDTO {
    private int id;
    private String name;
    private String abbrev;
    private int code;
}
