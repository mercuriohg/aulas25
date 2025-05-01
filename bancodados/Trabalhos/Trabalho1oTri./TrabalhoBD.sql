CREATE TABLE Escola (
    CodEscola INT PRIMARY KEY,
    Nome VARCHAR(100),
    Endereco VARCHAR(200)
);

CREATE TABLE Faculdade (
    CodFaculdade INT PRIMARY KEY,
    Nome VARCHAR(100),
    Curso VARCHAR(100)
);

CREATE TABLE Interseries (
    CodInterseries INT PRIMARY KEY,
    Nome VARCHAR(100),
    Turma VARCHAR(50)
);

CREATE TABLE Professor (
    CodProfessor INT PRIMARY KEY,
    Nome VARCHAR(100),
    Celular VARCHAR(20),
    CodFaculdade INT,
    CodEscola INT,
    Coordenador VARCHAR(10),
    Diretor VARCHAR(10),
    FOREIGN KEY (CodFaculdade) REFERENCES Faculdade(CodFaculdade),
    FOREIGN KEY (CodEscola) REFERENCES Escola(CodEscola)
);

CREATE TABLE Estudante (
    CodEstudante INT PRIMARY KEY,
    Nome VARCHAR(100),
    Gmail VARCHAR(100),
    CodEscola INT,
    CodInterseries INT,
    FOREIGN KEY (CodEscola) REFERENCES Escola(CodEscola),
    FOREIGN KEY (CodInterseries) REFERENCES Interseries(CodInterseries)
);


-- Inserções para Escola
INSERT INTO Escola VALUES
(1, 'Escola Alfa', 'Rua das Palmeiras, 123'),
(2, 'Colégio Beta', 'Av. Brasil, 456'),
(3, 'Escola Gama', 'Rua da Paz, 789'),
(4, 'Escola Delta', 'Rua do Sol, 321'),
(5, 'Colégio Épsilon', 'Av. das Nações, 654'),
(6, 'Escola Zeta', 'Rua Independência, 777'),
(7, 'Colégio Eta', 'Av. Liberdade, 888'),
(8, 'Escola Teta', 'Rua das Flores, 111'),
(9, 'Colégio Iota', 'Rua Central, 222'),
(10, 'Escola Kappa', 'Av. Leste, 333');

-- Inserções para Faculdade
INSERT INTO Faculdade VALUES
(3001, 'USP', 'Direito'),
(3002, 'Unicamp', 'Engenharia'),
(3003, 'UFRJ', 'Medicina'),
(3004, 'PUC-SP', 'Psicologia'),
(3005, 'UFPR', 'Física'),
(3006, 'UFSC', 'Arquitetura'),
(3007, 'UFMG', 'Administração'),
(3008, 'UNESP', 'Matemática'),
(3009, 'UNB', 'Geografia'),
(3010, 'PUC-RJ', 'Filosofia');

-- Inserções para Time
INSERT INTO Interseries VALUES
(4001, 'Tigres', '1A'),
(4002, 'Leões', '1B'),
(4003, 'Panteras', '2A'),
(4004, 'Falcões', '2B'),
(4005, 'Lobos', '3A'),
(4006, 'Águias', '3B'),
(4007, 'Cobras', '4A'),
(4008, 'Tubas', '4B'),
(4009, 'Raposas', '5A'),
(4010, 'Jacarés', '5B');

-- Inserções para Professor
INSERT INTO Professor VALUES
(2001, 'Carlos Silva', '11988880001', 3002, 1, 'Sim', 'Não'),
(2002, 'Patrícia Lima', '11988880002', 3002, 1, 'Não', 'Sim'),
(2003, 'Marcos Souza', '11988880003', 3002, 1, 'Sim', 'Sim'),
(2004, 'Fernanda Dias', '11988880004', 3004, 3, 'Não', 'Não'),
(2005, 'Tiago Rocha', '11988880005', 3005, 4, 'Sim', 'Não'),
(2006, 'Luciana Melo', '11988880006', 3005, 4, 'Não', 'Sim'),
(2007, 'José Santos', '11988880007', 3005, 5, 'Sim', 'Sim'),
(2008, 'Paula Ferreira', '11988880008', 3005, 5, 'Não', 'Não'),
(2009, 'Roberto Nunes', '11988880009', 3009, 5, 'Sim', 'Não'),
(2010, 'Larissa Cunha', '11988880010', 3010, 5, 'Sim', 'Sim');

-- Inserções para Estudante
INSERT INTO Estudante VALUES
(1001, 'Ana Lima', 'ana.lima@gmail.com', 1, 4001),
(1002, 'Bruno Souza', 'bruno.souza@gmail.com', 2, 4002),
(1003, 'Carla Silva', 'carla.silva@gmail.com', 3, 4003),
(1004, 'Daniel Rocha', 'daniel.rocha@gmail.com', 4, 4004),
(1005, 'Eduarda Martins', 'eduarda.martins@gmail.com', 5, 4005),
(1006, 'Felipe Almeida', 'felipe.almeida@gmail.com', 6, 4006),
(1007, 'Gabriela Costa', 'gabriela.costa@gmail.com', 7, 4007),
(1008, 'Henrique Santos', 'henrique.santos@gmail.com', 8, 4008),
(1009, 'Isabela Ramos', 'isabela.ramos@gmail.com', 9, 4009),
(1010, 'João Pedro', 'joao.pedro@gmail.com', 10, 4010);
