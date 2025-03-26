package com.exemplo.fatura.service;

import com.exemplo.fatura.Repository.FaturaRepository;
import com.exemplo.fatura.model.Fatura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FaturaService {

    @Autowired
    FaturaRepository faturaRepository;
  public FaturaService(FaturaRepository faturaRepository) {
      this.faturaRepository = faturaRepository;
  }
  public List<Fatura> listarfaturas(){
      return faturaRepository.findAll();
  }


  public Fatura salvar(Fatura fatura) {
      return faturaRepository.save(fatura);
  }

  public void deletar(Long id) {
      faturaRepository.deleteById(id);
  }
}
