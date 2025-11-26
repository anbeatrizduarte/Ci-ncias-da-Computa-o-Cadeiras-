# Seleção

## Exemplo 3.1

### **Enunciado:** (BD embarques) Obter as peças que são da cidade "Rio" e cujo peso excede 15.

#### 1. Solução textual: 


```bash
σ peso_peca > 15 AND cidade_peca = "Rio"
    (peca)
```

| cod_peca | nome_peca | peso_peca | cor_peca | cidade_peca  |
| :------- | :-------- | :-------: | :------- | :----------- |
| P1       | Parafuso  | 5         | Cinza    | Porto Alegre |
| P2       | Arruela   | 5         | Cinza    | Porto Alegre |
| P3       | Mancal    | 25        | Vermelho | Rio          |
| P4       | Eixo      | 15        | Verde    | Rio          |
| P5       | Motor     | 65        | Vermelho | <N>          |


#### 2. Árvore sintática

```bash
σ peso_peca > 15 AND cidade_peca = "Rio"
                ^
                |
              (peca)
```

___

## Exemplo 3.2

### **Enunciado:** (BD embarques) Obter as peças que são da cidade "Rio" e cujo peso excede 15.

#### 1. Solução textual:

```bash
σ peca.peso_peco > 15 AND peca.cidade_peca = "Rio"
    peca()
```

#### 2. Ávore sintática
```bash
σ peca.peso_peca > 15 AND peca.cidade_peca = "Rio"
                ^
                |
              (peca)
```

___

# Projeção

## Exemplo 3.4

### **Enunciado:** (BD embarques) Obter os códigos e os nomes de todas as peças

#### 1. Árvore
```bash
π cod_peca, nome_peca
           ^
           |
          peca
```

#### 2. Solução textual
```bash
π cod_peca, nome_peca (peca)
```

___

## Exemplo 3.5

### **Enunciado:** (BD embarques) Obter as cidades em que há fornecedores

#### 1. Árvore
```bash
π cidade_fornec
        ^
        |
    fornecedor
```

#### 2. Texto:

```bash
π cidade_fornec (fornecedor)
```

___

# Interseção

## Exemplo 3.8

### **Enunciado:** (BD embarques) Obter os códigos das peças cuja cidade é Porto Alegre e que constam em embarques

#### 1. Árvore

```bash
(π cod_peca
    (embarque)
)

∩

(π cod_peca
    (σ cidade_peca = "Porto Alegre"
        (peca)
    )
)
```

___

# Renomeação

## Exemplo 3.15

### **Enunciado:** Obter uma tabela contendo uma linha para cada empregado que possui um chefe. Esta linha deve conter o nome do empregado, seguido do nome de seu chefe

#### 1. Solução textual

- Solução envolve concatenar duas linhas de empregado:
    - a linha do próprio empregado
    a linha do chefe do empregado

- Como distinguir as colunas destas duas linhas?
    - solução: **renomear** uma delas


___

# Lógica dos três valores

## Exemplo 3.17

### **Enunciado:** Obter os dados dos empregados cuja função é "C5"

#### 1. Árvore

```bash
σ funcao = "C5"
    ^
    |
empregado
```

#### 2. Texto

```bash
σ funcao = "C5" (empregado)
```