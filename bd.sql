CREATE TABLE departamento(
codDepto INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY, 
nome VARCHAR(50) NOT NULL
);

insert into departamento values (null, 'Informatica');
insert into departamento values (null, 'Cama/Mesa/Banho');
insert into departamento values (null, 'Vestuario');
insert into departamento values (null, 'Games');

/* alternativa para inserir dados
insert into departamento(nome) values ('Vestuario')
*/

CREATE TABLE produto(
    codProduto INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY, 
    nome VARCHAR(100) NOT NULL, 
    descricao TEXT, 
    qtdEstoque INTEGER, 
    preco DOUBLE DEFAULT 0.0,
    linkFoto VARCHAR(255),     
    codDepto INTEGER NOT NULL,
    CONSTRAINT fk_departamento FOREIGN KEY (codDepto)
           REFERENCES departamento(codDepto)
);


insert into produto values (null, 'Computador', 
                           'Computador cheio de luzinha',
                           5, 1500.0, 'computador.jpg', 1);
insert into produto values (null, 'Jogo de toalhas', 
                           'Toalhas que raspam e nao secam',
                           15, 25.0, 'toalha.jpg', 2);
insert into produto values (null, 'Camisa de Loja', 
                           'Camisa que fica transparente com o tempo',
                           50, 10.0, 'camisa.jpg', 3);

insert into produto values (null, 'Monitor', 
                           'Monitor que fica parecendo um circo',
                           5, 1000.0, 'monitor.jpg', 1);                           
insert into produto values (null, 'Mouse', 
                           'Mouse que acende luzinha de madrugada so pra encher o saco',
                           20, 100.0, 'mouse.jpg', 1);

insert into produto values (null, 'Travesseiro', 
                           'Travesseiro da nasa ruim pra bune',
                           50, 30.0, 'travesseiro.jpg', 2);
insert into produto values (null, 'God of JAR', 
                           'Jogo Massa!!!',
                           20, 200.0, 'godofjar.jpg', 4);
insert into produto values (null, 'Preisteits', 
                           'Clone do Pleisteichon do SBT',
                           50, 150.0, 'playstates.jpg', 4);                                                                                                            

/* recuperando todos os departamentos e seus respectivos produtos
mesmo que não haja produtos no departamento */
select departamento.nome as 'Departamento',
       produto.nome as 'Produto'
       from departamento left outer join produto 
       on departamento.codDepto = produto.codDepto;

/* recuperando a quantidade de produtos por departamento */
select departamento.nome as 'Departamento',
       produto.nome as 'Produto'
       from departamento left outer join produto 
       on departamento.codDepto = produto.codDepto;

/* recuperar quanto eu tenho de patrimonio em produtos na loja toda */
select sum(qtdEstoque * preco) as "patrimonio"
   from produto;

/* recuperar quanto tem de patrimônio em cada departamento */
select departamento.nome, sum(qtdEstoque * preco)
    from produto inner join departamento 
    on produto.codDepto = departamento.codDepto
    group by departamento.codDepto;

/* o mesmo de cima agora com ordenacao pelo departamento mais valioso */    select departamento.nome, sum(qtdEstoque * preco)
select departamento.nome, sum(qtdEstoque * preco) as 'patrimonio'
    from produto inner join departamento 
    on produto.codDepto = departamento.codDepto
    group by departamento.codDepto
    order by patrimonio desc;

/* o mesmo do anterior, agora dando "apelidos" tb para as tabelas */
select d.nome, sum(p.qtdEstoque * p.preco) as 'patrimonio'
    from produto p inner join departamento d
    on p.codDepto = d.codDepto
    group by d.codDepto
    order by patrimonio desc;

