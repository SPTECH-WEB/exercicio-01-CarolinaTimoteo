package com.exemplo.fatura.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
@Entity
@Table(name = "faturas")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString

public class Fatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O número do cartão não pode estar em branco")
    @Pattern(regexp = "\\d{16}", message = "O número do cartão deve ter exatamente 16 digitos")
    private String numeroCartao;

    @NotBlank(message = "O nome do titular não pode estar em branco")
    @Size(min=3, max = 100)
    private String nomeTitular;

    @NotBlank(message = "O campo Data de pagamento não pode estar em branco")
    @FutureOrPresent(message = "A data de vencimento deve serr a data atual ou futura")
    private LocalDate dataPagamento;

    @NotBlank(message = "O campo e-mail não pode estar em branco")
    @Email(message = "Insira um e-mail válido")
    private String emailContato;
}
