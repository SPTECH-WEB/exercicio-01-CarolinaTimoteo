package com.exemplo.fatura.controller;

import com.exemplo.fatura.Repository.FaturaRepository;
import com.exemplo.fatura.model.Fatura;
import com.exemplo.fatura.controller.FaturaController;
import com.exemplo.fatura.service.FaturaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/faturas")

public class FaturaController {

    @Autowired FaturaService faturaService;
    @Autowired
    private FaturaRepository faturaRepository;

    public FaturaController(FaturaService faturaService) {
        this.faturaService = faturaService;
    }
    @PostMapping
    public ResponseEntity<Fatura>criarFatura(@Valid @RequestBody Fatura fatura){
        Fatura salvaFatura = faturaService.salvar(fatura);
        return ResponseEntity.ok(salvaFatura);
    }

    @GetMapping
    public List<Fatura>listarFaturas(){
        return faturaRepository.findAll();
    }
}
