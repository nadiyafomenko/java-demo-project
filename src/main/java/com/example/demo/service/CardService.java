package com.example.demo.service;

import com.example.demo.entity.Card;
import com.example.demo.entity.Equipment;
import com.example.demo.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    private final CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public Card getCardById(int id){
        return cardRepository.getById(id);
    }

    public List<Card> getAll() { return cardRepository.getAll(); }

    public List<Card> save(Card card){
        return cardRepository.save(card);
    }

}
