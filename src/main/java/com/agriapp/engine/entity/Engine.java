package com.agriapp.engine.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author MARC
 * @version 1.0.0
 * @since 12/22/2021
 */

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//Specify a table's name with this
@Table(name = "tb_engine")
public class Engine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(length = 10, nullable = false)
    private String reference;

    @Column
    private String description;
}
