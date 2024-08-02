package unah.ejercicio_examen2.hn.bancos.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.ejercicio_examen2.hn.bancos.modelos.Cliente;
import unah.ejercicio_examen2.hn.bancos.repositorios.ClienteRepositorio;

@Service
public class ClienteServicio {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public List<Cliente> obtenerTodos(){
        return this.clienteRepositorio.findAll();
    }
}
