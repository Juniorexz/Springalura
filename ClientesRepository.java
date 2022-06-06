package github.juniorexz.repository;

import ch.qos.logback.core.net.server.Client;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Repository;


import com.model.entity.Cliente;


@Entity
public class Cliente {}


@Repository
public class ClientesRepository {
    public void persistir(Cliente cliente){

    }

}
