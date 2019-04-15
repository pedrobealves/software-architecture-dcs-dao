package br.edu.utfpr.service;

import br.edu.utfpr.dto.ClientDTO;
import br.edu.utfpr.exception.DuplicatedClientException;

import java.util.List;

public class ClientService {
    public void create(ClientDTO cliente) throws DuplicatedClientException {

        if (this.list().stream().anyMatch(c -> c.getNome().equalsIgnoreCase(cliente.getNome())))
            throw new DuplicatedClientException(cliente.getNome());

    }

    public List<ClientDTO> list() {
        return null;
    }
}
