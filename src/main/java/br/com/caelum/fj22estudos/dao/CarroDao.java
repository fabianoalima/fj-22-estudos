package br.com.caelum.fj22estudos.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import br.com.caelum.fj22estudos.model.Carro;

public interface CarroDao extends Repository<Carro, Long> {

	List<Carro> findAll();
	
	Carro save(Carro carro);
}
