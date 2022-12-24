package com.app.demo.controller;

import com.app.demo.service.CidadeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cidade")
@AllArgsConstructor
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @GetMapping
    public void testeCidade(@RequestParam(value="nome") String nome) {
        cidadeService.addCidade(nome);
    }

}
