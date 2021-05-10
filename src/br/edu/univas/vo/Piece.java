package br.edu.univas.vo;

public class Piece {
	public int x;
	public int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		
		return "(" + x + "," + y + ")";	
		
	}

	public String toString2() {
		return "(" + y + "," + x + ")";
	}

	
}