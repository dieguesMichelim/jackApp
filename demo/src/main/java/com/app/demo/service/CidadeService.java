package com.app.demo.service;

import com.app.demo.domain.Cidade;
import com.app.demo.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public void addCidade(String nome) {
        Cidade cidade = new Cidade();
        cidade.setNome(nome);
        cidadeRepository.save(cidade);
    }
}
