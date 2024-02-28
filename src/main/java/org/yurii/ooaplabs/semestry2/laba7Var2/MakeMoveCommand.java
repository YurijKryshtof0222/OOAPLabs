package org.yurii.ooaplabs.semestry2.laba7Var2;

class MakeMoveCommand implements Command {
    private ChessGame game;
    private String move;

    public MakeMoveCommand(ChessGame game, String move) {
        this.game = game;
        this.move = move;
    }

    @Override
    public void execute() {
        game.makeMove(move);
    }
}
