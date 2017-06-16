CREATE DATABASE messengerlive;

use messengerlive;

CREATE TABLE usuario(
	id_usuario BIGINT NOT NULL auto_increment,
	nome VARCHAR(120) NOT NULL,
	foto BLOB NULL,
	email VARCHAR(150) NOT NULL,
	senha CHAR(64) NOT NULL,
	data_nasc DATE NOT NULL,
	telefone VARCHAR(100) NOT NULL,
	estado_civil ENUM('Solteiro(a)','Casado(a)','Viúvo(a)','Divorciado(a)') NOT NULL,
	sexo ENUM('Masculino','Feminino') NOT NULL,
	data_cadastro TIMESTAMP NOT NULL,
	status VARCHAR(7) NOT NULL,
	PRIMARY KEY(id_usuario)
);

CREATE TABLE endereco(
	id_endereco BIGINT NOT NULL auto_increment,
	pais VARCHAR(50) NOT NULL,
	estado CHAR(2) NOT NULL,
	cidade VARCHAR(40) NOT NULL,
	bairro VARCHAR(40) NOT NULL,
	rua VARCHAR(40) NOT NULL,
	cep CHAR(9) NOT NULL,
	usuario BIGINT NOT NULL,
	PRIMARY KEY(id_endereco),
	CONSTRAINT fk_usuario FOREIGN KEY(usuario) REFERENCES usuario(id_usuario)
);

CREATE TABLE mensagem_grupo(
	id_msg_grupo BIGINT NOT NULL auto_increment,
	id_de BIGINT NOT NULL,
	mensagem varchar(255) NOT NULL,
	data_msg TIMESTAMP NOT NULL,
	PRIMARY KEY(id_msg_grupo)
);