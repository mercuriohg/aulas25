--1.Listar todos os jogadores ordenando por ordem crescente de salário.
Select * FROM jogador order by salario ASC;

--2.Listar todos os jogadores e idade, ordenando por ordem decrescente de idade.
Select nome,idade FROM jogador ORDER BY idade DESC;

--3.Listar todos os jogadores e idade, ordenando por ordem crescente de idade.
Select nome,idade FROM jogador ORDER BY idade ASC;

--4.Atualizar salário de todos os jogadores de codclube = 1, aumentando 20% do salário. 
SELECT nome,salario,salario * 0.20 AS salario_com_aumento FROM jogador WHERE codclube = 1;

--5.Atualizar salário de todos os jogadores de codclube = 2, diminuindo 20% do salário. 
SELECT nome,salario,salario - (salario*0.20) AS salario_com_desconto FROM jogador WHERE codclube = 2;

--6.Listar o nome e salario do jogador com o menor e o maior salario, respectivamente.
SELECT nome,salario from jogador WHERE salario = (SELECT MAX(salario) FROM jogador) or salario = (SELECT Min(salario) FROM jogador);

--7.Listar o nome dos jogadores com o nome dos seus clubes.
SELECT jogador.nome as jogador,clube.nome as clube from jogador join clube on jogador.codclube = clube.codclube;

--8."Excluir" todos os registros de campeonatos inferiores a 2007.
SELECT ano from campeonato where ano < 2007;

--9.Listar as cidades e os nomes dos clubes dessas cidades.
SELECT cidade.nome as cidade, clube.nome as clube from cidade join clube on cidade.codcidade = clube.codclube;

--10.Listar o nome e posicao dos jogadores do clube "Gremio".
SELECT jogador.nome as jogador,posicao, clube.nome as clube from jogador join clube on jogador.codjogador = clube.codclube WHERE clube.codclube = 1;
