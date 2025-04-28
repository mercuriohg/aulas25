```txt

ESCOLA(Cod_Escola, Nome, Endereco, Professores, Alunos, Cod_Professor)
Cod_Professor Referencia Professor

PROFESSOR(Cod_Professor, Nome, Formacao, Cod_Escola, Cod_Faculdade)
Cod_Faculdade Referencia Faculdade
Cod_Escola Referencia Escola

Faculdade(Cod_Faculdade, Nome, Curso, Cod_Professor)
Cod_Professor Referencia Professor

Cargo(Cod_Escola, Cod_Professor, Diretor, Coordenador, Professor)
Cod_Escola Referencia Escola
Cod_Professor Referencia Professor
 
```
