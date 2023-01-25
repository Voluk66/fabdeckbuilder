package fr.voluk.fabdeckbuilder.deck.controller;

import fr.voluk.fabdeckbuilder.deck.service.DeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeckController {

    @Autowired
    DeckService deckService;

    @RequestMapping(value = "/deck/test", method = RequestMethod.GET)
    public void test(){
        deckService.getAllDeck();
    }
}
