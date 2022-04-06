package br.edu.up.financial.lancamentos_contabeis.repository;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.edu.up.financial.lancamentos_contabeis.Domain.LancamentoCabecalho;

@Configuration
public class CargaInicial {
    private static final Logger log = LoggerFactory.getLogger(CargaInicial.class);
    
    @Bean CommandLineRunner
    iniciarDb(LancamentoCabecalhoRepository repository){
        return args -> {
            log.info("Carregando..."+ repository.save(new LancamentoCabecalho(new SimpleDateFormat("dd/MM/yyyy").parse("01/04/2022"),"LM","JovemParceiro")));
            log.info("Carregando..."+ repository.save(new LancamentoCabecalho(new SimpleDateFormat("dd/MM/yyyy").parse("02/04/2022"),"LM","JovemParceiro")));
        };
    }

    
}
