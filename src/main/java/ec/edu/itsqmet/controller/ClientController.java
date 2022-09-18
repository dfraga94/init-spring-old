package ec.edu.itsqmet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.itsqmet.service.IClienteService;
import ec.edu.itsqmet.service.impl.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {
	//private ClientService cs = new ClientService();
	@Autowired
	private IClienteService cs;
	
	@GetMapping("/saludar")
	public String saludar() {

		return cs.saludar();
	}

}
