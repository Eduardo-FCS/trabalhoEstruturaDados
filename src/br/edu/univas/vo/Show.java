package br.edu.univas.vo;

public class Show {

	public void startGame() {
		System.out.println("=============================== \n BEM VINDO AO JOGO DE DOMIN� VIRTUAL \n =============================== \n COME�AREMOS A JOGAR !");
	}

	public void playing() {
		System.out.println("\n \n:::Rodada do Player:::\n \nEscolha uma das fichas dispon�veis para jogada (Digite 99 para passar a vez e 77 para comprar uma nova ficha): \n");
	}

	public void errorChoose() {
		System.out.println("\n Op��o de pe�a incorreta! \n");
	}
	
	public void botBuyPiece() {
		System.out.println("\n:::Bot comprou:::\n");
	}
	
	public void playerBuyPiece() {
		System.out.println("\n:::Player comprou:::\n");
	}
	
	public void playerTurn() {
		System.out.println("\n:::Player pulou o turno:::");
	}

	public void botTurn() {
		System.out.println("\n:::Rodada do BOT:::\n");
	}

	public void playedPieces() {
		System.out.println("\n:::Pe�as em disputa:::\n");
	}
	public void playerWin() {
		System.out.println("\n:::Player ganhou a partida!:::\n");
	}
	public void botWin() {
		System.out.println("\n:::BOT ganhou a partida!:::\n");
	}
	
	public void botPassedTurn() {
		
		System.out.println("\nO:::BOT pulou o turno:::\n");	
		
	}
}
