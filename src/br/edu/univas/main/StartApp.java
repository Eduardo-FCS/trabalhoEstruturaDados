package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.vo.Piece;
import br.edu.univas.vo.List;
import br.edu.univas.vo.Node;
import br.edu.univas.vo.Show;

public class StartApp {

	public static Scanner scanner = new Scanner(System.in);
	public static Show printing = new Show();

	public static void main(String[] args) throws InterruptedException {
		List pieces = new List();
		List piecesBOT = new List();
		List playerPieces = new List();
		List playedPieces = new List();
		pieces.createPieces();
		pieces.piecesDividing(playerPieces, pieces);
		pieces.piecesDividing(piecesBOT, pieces);
		printing.startGame();
		boolean endGame = false;
		do {
			endGame = player(playerPieces, playedPieces, pieces);
			if (endGame == true) {
				printing.playerWin();
				break;
			}
			endGame = bot(piecesBOT, playedPieces, pieces);
			if (endGame == true) {
				printing.botWin();
				break;
			}
		} while (endGame == false);
	}


	public static int readInt() {
		int variable = scanner.nextInt();
		scanner.nextLine();
		return variable;
	}
	
	public static void buyPiecesBOT(List piecesBOT, List pieces) {
		Piece buyedPiece;
		buyedPiece = pieces.getElementAt(0);
		buyedPiece = pieces.remove(buyedPiece.toString());
		piecesBOT.insert(buyedPiece);
	}

	public static void buyPiecesPlayer(List PlayerPieces, List pieces) {
		Piece buyedPiece;
		buyedPiece = pieces.getElementAt(0);
		buyedPiece = pieces.remove(buyedPiece.toString());
		PlayerPieces.insert(buyedPiece);
	}

	public static boolean player(List playerPieces, List playedPieces, List pieces) {
		String alertValidation = "Esgotaram-se as peças!";
		Piece piece;
		printing.playing();
		boolean gameFinished = false;
		int number2;
		while (true) {
			System.out.println(playerPieces.getAsString());
			number2 = readInt();
			if (number2 == 99) {
				break;
			}
			else if (number2 == 20) {
				buyPiecesPlayer(playerPieces, pieces);
				continue;
			}
			number2 -= 1;
			int valid = playerPieces.makeList(playerPieces);
			if (number2 <= valid && number2 >= 0) {
				break;
			}
			printing.errorChoose();
		}

		piece = playerPieces.getElementAt(number2);
		boolean y = playedPieces.moveGame(playedPieces, piece);
		if (y == true) {
			piece = playerPieces.remove(piece.toString());
		}
		if (alertValidation.equals(playerPieces.getAsString())) {
			gameFinished = true;
		}
		return gameFinished;
	}
	
	private static boolean bot(List piecesBOT, List playedPieces, List pieces) throws InterruptedException {
		String alertValidation = "Esgotaram-se as peças!";
		printing.botTurn();
		boolean finish = false, auxiliar = false;
		Piece piece;
		int number1 = 0,counter = 0;
		while (true) {
			int valid = piecesBOT.makeList(piecesBOT);
			if (number1 <= valid) {
				piece = piecesBOT.getElementAt(number1);
				auxiliar = playedPieces.moveGame(playedPieces, piece);
				if (auxiliar == true) {
					piece = piecesBOT.remove(piece.toString());
					break;
				} else {
					number1 += 1;
				}
			} else {	
				if(counter == 0) {
					buyPiecesBOT(piecesBOT, pieces);
					printing.botBuyPiece();
					counter += 1;
					continue;
				} else {
					counter = 0;
				}
				printing.botPassedTurn();
				break;
			}
		}
		printing.playedPieces();
		System.out.println(playedPieces.getAsString());
		if (alertValidation.equals(piecesBOT.getAsString())) {
			finish = true;
		}
		return finish;
	}
}