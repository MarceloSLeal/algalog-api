package com.algaworks.algalog.api.controller;

import com.algaworks.algalog.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar() {
        var cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("João");
        cliente1.setTelefone("11 99999-1111");
        cliente1.setEmail("joaodascouves@email.com");

        var cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("Maria");
        cliente2.setTelefone("11 98888-1111");
        cliente2.setEmail("mariadasilva@email.com");

        return Arrays.asList(cliente1,cliente2);
    }

}
