package fr.voluk.fabdeckbuilder.deck.dao.id;

import lombok.Data;

import javax.persistence.Column;

@Data
public class DeckID {
    @Column(name = "D_ID")
    private Integer D_ID;

}
