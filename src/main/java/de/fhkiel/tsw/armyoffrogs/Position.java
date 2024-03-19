package de.fhkiel.tsw.armyoffrogs;

/**
 * A position on the board.
 * It consists of x and y coordinates, the {@link Color} of the placed frog and if given a possible border
 *
 * @param frog the {@link Color} of the frog
 * @param x the x coordinate on the board, has to be between inclusive -50 and inclusive +50
 * @param y the y coordinate on the board, has to be between inclusive -50 and inclusive +50
 * @param border the {@link Color} of the boarder, when needed. Can be used to designate special actions, e.g. the frog was clicked
 */
public record Position(Color frog, int x, int y, Color border) {
}
