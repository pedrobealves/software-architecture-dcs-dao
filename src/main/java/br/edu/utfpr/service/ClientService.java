package br.edu.utfpr.service;

import br.edu.utfpr.dao.ClientDAO;
import br.edu.utfpr.dto.ClientDTO;
import br.edu.utfpr.exception.DuplicatedClientException;

import java.util.List;

public class ClientService {

    private ClientDAO clientDAO = new ClientDAO();

    public void create(ClientDTO client) throws DuplicatedClientException {

        if (this.list().stream().anyMatch(c -> c.getName().equalsIgnoreCase(client.getName())))
            throw new DuplicatedClientException(client.getName());

        clientDAO.create(client);

    }

    public List<ClientDTO> list() {
        return clientDAO.selectAll();
    }
}
