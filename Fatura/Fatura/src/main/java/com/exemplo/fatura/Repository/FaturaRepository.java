package com.exemplo.fatura.Repository;

import com.exemplo.fatura.model.Fatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaturaRepository extends  JpaRepository<Fatura, Long>{

    Long id(Long id);

}
