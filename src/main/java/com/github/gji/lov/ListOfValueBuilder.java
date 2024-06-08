package com.github.gji.lov;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.github.gji.repository.PeixeRepository;


@Component
public class ListOfValueBuilder {
	
	@Autowired
	private PeixeRepository peixeRepository;

	public List<ListOfValue> getLovDepartamentos() {			
		return peixeRepository
				.findAll(Sort.by(Sort.Direction.ASC, "nome"))
				.stream()
				.map(p -> new ListOfValue(p.getId(), p.getNome()))
				.toList();
	}



}