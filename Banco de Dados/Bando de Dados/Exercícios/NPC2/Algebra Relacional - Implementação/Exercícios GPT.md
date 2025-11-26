
#### Sobre

>Q1.: Escreva a seguinte consulta na **Álgebra Relacional** utilizando **junção externa**.  
   Liste o nome (primeiro e último) de todos os alunos, junto com as disciplinas em que estão matriculados.  
   Alunos sem matrícula devem aparecer com valores nulos para os dados da disciplina.

```nginx
// externa

π PrimeiroNome, UltimoNome, NomeDisc (Aluno ⟕ Alunos.NumAluno = Matricula.NumAluno (Matricula ⟕ Matricula.CodigoDisc = Disciplina.CodigoDisc (Disciplina))
```


> Q2.:   Escreva a consulta na **Álgebra Relacional** utilizando **junção theta**.  
	Recupere o nome das disciplinas que são oferecidas no mesmo departamento em que o professor responsável pela turma trabalha.

```nginx
π NomeDisc 
	(Disciplinas ⨝(Disciplinas.CodigoDisc = Turma.CodigoDisc
		( Turma ⨝ Professor.Num_Prof = Turma.NumProf (Professor)) 
		⨝ Disciplinas.NumDepto = Professor.NumDepto)
```


> Q3.:  Escreva a consulta na **Álgebra Relacional** utilizando **junção natural**.  
	Recupere o nome e último nome dos alunos que **não possuem nenhuma matrícula registrada**.

```nginx
1: Aluno ⨝ Aluno.NumAluno = Matricula.NumAluno (Matricula)

π PrimeiroNome, UltimoNome (Aluno - (Aluno ⨝ Aluno.NumAluno = Matricula.NumAluno (Matricula)))
```


>Q4.: Escreva a consulta na **Álgebra Relacional** utilizando **agregação (γ)**.  
   Recupere para cada disciplina o **número de alunos matriculados** e a **média das notas**.

```nginx
1: 

γCodDisc; AVG(Media_Notas) (Matricula ⨝ Matricula.CodigoDisc = Disciplina.CodigoDisc (Disciplina))
```


> Q5.: Escreva a consulta na **Álgebra Relacional** utilizando **seleção, projeção e junção**.  
   Recupere os nomes dos professores que ministraram turmas no ano de **2024**.

```nginx
1: Professor ⨝ NumProf = Turma.NumProf (Turma)

2: σ Ano = "2024" (Turma) 

π PrimeiroNome, IncialMeio, UltimoNome
	(Professor ⨝ NumProf = Turma.NumProf
		(σ Ano = "2024" (Turma)))
```


>Q6.: Escreva a consulta na **Álgebra Relacional** utilizando **junção e seleção**.  
   Recupere os nomes dos alunos matriculados em **todas as disciplinas do Departamento de ‘Computação’**.

```nginx
1: σ NomeDepto = "Computação" (Departamento)

π PrimeiroNome, InicialMeio, UltimoNome ( Aluno ⨝ Aluno.NumAluno = NumAluno ( (π NumAluno, CodigoDisc (Matricula)) ÷ (π CodigoDisc (Disciplina ⨝ Disciplina.NumDepto = Departamento.NumDepto (σ NomeDepto="Computação" (Departamento)))) ) )
```


>Q7.: Escreva a consulta no **Cálculo Relacional de Tupla**, usando **quantificador existencial**.  
   Recupere os nomes dos cursos que possuem **algum aluno com nota maior que 9.0** em qualquer disciplina.

```nginx
{ c.NomeCurso | Curso(c) AND (∃a)(Aluno(a) AND a.NumCurso = c.NumCurso AND (∃m)(Matricula(m) AND m.NumAluno = a.NumAluno AND m.Nota > 9))}
```


>Q8.: Escreva a consulta no **Cálculo Relacional de Tupla**, usando **quantificador universal**.  
   Recupere os nomes dos alunos que **obtiveram nota ≥ 7** em **todas as disciplinas nas quais estão matriculados**.

```nginx
{ a.Nome | Alunos(a) AND ∀d(Disciplinas(d) AND (∃t)(Turma(t) t.nota >= 7 AND t.CodigoDisc = d.CodigoDisc AND m.NumAluno = a.NumAluno))}
```










___

