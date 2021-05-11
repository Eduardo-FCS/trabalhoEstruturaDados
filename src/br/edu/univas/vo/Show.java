package br.edu.univas.vo;

public class Show {

	public void startGame() {
		System.out.println("=============================== \n BEM VINDO AO JOGO DE DOMINÓ VIRTUAL \n =============================== \n COMEÇAREMOS A JOGAR !");
	}

	public void playing() {
		System.out.println("\n \n:::Rodada do Player:::\n \nEscolha uma das fichas disponíveis para jogada (Digite 99 para passar a vez e 77 para comprar uma nova ficha): \n");
	}

	public void errorChoose() {
		System.out.println("\n Opção de peça incorreta! \n");
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
		System.out.println("\n:::Peças em disputa:::\n");
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
