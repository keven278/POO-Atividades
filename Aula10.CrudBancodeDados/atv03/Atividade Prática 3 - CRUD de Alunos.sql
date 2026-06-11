DROP DATABASE IF EXISTS escola;
CREATE DATABASE escola;
USE escola;

CREATE TABLE alunos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    curso VARCHAR(100),
    nota DECIMAL(4,2)
);
DESCRIBE alunos;
INSERT INTO alunos (nome, curso, nota)
VALUES ('João Silva', 'Engenharia da Computação', 8.5);

INSERT INTO alunos (nome, curso, nota)
VALUES
('Maria Souza', 'Sistemas de Informação', 7.8),
('Pedro Lima', 'Ciência da Computação', 6.5),
('Ana Santos', 'Engenharia de Software', 9.2);

SELECT * FROM alunos;
SELECT nome, curso
FROM alunos;
SELECT *
FROM alunos
WHERE nota >= 7;

SELECT *
FROM alunos
WHERE nome = 'Maria Souza';

UPDATE alunos
SET nota = 8.0
WHERE id = 3;

UPDATE alunos
SET curso = 'Análise e Desenvolvimento de Sistemas'
WHERE nome = 'Ana Santos';

DELETE FROM alunos
WHERE id = 2;
SELECT * FROM alunos;