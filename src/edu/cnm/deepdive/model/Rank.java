package edu.cnm.deepdive.model;

/**
 * Encapsulates the rank values, range, and shorthand rank of a standard western card deck.
 *{@link #symbol()}  returns the shorthand abbreviation  for each of the ranks in a standard card.
 */
public enum Rank {
  ACE,
  TWO,
  THREE,
  FOUR,
  FIVE,
  SIX,
  SEVEN,
  EIGHT,
  NINE,
  TEN,
  JACK,
  QUEEN,
  KING;


  private static final String[] symbols = {
      "A",
      "2",
      "3",
      "4",
      "5",
      "6",
      "7",
      "8",
      "9",
      "10",
      "J",
      "Q",
      "K"
  };

  /**
   *Returns the shorthand symbol for each rank.
   */
  public String symbol () {
    return symbols[ordinal()];
  }
}
