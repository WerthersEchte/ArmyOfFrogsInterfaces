package de.fhkiel.tsw.armyoffrogs;

import java.util.List;
import java.util.Set;

/**
 * The Game interface to let the gui use the logic.
 */
public interface Game {

  /**
   * Starts a new game with the given number of players.
   *
   * @param numberOfPlayers the number of players
   * @return true on successful game creation
   */
  boolean newGame(int numberOfPlayers);

  /**
   * The players of the current game as their {@link Color}s.
   *
   * @return an array of {@link Color}s
   */
  Color[] players();

  /**
   * An info string pertaining the current game.
   * Can be anything from quips to how to play the game...
   *
   * @return the info as a string
   */
  String getInfo();

  /**
   * The number of frogs in the bag of the current game.
   *
   * @return the number of frogs in the bag
   */
  int frogsInBag();

  /**
   * The frogs the given player hold in their hand.
   *
   * @param player the player as their {@link Color}
   * @return the {@link Color}s of the frogs in hand as a list
   */
  List<Color> getFrogsInHand(Color player);

  /**
   * Gets the current boardstate.
   * Any placed frog is coded as a {@link Position}.
   * The x- and y-values of the returned {@link Position}s must not be smaller than -50 and bigger than +50.
   *
   * @return a ste of {@link Position}s represeting the current board
   */
  Set<Position> getBoard();

  /**
   * The last clicked {@link Position} on the board.
   *
   * @param position the clicked position
   */
  void clicked(Position position);

  /**
   * The selected frog in the given players hand.
   *
   * @param player the player as their {@link Color}
   * @param frog   the frog as a {@link Color}
   */
  void selectedFrogInHand(Color player, Color frog);

  /**
   * The winner of the current game as their {@link Color}.
   *
   * @return the color of the winner or {@link Color#None} when there is no winner
   */
  Color winner();

  /**
   * Call to save the current game in the given filename.
   *
   * @param filename the filename with their full path
   * @return true if loaded successfully
   */
  boolean save(String filename);

  /**
   * Call to load the game in the given filename.
   *
   * @param filename the filename with their full path
   * @return true if loaded successfully
   */
  boolean load(String filename);
}
