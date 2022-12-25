package com.app.demo.controller;

import com.app.demo.dto.CidadeRequestDto;
import com.app.demo.dto.CidadeResponseDto;
import com.app.demo.service.CidadeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cidade")
@AllArgsConstructor
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @PostMapping
    public CidadeResponseDto createCidade(@RequestBody CidadeRequestDto resquestDto) {
        return cidadeService.addCidade(resquestDto);
    }

    @GetMapping
    public List<CidadeResponseDto> getCidades() {
        return cidadeService.getCidades();
    }

}
