
#### Modelo

<img src = "/Imagens/Modelo.png" width ="600" >


#### Questões

>  Listar o nome e o endereço de todos os funcionários que trabalham no departamento "Pesquisa"

```nginx
{ f.Primeiro_Nome, f.Nome_Meio, f.Ultimo_nome, f.Endereco | Funcionario(f) AND ∃d(Departamento(d) AND d.Nome_Departamento = "Pesquisa" AND d.Numero_departamento = f.Numero_Departamento)}
```


>  Para cada projeto localizado em "Mauá", lista o número do projeto, o número do departamento de controle e o sobrenome, a data de Nascimento e o endereço do gerente do departamento

```nginx
{ < | Projeto(p) AND Funcionario(f) AND p.Local_Projeto = "Mauá" AND (∃d)(Departamento(d) AND p.Numero_departamento = d.Numero_departamento AND d.Cpf_gerente = f.Cpf)}
```


>  Listar o nome de cada funcionário que trabalha em algum projeto controlado pelo departamento número 5

```nginx
{ f.PrimeiroNome, f.InicialMeio, f.UltimoNome> | Funcionario(f) AND (∃p)(∃t)(Projeto(p) AND Trabalha_Em(t) AND p.Numero_Departamento = "5" AND t.Cpf_funcionario = f.Cpf AND p.Numero_Projeto = t.Numero_Projeto)}
```


>  Fazer uma lista dos números de projeto que envolvem um funcionário cujo último nome é silva, seja como um trabalhador, seja como um gerente do departamento

```nginx
{ p.Numero_Projetos | Projetos(p) AND (∃f)(∃t)(Funcionario(f) AND Trabalha_Em(t) f.UltimoNome = "Silva" AND f.Cpf = t.Cpf_funcionario AND p.Numero_Projeto = t.Numero_Projeto)}
```