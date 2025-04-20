/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

/**
 *
 * @author gdn
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameLogic {

    private final Square[] board;
    private final Player playerX;
    private final Player playerO;
    private final List<Player> players;
    private int currentTurn;
    private boolean gameOver;

    public GameLogic() {
        this.board = createBoard();
        this.playerX = new Player('X');
        this.playerO = new Player('O');
        this.players = new ArrayList<>(Arrays.asList(playerX, playerO));
        this.currentTurn = 0;
        this.gameOver = false;
    }

    private Square[] createBoard() {
        Square[] newBoard = new Square[9];
        for (int i = 0; i < newBoard.length; i++) {
            newBoard[i] = new Square();
        }
        return newBoard;
    }

    private boolean areThereAnyFreeSquares() {
        return Arrays.stream(board).anyMatch(square -> square.getSquareState().equals(State.UNMARKED));
    }

    private boolean checkLineSameSymbol(Square first, Square second, Square third) {
        if (first.getSquareState() != State.UNMARKED && second.getSquareState() != State.UNMARKED && third.getSquareState() != State.UNMARKED) {
            return first.getSquareState() == second.getSquareState() && second.getSquareState() == third.getSquareState();
        }
        return false;
    }

    private boolean checkRows() {
        return checkLineSameSymbol(board[0], board[1], board[2]) ||
               checkLineSameSymbol(board[3], board[4], board[5]) ||
               checkLineSameSymbol(board[6], board[7], board[8]);
    }

    private boolean checkColumns() {
        return checkLineSameSymbol(board[0], board[3], board[6]) ||
               checkLineSameSymbol(board[1], board[4], board[7]) ||
               checkLineSameSymbol(board[2], board[5], board[8]);
    }

    private boolean checkDiagonals() {
        return checkLineSameSymbol(board[0], board[4], board[8]) ||
               checkLineSameSymbol(board[2], board[4], board[6]);
    }

    private boolean anyPlayerWon() {
        return checkRows() || checkColumns() || checkDiagonals();
    }

    private void markSquare(Player player, int square) {
        board[square].setSquareState(player.getMark() == 'X' ? State.X : State.O);
    }

    public Player getPlayerTurn() {
        return players.get(currentTurn);
    }

    public void nextTurn() {
        currentTurn = (currentTurn + 1) % players.size();
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public String gameInfo() {
        return isGameOver() ? "The end!" : "Turn: " + getPlayerTurn().getMark();
    }

    public boolean play(Player player, int square) {
        if (getPlayerTurn().equals(player) && board[square - 1].getSquareState() == State.UNMARKED && !gameOver) {
            markSquare(player, square - 1);
            if (anyPlayerWon() || !areThereAnyFreeSquares()) {
                gameOver = true;
            } else {
                nextTurn();
            }
            return true;
        }
        return false;
    }

    private static class Square {
        private State squareState;

        public Square() {
            this.squareState = State.UNMARKED;
        }

        public State getSquareState() {
            return squareState;
        }

        public void setSquareState(State squareState) {
            this.squareState = squareState;
        }
    }

    private enum State {
        X, O, UNMARKED;
    }
}
