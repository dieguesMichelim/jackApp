package com.app.demo.mapper;

import com.app.demo.domain.Cidade;
import com.app.demo.dto.CidadeRequestDto;
import com.app.demo.dto.CidadeResponseDto;
import org.springframework.stereotype.Component;

@Component
public class CidadeMapper {

    public CidadeResponseDto cidadeToCidadeResponseDto(Cidade cidade) {
        return CidadeResponseDto.builder()
                .id(cidade.getId())
                .nome(cidade.getNome())
                .build();
    }

    public Cidade cidadeRequestDtoToCidade(CidadeRequestDto requestDto) {
        return Cidade.builder()
                .nome(requestDto.getNome())
                .build();
    }
}
