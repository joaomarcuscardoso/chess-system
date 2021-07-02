package src.application;

import java.util.Scanner;

import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;
import src.boardgame.Board;
import src.boardgame.Position;
import src.chess.ChessMatch;
import src.chess.ChessPiece;
import src.chess.ChessPosition;

public class Program {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        Scanner sc = new Scanner(System.in);

        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc);
            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }

    }
}