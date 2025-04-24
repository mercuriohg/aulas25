CREATE TABLE Faculdade (
  Cod_Faculdade INTEGER NOT NULL,
  Nome VARCHAR(70) NOT NULL,
  Curso VARCHAR(40) NOT NULL,
  Cod_Professor INTEGER,
  PRIMARY KEY (Cod_Faculdade),
  FOREIGN KEY (Cod_Professor) REFERENCES Professor(Cod_Professor)
);

CREATE TABLE Professor (
  Cod_Professor INTEGER NOT NULL,
  Nome VARCHAR(50) NOT NULL,
  Formacao VARCHAR(30) NOT NULL,
  Cod_Escola INTEGER,
  Cod_Faculdade INTEGER NOT NULL,
  PRIMARY KEY (Cod_Professor),
  FOREIGN KEY (Cod_Escola) REFERENCES Escola(Cod_Escola),
  FOREIGN KEY (Cod_Faculdade) REFERENCES Faculdade(Cod_Faculdade)
);

CREATE TABLE Escola (
  Cod_Escola INTEGER NOT NULL,
  Nome VARCHAR(100) NOT NULL,
  Endereco VARCHAR(50) NOT NULL,
  Professores INTEGER,
  Alunos INTEGER,
  Cod_Professor INTEGER,
  PRIMARY KEY (Cod_Escola),
  FOREIGN KEY (Cod_Professor) REFERENCES Professor(Cod_Professor)
);

CREATE TABLE Cargo (
  Cod_Escola INTEGER NOT NULL,
  Cod_Professor INTEGER NOT NULL,
  Diretor INTEGER NOT NULL,
  Coordenador INTEGER NOT NULL,
  Professor INTEGER NOT NULL,
  PRIMARY KEY (Cod_Escola, Cod_Professor),
  FOREIGN KEY (Cod_Escola) REFERENCES Escola(Cod_Escola),
  FOREIGN KEY (Cod_Professor) REFERENCES Professor(Cod_Professor),
  FOREIGN KEY (Diretor) REFERENCES Professor(Cod_Professor),
  FOREIGN KEY (Coordenador) REFERENCES Professor(Cod_Professor),
  FOREIGN KEY (Professor) REFERENCES Professor(Cod_Professor)
);

INSERT INTO Faculdade VALUES (1, 'UFSP', 'Matemática', NULL);
INSERT INTO Faculdade VALUES (2, 'USP', 'Física', NULL);
INSERT INTO Faculdade VALUES (3, 'PUC', 'História', NULL);
INSERT INTO Faculdade VALUES (4, 'UNESP', 'Biologia', NULL);
INSERT INTO Faculdade VALUES (5, 'UFRJ', 'Química', NULL);
INSERT INTO Faculdade VALUES (6, 'UFBA', 'Geografia', NULL);
INSERT INTO Faculdade VALUES (7, 'UNB', 'Filosofia', NULL);
INSERT INTO Faculdade VALUES (8, 'UFSC', 'Letras', NULL);
INSERT INTO Faculdade VALUES (9, 'UTFPR', 'Engenharia', NULL);
INSERT INTO Faculdade VALUES (10, 'UNIFESP', 'Educação Física', NULL);

INSERT INTO Professor VALUES (1, 'Carlos Silva', 'Mestre', NULL, 1);
INSERT INTO Professor VALUES (2, 'Ana Costa', 'Doutora', NULL, 2);
INSERT INTO Professor VALUES (3, 'Marcos Lima', 'Especialista', NULL, 3);
INSERT INTO Professor VALUES (4, 'Fernanda Rocha', 'Doutora', NULL, 4);
INSERT INTO Professor VALUES (5, 'João Alves', 'Mestre', NULL, 5);
INSERT INTO Professor VALUES (6, 'Paula Mendes', 'Mestre', NULL, 6);
INSERT INTO Professor VALUES (7, 'Luciana Teixeira', 'Doutora', NULL, 7);
INSERT INTO Professor VALUES (8, 'Rafael Souza', 'Especialista', NULL, 8);
INSERT INTO Professor VALUES (9, 'Bruna Martins', 'Doutora', NULL, 9);
INSERT INTO Professor VALUES (10, 'Eduardo Nunes', 'Mestre', NULL, 10);

UPDATE Professor SET Cod_Escola = 101 WHERE Cod_Professor = 1;
UPDATE Professor SET Cod_Escola = 102 WHERE Cod_Professor = 2;
UPDATE Professor SET Cod_Escola = 103 WHERE Cod_Professor = 3;
UPDATE Professor SET Cod_Escola = 104 WHERE Cod_Professor = 4;
UPDATE Professor SET Cod_Escola = 105 WHERE Cod_Professor = 5;
UPDATE Professor SET Cod_Escola = 106 WHERE Cod_Professor = 6;
UPDATE Professor SET Cod_Escola = 107 WHERE Cod_Professor = 7;
UPDATE Professor SET Cod_Escola = 108 WHERE Cod_Professor = 8;
UPDATE Professor SET Cod_Escola = 109 WHERE Cod_Professor = 9;
UPDATE Professor SET Cod_Escola = 110 WHERE Cod_Professor = 10;

INSERT INTO Cargo VALUES (101, 1, 1, 2, 3);
INSERT INTO Cargo VALUES (102, 2, 2, 3, 4);
INSERT INTO Cargo VALUES (103, 3, 3, 4, 5);
INSERT INTO Cargo VALUES (104, 4, 4, 5, 6);
INSERT INTO Cargo VALUES (105, 5, 5, 6, 7);
INSERT INTO Cargo VALUES (106, 6, 6, 7, 8);
INSERT INTO Cargo VALUES (107, 7, 7, 8, 9);
INSERT INTO Cargo VALUES (108, 8, 8, 9, 10);
INSERT INTO Cargo VALUES (109, 9, 9, 10, 1);
INSERT INTO Cargo VALUES (110, 10, 10, 1, 2);
