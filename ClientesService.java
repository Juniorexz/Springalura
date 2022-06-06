package github.juniorexz.service;

//import github.juniorexz.model.Cliente;
import github.juniorexz.repository.ClientesRepository;
//import ch.qos.logback.core.net.server.Client;
//import github.juniorexz.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import github.juniorexz.model.Cliente;

@Service
public class ClientesService {

    private ClientesRepository repository;

    public ClientesService(ClientesRepository repository) {
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        //ClientesService clientesRepository = new ClientesService();
        repository.persistir(cliente);
        //acessar a base e salva o cliente
    }

@Autowired private ClientesRepository repository;


    @Autowired private ClientesService repository;

    public void validarCliente(Cliente cliente){

    }
}
