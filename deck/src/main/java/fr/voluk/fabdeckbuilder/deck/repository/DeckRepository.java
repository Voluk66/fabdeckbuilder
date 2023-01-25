package fr.voluk.fabdeckbuilder.deck.repository;

import fr.voluk.fabdeckbuilder.deck.dao.DeckDao;
import fr.voluk.fabdeckbuilder.deck.dao.id.DeckID;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeckRepository extends CrudRepository<DeckDao, DeckID> {

    @Query("SELECT d from DECK d")
    public List<DeckDao> selectAllDeck();
}
