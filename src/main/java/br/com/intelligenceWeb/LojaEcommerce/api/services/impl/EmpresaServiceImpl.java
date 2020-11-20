package br.com.intelligenceWeb.LojaEcommerce.api.services.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.intelligenceWeb.LojaEcommerce.api.entities.Empresa;
import br.com.intelligenceWeb.LojaEcommerce.api.repositories.EmpresaRepository;
import br.com.intelligenceWeb.LojaEcommerce.api.services.EmpresaService;

public class EmpresaServiceImpl implements EmpresaService {
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	private static final Logger log = LoggerFactory.getLogger(EmpresaServiceImpl.class);

	@Override
	public Optional<Empresa> buscaPorCnpj(String cnpj) {
		log.info("Buscando uma empresa para o CNPJ {} " , cnpj);
	    return Optional.ofNullable(empresaRepository.findByCnpj(cnpj));
	}

	@Override
	public Empresa persistir(Empresa empresa) {
		log.info("Persistindo empresa: {} ",empresa);
		return this.empresaRepository.save(empresa);
	}
	
	

}
