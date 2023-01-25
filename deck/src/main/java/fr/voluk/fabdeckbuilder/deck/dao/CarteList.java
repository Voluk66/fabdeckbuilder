package fr.voluk.fabdeckbuilder.deck.dao;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "CARTELIST")
public class CarteList {

    @Column(name = "C_ID")
    private Integer cId;

    @Column(name = "D_ID")
    private Integer dId;
}
