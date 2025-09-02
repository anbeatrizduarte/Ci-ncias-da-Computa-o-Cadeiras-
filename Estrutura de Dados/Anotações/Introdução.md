
#### Sobre

Estruturas da Dados são formas de organizar e armazenar dados para que possam sem utilizados de forma eficiente, como por exemplo: <span style="color:rgb(128, 128, 128)">vetores, listas ligas, pilhas, filhas, árvores, grafos, entre outros</span>.

Apesar de Python já conter conceitos de listas e dicionários, é importante entender através da disciplina como os dados são implementados, quais são os custos de cada operação e quando usar cada estrutura de forma adequada.

Nem todo algoritmo ou estrutura é igualmente rápido, por conta disso se torna necessário analisar usando a <span style="font-weight:bold; color:rgb(188, 126, 236)">complexidade de tempo</span> (quantidade de passos) e a <span style="font-weight:bold; color:rgb(188, 126, 236)">complexidade de espaço</span> (memória usada).

Para isso usamos a notação Big-O (ou Big-O Notation) que serve para comparar soluções e escolher a mais adequada para o problema.


---
#### Algoritmos

Algoritmo é uma sequência finita de instruções, bem definidas, que transformam uma entrada em uma saída.

Características:
- Corretude: deve resolver o problema para todos os casos válidos
- Finitude: deve terminar em algum momento
- Clareza: cada passo precisa ser objetivo e não ambíguo
- Eficiência: deve ser rápido e usar poucos recursos

No começo, antes de ir para o Python, os algortimos serão descritos através de uma linguagem de leitura simples.

- A declaração de atribuição é indicada pelo símbolo: **=**
- As declarações são empregadas com significado semelhante ao usual: **se...então, se...então...senão, enquanto...faça, para...faça, pare**

##### Exemplos de Algoritmos

![[Pasted image 20250902171303.png]]
``` java
package Exer1;
import java.util.*;
public class Q1Java {
    public static void main(String[] args) {
        int n = 3;
        int[] nums = {3, 0, 1};
        int soma = 0;
        int maximo = (n * (n + 1)) / 2;
        for (int i = 0; i < nums.length; i++) {
            soma += nums[i];    
        }
        int numFaltante = maximo - soma;
        System.out.println("O número faltando é: " + numFaltante);
    }
}
```


![[Pasted image 20250902171423.png]]
```java
package Exer1;
public class Q2Java {
    public static void main(String[] args) {
        int alvo = 6;
        int[] nums = {3,2,4};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int soma = nums[i] + nums[j];
                if (soma == alvo) {
                    System.out.println("Os índices são " + i + " e " + j);
                    System.out.println("Os elementos são " + nums[i] + " e " + nums[j]);
                }
            }
        }
    }
}
```


![[Pasted image 20250902171514.png]]
```java
package Exer1;
public class Q3Java {
    public static void main(String[] agrs) {
        int[] nums = {1, 2, 3, 4};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.print("false");
    }
}
```


![[Pasted image 20250902171604.png]]
```java
package Exer1;
public class Q4Java {
    public static void main(String[] args) {
        int[] nums = {2,2, 1};
        for (int i = 0; i < nums.length; i++) {
            boolean numeroDuplicado = false;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    numeroDuplicado = true;
                    break;
                }
            }
            if (!numeroDuplicado) {
                System.out.print("O número não duplicado é: " + nums[i]);
            }
        }
    }
}
```


![[Pasted image 20250902171721.png]]
```java
package Exer1;
public class Q5Java {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3};
        int ultimoIndice = nums.length - 1;
        for (int i = ultimoIndice; i >= 0; i--) {
            if (nums[i] != 9) {
                nums[i]++;
                break;
            } else {
                nums[i] = 0;
            }
        }
        if (nums[0] == 0) {
            int[] novoVetor = new int[ultimoIndice + 2];
            novoVetor[0] = 1;
            nums = novoVetor;
        }
        System.out.println("Número de elementos: " + nums.length);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
```

