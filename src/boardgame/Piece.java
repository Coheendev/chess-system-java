package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece() {
    }

    public Piece(Board board) {
        this.board = board;
        position = null; // Não precisa colocar, já vem null, apenas por aprendizado
    }

    protected Board getBoard() {
        return board;
    }

}
