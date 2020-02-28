package edu.cnm.deepdive.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Shoe {

  private List<Card> cards;
  private Random rng;
  private List<Card> dealt;

  public Shoe(Iterable<Deck> decks, Random rng) {
    this.dealt = new LinkedList<>();
    this.cards = new ArrayList<>();
    this.rng = rng;
    while (true) {
    }
  }
}
