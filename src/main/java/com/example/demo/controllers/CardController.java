package com.example.demo.controllers;

import com.example.demo.entity.Card;
import com.example.demo.entity.Equipment;
import com.example.demo.service.CardService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {
    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping
    public String mainPage() { return "Main Page"; }

    @GetMapping("/cards/{cardId}")
    public Card getCardById(@PathVariable int cardId) {
        return cardService.getCardById(cardId);
    }

    @GetMapping("/cards")
    public List<Card> getCardList() { return cardService.getAll(); }

    @PostMapping("/cards")
    public List<Card> save(@RequestBody Card card) {
        return cardService.save(card);
    }


}
