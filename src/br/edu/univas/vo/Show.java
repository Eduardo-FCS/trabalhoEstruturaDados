package br.edu.univas.vo;

public class Show {

	public void startGame() {
		System.out.println("====================== \n BEM VINDO AO JOGO DE DOMIN� VIRTUAL \n \n COME�AREMOS A JOGAR !");
	}

	public void playing() {
		System.out.println("\n Rodada do Player\n \n Escolha uma das fichas dispon�veis para jogada (Digite 7 para passar a vez e 9 para comprar uma nova ficha): \n");
	}

	public void errorChoose() {
		System.out.println("\n Op��o de pe�a incorreta! \n");
	}
	
	public void botBuyPiece() {
		System.out.println("\n Bot comprou uma pe�a \n");
	}

	public void botTurn() {
		System.out.println("\n Rodada do BOT \n");
	}

	public void playedPieces() {
		System.out.println("\n As pe�as jogadas na mesa: \n");
	}
	public void playerWin() {
		System.out.println("\n Player ganhou a partida! \n");
	}
	public void botWin() {
		System.out.println("\n BOT ganhou a partida! \n");
	}
	
	public void botPassedTurn() {
		
		System.out.println("\n O BOT passou a vez para voc�! \n");	
		
	}
}
