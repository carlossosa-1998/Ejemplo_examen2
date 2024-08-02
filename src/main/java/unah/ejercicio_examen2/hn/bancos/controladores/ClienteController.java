package unah.ejercicio_examen2.hn.bancos.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.ejercicio_examen2.hn.bancos.modelos.Cliente;
import unah.ejercicio_examen2.hn.bancos.servicios.ClienteServicio;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteServicio clienteServicio;

    @GetMapping("/obtener/todos")
    public List<Cliente> obtenerTodos() {
        return this.clienteServicio.obtenerTodos();
    }
    
}
