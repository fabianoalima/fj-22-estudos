package br.com.caelum.fj22estudos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.caelum.fj22estudos.dao.CarroDao;
import br.com.caelum.fj22estudos.model.Carro;

@RestController
public class CarroController {

	@Autowired
	private CarroDao carroDao;
	
	
	@GetMapping("carros")
	public List<Carro> carros() {
		return carroDao.findAll();
	}
	
	@PostMapping("carros")
	public Carro save(@RequestBody Carro carro) {
		return carroDao.save(carro);
	}
}
