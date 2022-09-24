package ec.edu.itsqmet.service.impl;

import org.springframework.stereotype.Service;

import ec.edu.itsqmet.service.IClienteService;

@Service
public class ClientService implements IClienteService {
	public String getMetodo() {
		return "soy un metodo get";
	}

	public String postMetodo() {
		return "Soy un metodo post";
	}

	public String putMetodo() {
		return "Soy un metodo put";
	}
	
	public String deleteMetodo() {
		return "Soy un metodo delete";
	}
	
}
