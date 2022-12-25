package com.app.demo.service;

import com.app.demo.domain.Cidade;
import com.app.demo.dto.CidadeRequestDto;
import com.app.demo.dto.CidadeResponseDto;
import com.app.demo.mapper.CidadeMapper;
import com.app.demo.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CidadeService {

    @Autowired
    private CidadeMapper cidadeMapper;

    @Autowired
    private CidadeRepository cidadeRepository;

    public CidadeResponseDto addCidade(CidadeRequestDto requestDto) {
        Cidade cidade = cidadeMapper.cidadeRequestDtoToCidade(requestDto);
        Cidade cidadeSalva = cidadeRepository.save(cidade);
        return cidadeMapper.cidadeToCidadeResponseDto(cidadeSalva);
    }

    public List<CidadeResponseDto>  getCidades() {
        List<Cidade> listaCidades =  cidadeRepository.findAll();

        List<CidadeResponseDto> listaCidadeResponseDto = new ArrayList<>();

        listaCidades.forEach(item -> {
            listaCidadeResponseDto.add(cidadeMapper.cidadeToCidadeResponseDto(item));
        });

        return listaCidadeResponseDto;
    }
}
