```txt

ESCOLA(Cod_Escola, Nome, Endereco)

PROFESSOR(Cod_Professor, Nome, Celular, Cod_Escola, Cod_Faculdade)
Cod_Faculdade Referencia Faculdade
Cod_Escola Referencia Escola

FACULDADE(Cod_Faculdade, Nome, Curso)

ESTUDANTES(Cod_Estudantes, Nome, Gmail, Cod_Escola, Cod_Interseries)
Cod_Escola Referencia Escola
Cod_Interseries Referencia Interseries

INTERSERIES(Cod_Interseries, Nome, Turma, Cod_Estudantes)
Cod_Estudantes Referencia Estudantes
 
```
