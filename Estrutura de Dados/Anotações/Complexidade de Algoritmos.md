
#### Sobre

Complexidade de algoritmos é uma área da ciência da computação que estuda a eficiência de algoritmos em termos de tempo de execução (tempo computacional) e uso de memória (espaço computacional).


| TIPO                   | DEFINIÇÃO                                                                                  |
| ---------------------- | ------------------------------------------------------------------------------------------ |
| Complexidade de Tempo  | Quantidade de operações elementares que um algoritmo realiza à medida que a entrada cresce |
| Complexidade de Espaço | Quantidade de memória adicional usada além da entrada                                      |


O processo de execução de um algoritmo pode ser dividido em etapas elementares, denominadas <mark style="background: #D2B3FFA6;">passos</mark>. Cada passo consiste na execução de um número fixo de operações básicas cujos tempos de execução são considerados constantes. A operação básica de maior frequência de execução no algoritmo é denominada <mark style="background: #D2B3FFA6;">operação dominante</mark>.

Sendo assim, o número de passos de um algoritmo pode ser interpretado como sendo o número de execuções da operação dominante.

Podemos definir a avaliação do tempo de execução de um algoritmo como sendo uma função que fornece o número de passos efetuados pelo algoritmo a partir de uma certa entrada.

##### Exemplo

Considere os problemas de determinar as matrizes soma C e produto D de duas matrizes dadas, $A = (aij)$ e $B = (bij)$, ambas n x n. 

```ini
Se n = 3, temos:

A = [a11 a12 a13]
    [a21 a22 a23]
    [a31 a32 a33]
    
B = [b11 b12 b13]
    [b21 b22 b23]
    [b31 b32 b33]
```

###### <span style="color:rgb(128, 128, 128)">Soma das matrizes - C</span>

```
para i := 1 até n:
	para j := 1 até n:
		cij := aij + bij
```

O algoritmo percorre cada posição (i, j) das matrizes. São <mark style="background: #D2B3FFA6;">n linhas</mark> e <mark style="background: #D2B3FFA6;">n colunas</mark>, ou seja, temos <mark style="background: #D2B3FFA6;">n x n = n² elementos</mark>. Para cada elemento, fazemos 1 operação de soma.

```r
Complexidade de tempo:

T(n) = O(n²)
```


###### <span style="color:rgb(128, 128, 128)">Produto das matrizes - D</span>

``` pseudo
para i := 1 até n:
	para j := 1 até n:
		cij:= 0
		para k := 1 até n:
			cij := cij + aik * bkj
```

Para calcular cada elemento `cij` da matriz resultado do produto `C = A x B`, usamos a definição matemática de multiplicação de matrizes (combinação linear).

Nesse caso, temos 3 laços de repetição anilhadas, i, j e k. Logo nosso total de iterações é: <mark style="background: #D2B3FFA6;">n x n x n = n³</mark>.

``` r
Complexidade de tempo:

T(n) = O(n³)
```



#### Análise de casos

Quando analisamos a complexidade de um algoritmo, precisamos considerar o comportamento do algoritmo frente a diferentes tipos de entrada. Por isso, temos três cenários distintos:


| TIPO        | DESCRIÇÃO                                                                                              | NOTAÇÃO COMUM |
| ----------- | ------------------------------------------------------------------------------------------------------ | ------------- |
| Pior caso   | Corresponde ao número de passos que o algoritmo efetua no seu pior caso de execução                    | `O(f(n))`     |
| Caso médio  | O tempo esperado considerando todas as entradas possíveis de tamanho `n`, ponderadas por probabilidade | `Θ(f(n))`     |
| Melhor caso | O tempo mínimo, ou seja, quando a entrada leva o menor número de operações                             | `Ω(f(n))`     |


##### Pior caso

Este caso é usado como uma garantia de desempenho: o algoritmo nunca será mais lento que isso.

Ideal para sistemas críticos (ex. tempo real), onde você precisa garantir que o sistema nunca ultrapasse um tempo limite.

Ex.: na **busca linear**, se o elemento está na última posição ou não existe, o algoritmo percorre toda a lista => `O(n)`

##### Caso médio

Depende da distribuição de probabilidade das entradas. Além disso, nem sempre é fácil de calcular, mas é mais realista.

Ex.: na **busca linear**, se todos os elementos têm chance igual de serem buscados, o elemento será encontrado, em média, na metade da lista => `Θ(n)`

##### Melhor caso

Pode ocorrer com entradas "favoráveis". Além disso, não é suficiente para garantir desempenho, pois é otimista demais.

Ex.: na **busca linear**, se o elemento está na primeira posição, o tempo é constante => `Ω(1)`.

<img src = "Estrutura%20de%20Dados/Imagens/Pasted%20image%2020250902171303.png">

