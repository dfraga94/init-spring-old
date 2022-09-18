package ec.edu.itsqmet.service.impl;

import org.springframework.stereotype.Service;

import ec.edu.itsqmet.service.IClienteService;

@Service
public class ClientService implements IClienteService {
	public String saludar() {
		return "Hellow world";
	}

	public String nombre() {
		return "Darwin";
	}
}
