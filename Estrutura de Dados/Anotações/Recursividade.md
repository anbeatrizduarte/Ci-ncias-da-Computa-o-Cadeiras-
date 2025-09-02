#### Sobre
Recursividade é uma técnica de programação em que uma função chama a si mesma para resolver subproblemas menores do problema original.

Cada chamada de função vai para a pilha de camadas (stack). Quando o caso base é alcançado, as chamadas começam a ser resolvidas de trás para frente (desempilhadas).

Exemplos típicos de uso:
- Definições matemáticas recursivas (fatorial, Fibonacci)
- Estruturas hierárquicas (árvores, grafos)
- Algoritmos do tipo "dividir para conquistar" (merge sort, quick sort)

<mark style="background: #D2B3FFA6;">Vantagens:</mark>
- Código mais simples e próximo da definição matemática
- Melhor legibilidade em problemas naturalmente recursivos

<mark style="background: #D2B3FFA6;">Desvantagens:</mark>
- Consome mais memória
- Muitas vezes um algoritmo iterativo é mais eficiente


---

#### Exemplos

##### <span style="color:rgb(128, 128, 128)">Fatorial</span> 

```java
public static int fatorial(int n) {
	if (n == 0 || n == 1) return 1; // caso base
	return n * fatorial(n-1) // passo recursivo
} 
```

Definição matemática:
	0! = 1
	n! = n * (n-1)!


##### <span style="color:rgb(128, 128, 128)">Fibonacci</span> 

```java
public static int fibonacci(int n) {
	if (n <= 1) return n; // caso base
	return fibonacci(n-1) + fibonacci(n-2); // passo recursivo
}
```

Definição matemática:
	F(0) = 0
	F(1) = 1
	F(n) = F(n-1) + F(n-2)


##### <span style="color:rgb(128, 128, 128)">Torres de Hanói</span> 

```java
public static void hanoi(int n, char origem, char auxiliar, char destino) {
	if (n == 1) {
		System.out.print("Mover disco de " + origem + " para " + destino);
	} else {
		hanoi(n - 1, origem, destino, auxiliar);
		System.out.print("Mover disco de " + origem + " para " + destino);
		hanoi(n - 1, auxiliar, origem, destino);
	}
}
```





