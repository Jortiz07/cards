package edu.cnm.deepdive.model;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 */
public class Deck {

  private List<Card> cards;
  private List<Card> dealt;

  /**
   *
   */
  public Deck() {
    cards = new ArrayList<>();
    dealt = new LinkedList<>();
    for (Suit s : Suit.values()) {
      for (Rank r : Rank.values()) {
        cards.add(new Card(s, r));
      }
    }
  }

  /**
   *
   * @return
   */
  public Card deal() {
    Card card = cards.isEmpty() ?  null : cards.remove(0);
    if (card != null) {
      dealt.add(card);
    }
    return card;
  }

  /**
   *
   * @param rng
   */
  public void shuffle(Random rng) {
    gather();
    Collections.shuffle(cards, rng);
  }

  private void gather() {
    cards.addAll(dealt);
    dealt.clear();
  }

  @Override
  public String toString() {
    return cards.toString();
  }

  /**
   *
   * @return
   */
  public int remaining() {
    return cards.size();
  }

  /**
   *
   * @return
   */
  public int dealt() {
    return dealt.size();
  }

  public void sort(boolean gather) {
    if (gather) {
      gather();
    }
    cards.sort((card1, card2) -> {
      int result = card1.getSuit().compareTo(card2.getSuit());
      if (result == 0) {
        result = card1.getRank().compareTo(card2.getRank());
      }
      return result;
    });
  }
}
