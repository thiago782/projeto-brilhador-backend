package br.edu.up.financial.lancamentos_contabeis.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.up.financial.lancamentos_contabeis.Domain.LancamentoCabecalho;
import br.edu.up.financial.lancamentos_contabeis.repository.LancamentoCabecalhoRepository;

@RestController
public class LancamentoController {
    private final LancamentoCabecalhoRepository repository;

    public LancamentoController(LancamentoCabecalhoRepository repository) {
        this.repository = repository;
    }
    
    @GetMapping("/cabecalhoLancamentos")
    Iterable<LancamentoCabecalho> listar(){
        return repository.findAll();
    }

    @GetMapping("/cabecalhoLancamentos/{id}")
    LancamentoCabecalho buscarPorId(@PathVariable Long id){
        return repository.findById(id).get();
    }

    @PostMapping("/cabecalhoLancamentos")
    LancamentoCabecalho incluir(@RequestBody LancamentoCabecalho novoCabecalho){
        return repository.save(novoCabecalho);
    }


    @PutMapping("/cabecalhoLancamentos/{id}")
    LancamentoCabecalho atualizar(@RequestBody LancamentoCabecalho cabAlterado, @PathVariable Long id){
        return repository.findById(id)
        .map(cabecalho -> {
            cabecalho.setDataLancamento(cabAlterado.getDataLancamento());
            cabecalho.setDocumento(cabAlterado.getDocumento());
            cabecalho.setTipoLancamento(cabAlterado.getTipoLancamento());
            cabecalho.setStatus(cabAlterado.getStatus());
            cabecalho.setFornecedor(cabAlterado.getFornecedor());
            cabecalho.setCliente(cabAlterado.getCliente());
            return repository.save(cabecalho);
        })
        .orElseGet(() -> {
            cabAlterado.setId(id);
            return repository.save(cabAlterado);
        });    
    }

    @DeleteMapping("/cabecalhoLancamentos/{id}")
    void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }

    
    
}
