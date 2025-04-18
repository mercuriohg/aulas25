--Retornar os nomes dos alunos que fazem o curso de Administração 
select aluno from aluno where cod_curso = 1;

--Retornar todos os dados dos alunos.
SELECT * from aluno;

--Retornar todos os dados dos cursos.
select * from curso;

--Retornar a quantidade de alunos que fazem o curso de Informática.
select count(nome_aluno) from aluno where cod_curso = 2;

--Retornar a quantidade de alunos que fazem o curso de Informática OU Administração.
select count(nome_aluno) from aluno where cod_curso = 1 or cod_curso = 2;

--Retornar a quantidade de alunos que NÃO fazem o curso de Informática OU Administração.
select count(nome_aluno) from aluno where cod_curso != 1 and cod_curso != 2;

--Retornar a quantidade de alunos por curso.
SELECT c.nome_curso, COUNT(a.cod_aluno) AS quantidade_alunos
FROM curso c
LEFT JOIN aluno a ON c.cod_curso = a.cod_curso
GROUP BY c.nome_curso
ORDER BY quantidade_alunos DESC;

--Retornar a quantidade de alunos por curso ordenando em ordem crescente pela quantidade de alunos por curso.
SELECT c.nome_curso, COUNT(a.cod_aluno) AS quantidade_alunos
FROM curso c
LEFT JOIN aluno a ON c.cod_curso = a.cod_curso
GROUP BY c.nome_curso
ORDER BY quantidade_alunos ASC;
