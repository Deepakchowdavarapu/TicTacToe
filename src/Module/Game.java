package Module;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private int nextPlayerMoveIndex;
    private Player winner;
    private List<Move> moves;
    private GameState gameState;

    public Game(int dimension , List<Player> players){
        this.board = new Board(dimension);
        this.players = players ;
        this.moves = new ArrayList<>();

    }

}
