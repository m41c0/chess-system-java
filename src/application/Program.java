package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessaMatch;
import application.UI;

public class Program {

	public static void main(String[] args) {

		// Board board = new Board(8,8);
		ChessaMatch chessaMatch = new ChessaMatch();
		UI.printBoard(chessaMatch.getPieces());
		// System.out.println();

	}

}
