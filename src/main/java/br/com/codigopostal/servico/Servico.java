package br.com.codigopostal.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.codigopostal.domain.model.Principal;

@Service
public class Servico {

	@Autowired
	private RestTemplate restTemplate;

	public Principal consumidor() {
		String url = "https://api.postmon.com.br/v1/cep/24220401";
		Principal principal = restTemplate.getForObject(url, Principal.class);
		
		return principal;
		
	}
	
}
