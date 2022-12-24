package com.app.demo.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Teste {

    @Id
    @GeneratedValue(
            strategy= GenerationType.IDENTITY,
            generator = "sequence_id_testes"
    )
    private int id;

    private String nome;
}
