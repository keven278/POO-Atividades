DROP DATABASE IF EXISTS pessoasnomeMeuSistema;
CREATE DATABASE nomeMeuSistema;

USE nomeMeuSistema;

CREATE TABLE pessoa (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL
);

