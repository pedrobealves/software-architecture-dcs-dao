package br.edu.utfpr;

import br.edu.utfpr.dto.ClientDTO;
import br.edu.utfpr.dto.CountryDTO;
import br.edu.utfpr.exception.DuplicatedClientException;
import br.edu.utfpr.service.ClientService;

public class Main {

    public static void main(String[] args) {
        ClientService clientService = new ClientService();

        ClientDTO cliente = ClientDTO.builder().id(4).name("Pedro").age(21).creditLimit(7777).telephone("5555").country(CountryDTO.builder().id(1).name("Brazil").abbrev("BRA").code(5).build()).build();

        try {
            clientService.create(cliente);
            System.out.println(clientService.list()
            );
        } catch (DuplicatedClientException e) {
            e.printStackTrace();
        }

    }
}
