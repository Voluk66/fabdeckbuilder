package fr.voluk.fabdeckbuilder.deck.service;

import fr.voluk.fabdeckbuilder.deck.dao.DeckDao;
import fr.voluk.fabdeckbuilder.deck.repository.DeckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeckService {
    @Autowired
    DeckRepository deckRepository;

    public void getAllDeck(){
        List<DeckDao> deckDaos = deckRepository.selectAllDeck();
        System.out.println(deckDaos.toString());
    }
}
