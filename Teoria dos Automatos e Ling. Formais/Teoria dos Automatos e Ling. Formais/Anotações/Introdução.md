
### Sobre

A Teoria dos Automatos pode ser caracterizada como o estudo de dispositivos de computação abstratos, ou "máquinas".

O Autômato é um dispositivo de computação abstrato, ou seja, ele não precisa ser necessariamente um hardware físico. Esse conceito está relacionado com uma questão fundamental da computação, que se refere ao que diferentes modelos de dispositivos de máquinas podem ou não fazer.

Aqui também entra a discussão Compatibilidade **X** Complexidade.

#### Teoria da Computação: Uma Perspectiva Histórica

| ANO           | ACONTECIMENTO                                                                             |
| ------------- | ----------------------------------------------------------------------------------------- |
| 1930s         | - Turing Machines<br>- Decidibilidade                                                     |
| 1940s - 1950s | - Estudo de máquinas "automatas finitas"<br>- "Chomsky Hierarchy" para linguagens formais |
| 1969          | - Problemas "intratáveis" ou "NP-Hard"                                                    |
| 1970          | - Ciências da computação moderna: compiladores, teoria computacional e da complexidade    |

#### Linguagens e Gramática

- **Linguagens (Definição):** É uma coleção de sentenças de tamanho finito, todas construídas a partir de um alfabeto de símbolos finitos.

- **Gramática (Definição):** Pode ser considerada um dispositivo que enumera as sentenças de uma língua.

![[Pasted image 20250903191847.png|227]]

##### Alfabeto

Um alfabeto é um conjunto finito e não vazio de símbolos. Usamos o símbolo ∑ (sigma) para denotar um alfabeto.

Exemplos:
- Binário: ∑ = {0,1}
- Letras minúsculas: ∑ = {a,b,c,...,z}
- Alfanúmero: ∑ = {a-z, A-Z, 0-9}


##### Strings

Uma string ou palavra é uma sequência finita de símbolos escolhidos de ∑. Uma string vazia é denotada de ε (ou “épsilon”). 

Já o comprimento de uma string x é denotado por |x|, e é igual ao número de caracteres (não ε) na string.

---
### Hierachy de Chomsky

É uma hierarquia das classes das linguagens formais, ou seja, uma classificação de gramáticas formais descrita em 1959 pelo linguista Noam Chomsky.

Ela possui 4 níveis, sendo que os dois últimos níveis são amplamente utilizados na descrição de linguagens de programação e na implementação de interpretadores e compiladores.

- Tipo 0: <span style="color:rgb(128, 128, 128)">Gramáticas com estrutura de frase ou restrita</span>
- Tipo 1: <span style="color:rgb(128, 128, 128)">// sensíveis ao contexto</span>
- Tipo 2: <span style="color:rgb(128, 128, 128)">// livres de contexto</span>
- Tipo 3: <span style="color:rgb(128, 128, 128)">// regulares</span>

![[Pasted image 20250903195054.png]]

![[Pasted image 20250903195101.png]]


