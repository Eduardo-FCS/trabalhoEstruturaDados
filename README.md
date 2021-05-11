# trabalhoEstruturaDados

Trabalho realizado pelo aluno Eduardo Faria Caetano Silva, inscrito na matéria de Estrutura de Dados ministrado pelo professor Roberto Rocha da instituição de ensino UNIVÁS, no curso de Sistema de Informação. O programa cuja documentação relata é sobre um jogo de Dominó. Todas as declarações de variáveis, métodos e classes estão na língua inglesa, porém com o jogo em português para melhor facilidade de entendimento na hora de seu uso.

O jogo é formado por um jogador e a lógica do sistema, vulgo BOT. O jogador e BOT iniciam com 7 fichas/peças cada, como previsto em regra do jogo. O programa imprime à cada rodada quem irá jogar, sendo a primeira rodada cedida ao jogador. Em cada vez que o jogador escolher a peça que queira jogar, o programa analisa e valida se a mesma é válida para adicionar à lista duplamente encadeada do jogo, que inverte as posições dos números ou não, dependendo do número da última peça da cada lado.

Na hora em que for a rodada do BOT, o programa analisa as duas fichas em cada extremidade e ao verificar nas cartas em sua mão, seleciona aquela que possui ao menos um dos lados iguais ao da lista central. O jogador e o BOT podem comprar fichas ou passar a vez, digitando respectivamente '20' e '99'. 

Com um método de criação de fichas, a lógica cria então 28 unidades para serem disponibilizadas em ambas as partes. Uma vez que o BOT compra, ele passará a vez. Se o BOT comprar e tiver a peça, ele jogará a mesma na partida. A partida se encerrará quando algum dos dois terem suas peças esgotadas. Para cada uma dessas hipóteses, o programa imprimirá de maneira autônoma a mensagem do vencedor e o nome.
