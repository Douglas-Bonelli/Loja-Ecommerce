package br.com.intelligenceWeb.LojaEcommerce.api.services;

import java.util.Optional;

import br.com.intelligenceWeb.LojaEcommerce.api.entities.Empresa;

public interface EmpresaService {
	
	Optional <Empresa> buscaPorCnpj(String cnpj);
	Empresa persistir(Empresa empresa);
	

}
