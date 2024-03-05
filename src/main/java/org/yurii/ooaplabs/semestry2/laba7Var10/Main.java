package org.yurii.ooaplabs.semestry2.laba7Var10;

public class Main {
    public static void main(String[] args) {
        ChessGame game = new ChessGame();
        Invoker player = new Invoker();

        Command createNewGame = new CreateNewGameCommand(game);
        Command makeMove = new MakeMoveCommand(game, "e2-e4");
        Command undoMove = new UndoMoveCommand(game);

        player.executeCommand(createNewGame);
        player.executeCommand(makeMove);
        player.executeCommand(undoMove);
    }
}
