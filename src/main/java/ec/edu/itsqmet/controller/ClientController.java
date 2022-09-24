package ec.edu.itsqmet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.itsqmet.model.ClientModel;
import ec.edu.itsqmet.service.IClienteService;

@RestController
@RequestMapping("/client")
public class ClientController {


	@Autowired
	private IClienteService cs;

	@GetMapping("/getMetodo")
	public String getMetodo() {

		return cs.getMetodo();
	}

	@PostMapping("/postClient")
	public String postClient(@RequestBody ClientModel client) {

		return cs.postMetodo();
	}

	@PutMapping("/putClient")
	public String updateClient( @RequestBody ClientModel client ) {
		
    	return cs.putMetodo();
    }

	@DeleteMapping("/deleteClient")
	public String deleteClient( @RequestBody ClientModel client ) {
		
    	return cs.deleteMetodo();
    }

	
}
