package org.yurii.ooaplabs.semestry2.laba7Var2;

class CreateNewGameCommand implements Command {
    private ChessGame game;

    public CreateNewGameCommand(ChessGame game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.createNewGame();
    }
}
