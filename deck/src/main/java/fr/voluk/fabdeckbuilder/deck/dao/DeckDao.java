package fr.voluk.fabdeckbuilder.deck.dao;

import fr.voluk.fabdeckbuilder.deck.dao.id.DeckID;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "DECK")
public class DeckDao {
    @Id
    private DeckID id;

    @Column(name = "D_NOM")
    private String dNom;
}
