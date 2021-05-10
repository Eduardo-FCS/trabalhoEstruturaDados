package br.edu.univas.vo;

public class List {
	public Node head;
	public Node last;
	
	public boolean moveGame(List list1, Piece piece1) {
		boolean auxiliar = false;
		if (piece1 != null) {
			if (list1.head == null) {
				list1.insert(piece1);
				auxiliar = true;
			} else if (head.info.getX() == piece1.getX() || head.info.getX() == piece1.getY()) {
				auxiliar = true;
				if (head.info.getX() == piece1.getX()) {
					int aux = piece1.getX();
					int aux2 = piece1.getY();
					piece1.setY(aux);
					piece1.setX(aux2);
				}
				Node newNode = new Node();
				head.previous = newNode;
				newNode.info = piece1;
				newNode.next = head;
				head = newNode;

			} else if (last.info.getY() == piece1.getX() || last.info.getY() == piece1.getY()) {
				auxiliar = true;
				if (last.info.getY() == piece1.getY()) {
					int aux = piece1.getX();
					int aux2 = piece1.getY();
					piece1.setY(aux);
					piece1.setX(aux2);
				}
				Node newNode = new Node();
				last.next = newNode;
				newNode.info = piece1;
				newNode.previous = last;
				last = newNode;
			} else {}
		} else {}
		return auxiliar;
	}
	
	public String getAsString() {
		if (head == null) {
			return "Esgotaram-se as peças!";
		}
		StringBuilder builder = new StringBuilder();
		Node home = head;
		while (home != null) {
			builder.append("(").append(home.info.getX());
			builder.append(",");
			builder.append(home.info.getY()).append(")");
			builder.append("  ");
			home = home.next;
		}
		return builder.toString();
	}

	public Piece remove(String name) {
		if (head == null) {
			return null;
		}

		Node current = head;
		Node previous = head.previous;
		Node next = head.next;
		while (current != null) {
			if (current.info.toString().equals(name)) {
				break;
			}
			previous = current;
			current = current.next;
			next = next.next;
		}
		if (current == null) {
			return null;
		}
		Piece pieceRemove = current.info;
		if (this.head == this.last) {
			this.head = null;
			this.last = null;
			return pieceRemove;
		}
		if (previous == null) {
			head = next;
			next.previous = null;
		} else {
			if (current.next != null) {
				previous.next = next;
				next.previous = previous;
			} else {

				this.last = previous;
				previous.next = null;
			}
		}
		return pieceRemove;
	}
	
	public void insert(Piece peca) {
		Node newNode = new Node();
		if (head == null) {
			head = newNode;
		} else {
			last.next = newNode;
			newNode.previous = last;
		}
		last = newNode;
		newNode.info = peca;
	}
	
	public int makeList(List list1) {
		Node front = list1.head;
		Node back = list1.last;
		int aux = 0;
		while (!front.info.toString().equals(back.info.toString())) {
			front = front.next;
			aux+=1;
			if (front == null) {
				break;
			}
		}
		return aux;
	}

	private Node getNodeAt(int index) {
		if (index < 0) {
			return null;
		}
		int i = 0;
		Node aux = head;
		while (aux != null) {
			if (index == i) {
				return aux;
			}
			i++;
			aux = aux.next;
		}
		return null;
	}

	public Piece getElementAt(int i) {
		Node node1 = getNodeAt(i);
		if (node1 != null) {
			return node1.info;
		}
		return null;
	}

	public void createPieces() {
		int auxiliar = 0;
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j + auxiliar < 7; j++) {
				Piece newPiece1 = new Piece();
				newPiece1.setX(i);
				newPiece1.setY(j + auxiliar);
				insert(newPiece1);
			}
			auxiliar+=1;
		}
	}

	public void piecesDividing(List lista, List tabuleiro) {
		Piece piece5;
		int idx = makeList(tabuleiro);
		for (int i = 0; i < 7; i++) {
			int random = 1 + (int) (Math.random() * idx);
			piece5 = getElementAt(random);
			piece5 = remove(piece5.toString());
			lista.insert(piece5);
			idx-=1;
		}
	}
}