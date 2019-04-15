package br.edu.utfpr.dto;

import br.edu.utfpr.exception.OutCharacterClientException;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ClientDTO {
    private int id;
    private String name;
    private int age;
    private String telphone;
    private double creditLimit;
    private CountryDTO country;

    public void setNome(String name) throws OutCharacterClientException {
        if (name.length() < 5)
            throw new OutCharacterClientException(name);

        this.name = name;
    }
}
