# trabalhoEstruturaDados

Trabalho realizado pelo aluno Eduardo Faria Caetano Silva, inscrito na mat�ria de Estrutura de Dados ministrado pelo professor Roberto Rocha da institui��o de ensino UNIV�S, no curso de Sistema de Informa��o. O programa cuja documenta��o relata � sobre um jogo de Domin�. Todas as declara��es de vari�veis, m�todos e classes est�o na l�ngua inglesa, por�m com o jogo em portugu�s para melhor facilidade de entendimento na hora de seu uso.

O jogo � formado por um jogador e a l�gica do sistema, vulgo BOT. O jogador e BOT iniciam com 7 fichas/pe�as cada, como previsto em regra do jogo. O programa imprime � cada rodada quem ir� jogar, sendo a primeira rodada cedida ao jogador. Em cada vez que o jogador escolher a pe�a que queira jogar, o programa analisa e valida se a mesma � v�lida para adicionar � lista duplamente encadeada do jogo, que inverte as posi��es dos n�meros ou n�o, dependendo do n�mero da �ltima pe�a da cada lado.

Na hora em que for a rodada do BOT, o programa analisa as duas fichas em cada extremidade e ao verificar nas cartas em sua m�o, seleciona aquela que possui ao menos um dos lados iguais ao da lista central. O jogador e o BOT podem comprar fichas ou passar a vez, digitando respectivamente '77' e '99'.

Com um m�todo de cria��o de fichas, a l�gica cria ent�o 28 unidades para serem disponibilizadas em ambas as partes. Uma vez que o BOT compra, ele passar� a vez. Se o BOT comprar e tiver a pe�a, ele jogar� a mesma na partida. A partida se encerrar� quando algum dos dois terem suas pe�as esgotadas. Para cada uma dessas hip�teses, o programa imprimir� de maneira aut�noma a mensagem do vencedor e o nome.