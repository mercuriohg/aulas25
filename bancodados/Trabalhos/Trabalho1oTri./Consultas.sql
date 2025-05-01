--Consulta 1: Deve envolver as cláusulas Select – From – Where. A consulta deve envolver no mínimo duas tabelas e fazer sentido.
SELECT * from estudante where codinterseries = 4001;

--Consulta 2: Deve envolver as cláusulas Select – From – Where. Devem ser consultadas no mínimo 3 tabelas, a consulta deve fazer algum sentindo para o contexto escolhido.
SELECT estudante.nome AS NomeEstudante, escola.nome AS NomeEscola, professor.nome AS NomeProfessor FROM Estudante estudante JOIN Escola escola ON estudante.CodEscola = escola.CodEscola JOIN Professor professor ON professor.CodEscola = escola.CodEscola WHERE professor.Coordenador = 'Sim';

--Consulta 3: Essa consulta deve utilizar Select – From – Where – Group by – Having e Order by. Deve ser diferente das consultas anteriores e tem que envolver 2 ou mais tabelas e deve fazer algum sentido também.
SELECT Escola.Nome AS NomeEscola, COUNT(Professor.CodProfessor) AS QuantidadeProfessores FROM Escola JOIN Professor ON Escola.CodEscola = Professor.CodEscola WHERE Professor.Nome IS NOT NULL GROUP BY Escola.Nome HAVING COUNT(Professor.CodProfessor) > 1 ORDER BY QuantidadeProfessores DESC;

--Consulta 4: Essa consulta deve utilizar Select – From – Where com alguma função de agregação (min, max, avg, sum, count) e pelo menos alguma das cláusulas (group by, having, order by). Deve ser uma consulta diferente das consultas anteriores e envolver 2 ou mais tabelas e deve fazer algum sentido.
SELECT 
    f.Nome AS NomeFaculdade,
    COUNT(p.CodProfessor) AS TotalProfessores,
    AVG(LENGTH(p.Nome)) AS MediaCaracteresNomeProfessor
FROM 
    Faculdade f
JOIN 
    Professor p ON f.CodFaculdade = p.CodFaculdade
WHERE 
    p.CodProfessor IS NOT NULL
GROUP BY 
    f.Nome
HAVING 
    COUNT(p.CodProfessor) > 1
ORDER BY 
    f.Nome ASC;


