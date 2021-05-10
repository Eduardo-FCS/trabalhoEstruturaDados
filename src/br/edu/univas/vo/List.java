package br.edu.univas.vo;

public class List {
	public Node head;
	public Node last;

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

		Piece RemovePeca = current.info;

		if (this.head == this.last) {
			this.head = null;
			this.last = null;
			return RemovePeca;
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

		return RemovePeca;
	}

	public String getAsString() {
		if (head == null) {
			return "Suas peças acabaram!!!!";
		}
		StringBuilder builder = new StringBuilder();

		Node aux = head;
		while (aux != null) {

			builder.append("(").append(aux.info.getX());
			builder.append(",");
			builder.append(aux.info.getY()).append(")");
			builder.append("  ");

			aux = aux.next;
		}
		return builder.toString();
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

	public Piece getElementAt(int idx) {
		Node node = getNodeAt(idx);
		if (node != null) {
			return node.info;
		}
		return null;
	}

	public boolean move(List lista, Piece peca) {

		boolean auxiliar = false;

		if (peca != null) {

			if (lista.head == null) {
				lista.insert(peca);
				auxiliar = true;

			} else if (head.info.getX() == peca.getX() || head.info.getX() == peca.getY()) {

				auxiliar = true;

				if (head.info.getX() == peca.getX()) {
					int aux = peca.getX();
					int aux2 = peca.getY();
					peca.setY(aux);
					peca.setX(aux2);

				}
				Node novoNode = new Node();
				head.previous = novoNode;
				novoNode.info = peca;
				novoNode.next = head;
				head = novoNode;

			} else if (last.info.getY() == peca.getX() || last.info.getY() == peca.getX()) {

				auxiliar = true;

				if (last.info.getY() == peca.getY()) {
					int aux = peca.getX();
					int aux2 = peca.getY();
					peca.setY(aux);
					peca.setX(aux2);

				}
				Node novoNode = new Node();
				last.next = novoNode;
				novoNode.info = peca;
				novoNode.previous = last;
				last = novoNode;

			} else {

			}
		} else {

		}

		return auxiliar;
	}

	public void criaPecas() {

		int auxiliar = 0;

		for (int i = 0; i < 7; i++) {

			for (int j = 0; j + auxiliar < 7; j++) {

				Piece novaPeca = new Piece();
				novaPeca.setX(i);
				novaPeca.setY(j + auxiliar);
				insert(novaPeca);

			}
			auxiliar+=1;
		}

	}

	public void distribuiPecas(List lista, List tabuleiro) {

		Piece peca;

		int idx = makeList(tabuleiro);

		for (int i = 0; i < 7; i++) {
			int random = 1 + (int) (Math.random() * idx);
			peca = getElementAt(random);
			peca = remove(peca.toString());
			lista.insert(peca);
			idx-=1;
		}

	}

	public int makeList(List list) {

		Node auxiliar = list.head;
		Node auxiliar2 = list.last;

		int aux = 0;

		while (!auxiliar.info.toString().equals(auxiliar2.info.toString())) {

			auxiliar = auxiliar.next;
			aux+=1;
			if (auxiliar == null) {
				break;
			}
		}

		return aux;

	}
	

}