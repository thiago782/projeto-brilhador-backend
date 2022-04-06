package br.edu.up.financial.lancamentos_contabeis.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.up.financial.lancamentos_contabeis.Domain.Lancamento;

public interface LancamentoRepository extends CrudRepository<Lancamento, Long> {
    
}
