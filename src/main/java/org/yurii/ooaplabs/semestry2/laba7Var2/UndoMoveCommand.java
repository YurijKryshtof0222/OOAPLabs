package org.yurii.ooaplabs.semestry2.laba7Var2;

class UndoMoveCommand implements Command {
    private ChessGame game;

    public UndoMoveCommand(ChessGame game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.undoMove();
    }
}
