package edu.cnm.deepdive.model;

import java.util.LinkedList;
import java.util.List;

public class Hand {

  private List<Card> cards;

  public Hand(List<Card> cards) {
    this.cards = new LinkedList<>(cards);
  }

  public void add(Card card) {
  cards.add(card);
  }
}
