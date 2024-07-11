package btech.service;

import btech.model.concrete.Client;
import btech.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Transactional
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }
    @Transactional
    public Optional<Client> getClientById(Long id) {
        return clientRepository.findById(id);
    }
    @Transactional
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
    @Transactional
    public void deleteClientById(Long id) {
        clientRepository.deleteById(id);
    }
    @Transactional
    public Optional<Client> findClientByEmail(String email) {
        return clientRepository.findByEmail(email);
    }
}