>  Recupere o **PrimeiroNome**, **InicialMeio** e **UltimoNome** de todos os alunos matriculados em alguma disciplina cujo **NomeDepto** seja “Engenharia”.

```nginx
1: 

2: Matricula ⨝ Matricula.CodigoDisc = Disciplina.CodigoDisc (Disciplina)

3: Disciplina ⨝ Disciplina.NumDepto = Departamento.NumDepto (Departamento)

4: σ NomeDepto = "Engenharia"

π PrimeiroNome,InicialNome, UltimoNome 
	(Aluno ⨝ Aluno.NumAluno = Matricula.NumAluno 
		(Matricula ⨝ Matricula.CodigoDisc = Disciplina.CodigoDisc 
			(Disciplina ⨝ Disciplina.NumDepto = Departamento.NumDepto 
				(σ NomeDepto = "Engenharia" (Departamento))))
```


> Liste o **NomeDisc** e o **NumDepto** das disciplinas que são ministradas por professores do departamento “Matemática”.

```nginx
1: Disciplina ⨝ Disciplina.NumDepto = Professor.NumDepto (Professor)

2: Professor ⨝ Professor.NumDepto = Departamento.NumDepto (Departamento)

3: σ NomeDepto = "Matemática"

π NomeDisc, NumDepto 
	(Disciplina ⨝ Disciplina.NumDepto = Professor.NumDepto 
		(Professor ⨝ Professor.NumDepto = Departamento.NumDepto 
			(σ NomeDepto = "Matemática" (Departamento)))
```


> Recupere os nomes dos alunos **que não estão matriculados em nenhuma disciplina**.

```nginx
1: Aluno ⨝ Aluno.NumAluno = Matricula.NumAluno (Matricula)

2: Matricula ⨝ Matricula.CodigoDisc = Disciplina.CodigoDisc (Disciplina)

π PrimeiroNome, InicialMeio, UltimoNome 
	(Aluno - 
		(Aluno ⨝ Aluno.NumAluno = Matricula.NumAluno 
			(Matricula ⨝ Matricula.CodigoDisc = Disciplina.CodigoDisc (Disciplina))))
```


> Liste, para cada disciplina, o **média das Notas** obtidas pelos alunos nessa disciplina.

```nginx
1: Disciplina ⨝ Disciplina.CodigoDisc = Turma.CodigoDisc (Turma)

2: AVG(Media_Notas)

γCodigoDisc; AVG(Media_Notas) 
	(Disciplina ⨝ Disciplina.CodigoDisc = Turma.CodigoDisc (Turma) )
```


> Recupere os nomes dos professores que ministram turmas no **semestre de 2024/2**.

```nginx
1: Professor ⨝ Professor.NumProf = Turma.NumProf (Turma)

2: σ Semestre = "2024/2" (Turma)

π PrimeiroNome,InicialMeio, UltimoNome 
	(Professor ⨝ Professor.NumProf = Turma.NumProf 
		(σ Semestre = "2024/2" (Turma)))
```


> Liste o **PrimeiroNome** e **UltimoNome** de todos os alunos cujo **curso pertence ao Departamento de 'Computação'**.

```nginx
1: Aluno ⨝ Aluno.NumCurso = Curso.NumCurso (Curso)

2: Curso ⨝ Curso.NomeDepto = Departamento.NomeDepto (Departamento)

3: σ NomeDepto = "Computação"

π PrimeiroNome, UltimoNome 
	(Aluno ⨝ Aluno.NumCurso = Curso.NumCurso 
		(Curso ⨝ Curso.NomeDepto = Departamento.NomeDepto 
			(σ NomeDepto = "Computação" (Departamento))))
```


> Recupere o **NomeCurso** de todos os cursos que possuem **algum aluno** com **Nota maior que 8.5** na turma em que está matriculado.

```nginx
{ c.NomeCurso | 
	Curso(c) AND 
		(∃a)(Aluno(a) AND a.NumCurso = c.NumCurso AND 
			(∃m)(Matricula(m) AND m.NumAluno = a.NumAluno AND 
				(∃t)(Turma(t) AND t.NumTurma = m.NumTurma AND t.Nota > 8.5)))}
```


> Recupere os nomes dos alunos que estão matriculados em **todas as disciplinas oferecidas no semestre de 2024/1**.

