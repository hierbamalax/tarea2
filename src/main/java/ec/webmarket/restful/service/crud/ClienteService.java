package ec.webmarket.restful.service.crud;

import org.springframework.stereotype.Service;

import ec.webmarket.restful.domain.Cliente;
import ec.webmarket.restful.persistence.ClientePersistence;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClientePersistence clientePersistence;

    public ClienteService(ClientePersistence clientePersistence) {
        this.clientePersistence = clientePersistence;
    }

    public List<Cliente> listarClientes() {
        return clientePersistence.findAll();
    }

    public Optional<Cliente> obtenerClientePorId(Long id) {
        return clientePersistence.findById(id);
    }

    public Cliente guardarCliente(Cliente cliente) {
        return clientePersistence.save(cliente);
    }

    public void eliminarCliente(Long id) {
        clientePersistence.deleteById(id);
    }
}
