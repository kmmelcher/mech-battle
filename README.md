# Mech Battle

## *Em inglês | In english:*

### *What is Mech Battle?*
Mech Battle is a player vs computer minigame programmed in Java, which consists of a fight between two robots in turns on a 10x10 map, which has a simple objective: **destroy the enemy!**

The game starts with robots (size 1x1) spawning at different points on a diagonal line of the map. At each turn, a robot can perform two actions, which can be:

#### *1. Rotate: ↪↩*
It moves the robot 90 degrees around its own axis, which can be either left or right.

#### *2. Move: 🚶‍♂️💨*
The robot moves forward 1 pixel. If one robot collides on the enemy while moving, both are destroyed and the game ends in a draw. 

#### *3. Scan: 🤖:exclamation:*
The robot scans the entire map, finding the exact position of the enemy. Until the map is scanned, the bot won't know where the enemy is. Every time one robot scans the map, the other must be told that it has been scanned.

#### *4. Shoot: :gun: | Reload 🔃*
The robot fires a shot in an attempt to hit the enemy. The shot has a range of 2x1, and instantly destroys the enemy if it is hit. Every time a shot is fired, the robot must reload its weapon, enabling it to fire again. 

### *How to play:*
To play Mech Battle, basically, the player must type the highlighted key in the sentence that contains the action that must be performed.
> Example:
>
> (D)o you want to perform this action?
>
> *Player must type "D" key and press Enter* 

### UML System Model
To create the UML version of Mech Battle, the `UML.txt` file was created. The content of this file must be inserted in the main text field of the site [Modeligado](https://matheusgr.github.io/modeligado/edit.html) to analyze the system class diagram. Modeligado was created by [Matheus Gaudêncio do Rêgo](https://github.com/matheusgr) and the system repository can be found [here](https://github.com/matheusgr/modeligado). 

## *Em português | In portuguese:*

### *O que é Mech Battle?*
Mech Battle é um minigame de jogador vs computador programado em Java, que consiste em uma briga de dois robôs em turnos em um mapa de 10x10, no qual o objetivo é simples: **destruir o inimigo!**

O jogo começa com os robôs (de tamanho 1x1) nascendo em pontos diferentes da diagonal do mapa. A cada turno, um robô pode realizar duas ações, podendo ser:

#### *1. Girar: ↪↩*
Move o robô em 90 graus em torno de seu próprio eixo, podendo ser uma movimentação tanto para a esquerda quanto para a direita.

#### *2. Mover: 🚶‍♂️💨*
O robô avança 1 pixel a frente. Se um robô colide no outro enquanto se move, ambos são destruídos e o jogo termina empatado.

#### *3. Escanear: 🤖:exclamation:*
O robô escaneia o mapa inteiro, descobrindo a exata posição do robô inimigo. Enquanto não escanear o mapa, ele não irá saber onde o robô inimigo se encontra. Toda vez que um robô escanear o mapa, o outro deve ser avisado que foi escaneado.

#### *4. Atirar: :gun: | Recarregar 🔃*
O robô dispara um tiro na tentativa de acertar o inimigo. O tiro tem um alcance de 2x1, e destroi o robô inimigo instantaneamente, caso este seja atingido. Toda vez que for disparado um tiro, o robô precisa recarregar sua arma, habilitando-a para um novo disparo.

### *Como Jogar:*
Para jogar Mech Battle, basicamente, é preciso que o jogador digite a tecla destacada na frase que contém a ação que deve ser executada
> Exemplo:
> 
> (D)eseja executar esta ação?
> 
> *Jogador deve digitar a tecla "D" e pressionar Enter*

### Modelo UML do Sistma
Para a criação da versão UML de Mech Battle, foi criado o arquivo `UML.txt`. O conteúdo deste arquivo deve ser inserido no campo de texto principal do site [Modeligado](https://matheusgr.github.io/modeligado/edit.html) para ser analisado o diagrama de classes do sistema. O Modeligado foi criado por [Matheus Gaudêncio do Rêgo](https://github.com/matheusgr) e o repositório do sistema pode ser encontrado [aqui](https://github.com/matheusgr/modeligado).
