# Jogo de Castelos: Japoneses vs. Europeus

## Descrição

Este projeto é um jogo de combate entre castelos japoneses e europeus. O jogo envolve dois castelos japoneses e dois castelos europeus, que lutam entre si até que apenas um castelo permaneça, declarando-o o vencedor.

Cada castelo possui:
- **Castelos Japoneses**: Com 15 Samurais, 2 pontos de vida e 2 defesas.
- **Castelos Europeus**: Com 10 Paladinos, 2 pontos de vida e 3 defesas.

## Regras do Jogo

1. O jogo começa com dois castelos japoneses e dois castelos europeus armazenados em uma lista.
2. A cada rodada, um castelo escolhe outro para atacar.
3. Um número entre 0 e 10 é sorteado. Se o número for 0, o castelo passa a vez. Caso contrário, o castelo atacante destrói aquela quantidade de guerreiros do castelo inimigo.
4. Quando os guerreiros de um castelo são eliminados, o castelo passa a perder defesas e pontos de vida.
5. O castelo é removido da lista assim que todos os seus pontos de vida se esgotarem.
6. O jogo termina quando restar apenas um castelo na lista, que será o vencedor.

## Instalação

1. Clone este repositório:
    ```bash
    git clone https://github.com/usuario/jogo-castelos.git
    ```

2. Navegue até o diretório do projeto:
    ```bash
    cd jogo-castelos
    ```

3. Compile e execute o projeto utilizando um compilador Java, como o `javac` e o `java`:
    ```bash
    javac C2/*.java
    java C2.App
    ```

## Estrutura do Projeto

- `App.java`: Controla o fluxo principal do jogo, preenchendo a lista de castelos e controlando o turno de ataques.
- `Castelo.java`: Classe abstrata que define as propriedades e métodos comuns de um castelo, como nome, defesa, pontos de vida, e o mecanismo de ataque.
- `Dado.java`: Simula o lançamento de um dado, retornando um número aleatório entre 0 e 10.
- `Europeu.java`: Classe derivada de `Castelo`, representando um castelo europeu, com 10 paladinos.
- `Japones.java`: Classe derivada de `Castelo`, representando um castelo japonês, com 15 samurais.

## Como Jogar

1. Após iniciar o jogo, insira os nomes para os castelos japoneses e europeus.
2. Escolha os castelos que deseja atacar ao longo do jogo, digitando o índice correspondente.
3. Acompanhe o progresso do jogo, vendo a situação de cada castelo e o resultado de cada ataque.
4. O jogo continua até que restar apenas um castelo, que será o vencedor.

## Exemplo de Execução

```bash
Nome do 1º Castelo Europeu: Fortaleza Real
Nome do 1º Castelo Japonês: Castelo Samurai
Vez de Castelo: Fortaleza Real

Escolha um castelo para atacar:
Index: 0 | Nome: Fortaleza Real
Index: 1 | Nome: Castelo Samurai
: 1
Valor dado: 7
Situação do castelo atacado:
Defesa: 1
Pontos de Vida: 2
Quantidade de Samurais: 8
