package org.yurii.ooaplabs.semestry2.laba7Var10;

//Receiver
class ChessGame {
    public void createNewGame() {
        System.out.println("New game created.");
    }

    public void makeMove(String move) {
        System.out.println("Made move: " + move);
    }

    public void undoMove() {
        System.out.println("Undo last move.");
    }
}
