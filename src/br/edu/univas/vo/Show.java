package br.edu.univas.vo;

public class Show {

	public void startGame() {
		System.out.println("====================== \n BEM VINDO AO JOGO DE DOMINÓ VIRTUAL \n \n COMEÇAREMOS A JOGAR !");
	}

	public void playing() {
		System.out.println("\n Rodada do Player\n \n Escolha uma das fichas disponíveis para jogada (Digite 7 para passar a vez e 9 para comprar uma nova ficha): \n");
	}

	public void errorChoose() {
		System.out.println("\n Opção de peça incorreta! \n");
	}
	
	public void botBuyPiece() {
		System.out.println("\n Bot comprou uma peça \n");
	}

	public void botTurn() {
		System.out.println("\n Rodada do BOT \n");
	}

	public void playedPieces() {
		System.out.println("\n As peças jogadas na mesa: \n");
	}
	public void playerWin() {
		System.out.println("\n Player ganhou a partida! \n");
	}
	public void botWin() {
		System.out.println("\n BOT ganhou a partida! \n");
	}
	
	public void botPassedTurn() {
		
		System.out.println("\n O BOT passou a vez para você! \n");	
		
	}
}
