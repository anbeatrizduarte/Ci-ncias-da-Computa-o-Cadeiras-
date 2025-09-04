#### Sobre

Os Automatos Finitos são modelos formais de "computadores/programas" simples de descrever, mas capazes de resolver vários problemas teóricos e com algumas aplicações práticas. Um autômato tem como entrada uma palavra que é processada símbolo a símbolo até que termina num certo estado. Ele pode ser representado por um grafo orientado, onde os vértices são os estados e as arestas indicam como são lidos os símbolos.

Algumas aplicações de máquinas automatas finitas:
- Softwares para desenhar e checar comportamentos de circuitos digitais
- Analisadores léxicos de compiladores
- Software para escanear grandes volumes de texto em busca de padrões
- Software para verificar sistemas de todos os tipos que possuem um número finito de estados

Os autômatos finitos são separados em dois grupos: os <mark style="background: #D2B3FFA6;">Determinísticos (AFD)</mark>, <mark style="background: #D2B3FFA6;">Não Determinísticos</mark> e <mark style="background: #D2B3FFA6;">Não Determinísticos com Transições e Espontâneas</mark>.

##### Determinísticos 
Cada estado de um autômato desse tipo tem uma transição para cada símbolo do alfabeto

![[Exemplo-AFD]]

O estado inicial é q1 = 0, já os estados finais são os elementos de F = {q1, q2}.

Os estados finais representam "situações de aceitação", ou seja, se depois de ler toda a palavra, o autômato terminar em um estado final, a palavra é aceita. Caso contrário, é rejeitada.

No caso do exemplo, qualquer palavra, que ao ser processada desde o q0, termine em q1 ou q2, será aceita.

``` rust
Palavra | Caminho                         | Resultado
--------|---------------------------------|------------
0       | q0 --0--> q1                    | Aceita ✅
1       | q0 --1--> q2                    | Aceita ✅
01      | q0 --0--> q1 --1--> q3          | Rejeita ❌
11      | q0 --1--> q2 --1--> q2          | Aceita ✅
10      | q0 --1--> q2 --0--> q2          | Aceita ✅
```


##### Não Determinísticos 
Os estados de um autômato desse tipo podem ou não ter uma transição para cada símbolo do alfabeto, ou podem ter até mesmo múltiplas transições para cada símbolo

##### Não Determinísticos com Transições
Além de ser capaz de pular para mais (ou nenhum) estados com quaisquer símbolos, esse tipo pode pular para outros estados sem que haja nenhum símbolo (String vazia).