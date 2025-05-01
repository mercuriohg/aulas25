--Consulta 1: Deve envolver as cláusulas Select – From – Where. A consulta deve envolver no mínimo duas tabelas e fazer sentido.
SELECT 
   nome 
from 
   estudante 
where 
   codescola = 1;

--Consulta 2: Deve envolver as cláusulas Select – From – Where. Devem ser consultadas no mínimo 3 tabelas, a consulta deve fazer algum sentindo para o contexto escolhido.
SELECT 
    estudante.nome AS NomeEstudante, escola.nome AS NomeEscola, professor.nome AS NomeProfessor
FROM 
    Estudante estudante 
JOIN 
    Escola escola ON estudante.CodEscola = escola.CodEscola 
JOIN 
    Professor professor ON professor.CodEscola = escola.CodEscola 
WHERE 
    professor.Coordenador = 'Sim';

--Consulta 3: Essa consulta deve utilizar Select – From – Where – Group by – Having e Order by. Deve ser diferente das consultas anteriores e tem que envolver 2 ou mais tabelas e deve fazer algum sentido também.
SELECT 
    faculdade.nome AS NomeFaculdade,
    COUNT(professor.codprofessor) AS TotalProfessoresFormados
FROM 
    faculdade
JOIN 
    professor ON faculdade.codfaculdade = professor.codfaculdade
WHERE 
    professor.codprofessor IS NOT NULL
GROUP BY 
    faculdade.nome
HAVING 
    COUNT(professor.codprofessor) > 0
ORDER BY 
    TotalProfessoresFormados DESC;

--Consulta 4: Essa consulta deve utilizar Select – From – Where com alguma função de agregação (min, max, avg, sum, count) e pelo menos alguma das cláusulas (group by, having, order by). Deve ser uma consulta diferente das consultas anteriores e envolver 2 ou mais tabelas e deve fazer algum sentido.
SELECT 
    escola.nome AS NomeEscola,
    COUNT(professor.codprofessor) AS TotalProfessores
FROM 
    professor
JOIN 
    escola ON professor.codescola = escola.codescola
WHERE 
    professor.codprofessor IS NOT NULL
GROUP BY 
    escola.nome
HAVING 
    COUNT(professor.codprofessor) > 1
ORDER BY 
    TotalProfessores DESC;

--Consulta 1: Seleciono o nome de todos os alunos que estudam na escola de código 1.
--Consulta 2: Seleciono os nomes, as escolas e os professores, onde esses professores tem o cargo de coordenador = "Sim".
--Consulta 3: Seleciono as faculdades que formaram mais de 0 alunos. Existem faculdades que formam vários alunos, e alguns não se formam, então, pega as faculdades, a quantidade de alunos formados e ordena por ordem decrescente as faculdades que formaram mais que 0 alunos.
--Consulta 4: Seleciono o nome das escolas e pego o total de prof's que tem nelas, e mostro as escolas que tem mais que o total de 1 professor. 
