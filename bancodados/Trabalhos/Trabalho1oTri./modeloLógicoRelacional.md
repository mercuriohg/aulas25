```txt

ESCOLA(Cod_Escola, Nome, Endereco, Cod_Professor,Cod_Estudante)
Cod_Professor Referencia Professor
Cod_Estudante Referencia Estudante

PROFESSOR(Cod_Professor, Nome, Celular, Cod_Escola, Cod_Faculdade)
Cod_Faculdade Referencia Faculdade
Cod_Escola Referencia Escola

FACULDADE(Cod_Faculdade, Nome, Curso, Cod_Professor)
Cod_Professor Referencia Professor

ESTUDANTES(Cod_Estudantes, Nome, Gmail, Celular, Cod_Escola, Cod_Time)
Cod_Escola Referencia Escola
Cod_Time Referencia Time

TIME(Cod_Time, Nome, Turma, Cod_Estudantes)
Cod_Estudantes Referencia Estudantes

CARGO(Cod_Escola, Cod_Professor, Diretor, Coordenador, Professor)
Cod_Escola Referencia Escola
Cod_Professor Referencia Professor
Diretor Referencia Professor
Coordenador Referencia Professor
Professor Referencia Professor
 
```
