package fr.voluk.fabdeckbuilder.deck.dao;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "CARTE")
public class Carte {
    @Id
    @Column(name = "C_ID")
    private Integer cId;

    @Column(name = "C_NAME")
    private String cName;

    @Column(name = "C_COLOR")
    private String cColor;

    @Column(name = "C_COST")
    private Integer cCost;
}