```nginx
{ a.PrimeiroNome, a.InicialMeio, a.UltimoNome | 
	Aluno(a) AND 
		(∀m)(Matricula(m) AND m.NumAluno = a.NumAluno AND m.Semestre = "2024/1")}
```


___



> RA: Recupere os nomes completos dos alunos que cursaram alguma disciplina oferecida pelo departamento cujo **LocalDepto = 'Campus Central'**.

```nginx
1: Alunos ⨝ Aluno.NumAluno = Matricula.NumAluno (Matricula)

2: Matricula ⨝ Matricula.CodigoDisc = Disciplina.CodigoDisc (Disciplina)

3: Disciplina ⨝ Disciplina.NumDepto = Departamento.NumDepto (Departamento)

4: σ Local_Depto = "Campus Central" (Departamento)

π PrimeiroNome, InicialNome, UltimoNome
	(Aluno ⨝ Aluno.NumAluno = Matricula.NumAluno 
		(Matricula ⨝ Matricula.CodigoDisc = Disciplina.CodigoDisc 
			(Disciplina ⨝ Disciplina.NumDepto = Departamento.NumDepto 
				(σ LocalDepto = "Campus Central" (Departamento)))))
```


> Para cada departamento, recupere o nome e o número total de disciplinas associadas a ele.

```nginx
1: Departamento ⨝ Departamento.NumDepto = Disciplina.NumDepto

π NomeDisc, CodigoDisc 
	(Disciplina ⨝ Disciplina.NumDepto = Departamento.NumDepto (Departamento))
```


> Liste os nomes dos alunos que **nunca** se matricularam em nenhuma disciplina no ano de **2024**.

```nginx
1: Aluno ⨝ Aluno.NumAluno = Matricula.NumAluno (Matricula)

2: Matricula ⨝ Matricula.CodigoDisc = Disciplina.CodigoDisc (Disciplina)

3: σ Ano = "2024" (Matricula)

π PrimeiroNome, InicialNome, UltimoNome
	(Aluno - (Aluno ⨝ Aluno.NumAluno = Matricula.NumAluno 
		(σ Ano = "2024" (Matricula ⨝ Matricula.CodigoDisc = Disciplina.CodigoDisc (Disciplina))))
		
//

π PrimeiroNome, InicialNome, UltimoNome
	(Aluno - 
		π NumAluno (σ Ano = "2024" (Matricula))))
```


> Liste os nomes dos professores que lecionam disciplinas pertencentes a **departamentos diferentes** do departamento do próprio professor.

```nginx
1: Professor ⨝ Professor.IdProf = Ensina.IdProf (Ensina)

2: Ensina ⨝ Ensina.CodigoDisc = Disciplina.CodigoDisc (Disciplina)

3: Professor.NumDepto ≠ Disciplina.NumDepto

π PrimeiroNome, InicialNome, UltimoNome 
	(Professor ⨝ Professor.IdProf = Ensina.IdProf 
		(Ensina ⨝ Ensina.CodigoDisc = Disciplina.CodigoDisc 
			(σ Professor.NumDepto ≠ Disciplina.NumDepto (Disciplina))))
```


> Encontre os alunos matriculados em **todas** as disciplinas do departamento **'Computação'**.

```nginx
1: Aluno ⨝ Aluno.NumAluno = Disciplina.NumAluno (Disciplina)

2: Disciplina ⨝ Disciplina.NumDepto = Departamento.NumDepto (Departamento)

3: σ NomeDepto = "Computação" (Departamento)

π Aluno ⨝ Aluno.NumAluno = Disciplina.NumAluno 
	(Disciplina ⨝ Disciplina.NumDepto = Departamento.NumDepto /
		(σ NomeDepto = "Computação" (Departamento)))
		
//

π PrimeiroNome, InicialMeio, UltimoNome
  (Aluno ⨝ Aluno.NumAluno =
      ((π NumAluno, CodigoDisc (Matricula)) ÷
       (π CodigoDisc (σ NomeDepto = "Computação"
            (Disciplina ⨝ Disciplina.NumDepto = Departamento.NumDepto (Departamento))))))

```


>  Liste todas as disciplinas cujo nome **não aparece em nenhuma matrícula**, ou seja, nunca foram cursadas por nenhum aluno.

```
```