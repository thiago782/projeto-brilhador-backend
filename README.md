# projeto-brilhador-backend

<p> </p>

<h3> Inicializando o projeto: (Assumindo que tenha docker instalado)</h3>

```
 docker-compose up
```
Nota: Até o momento não existem migrations/seeds no projeto, então o banco deve ser criado manualmente dentro da instância do Postgres

Em um terminal dentro do diretório do projeto, execute:

```
 docker-compose exec -it postgresql /bin/sh
```

Então, já dentro do container execute 
```
 psql -U postgres
```

para acessar o postgres.

Então crie o banco:

```
create database brilhador;
```

e reinicie o docker compose

```
docker-compose down

docker-compose up
```


<h2>Grupos: </h2>
  
  <h3> Relacionamento com o cliente</h3>
   <h5>Vinícius Lojhan Martinez Hernandes - 12855073</h5>
   <h5>Jorge de Oliveira Neto - ???</h5>
   <h5>Lucas Raulin Lunik - ???</h5>
   <h5>Gabriel Marchiorato Oliveira - ???</h5>
   <h5>Douglas Gorges - ???</h5>
   <h5>Igor Mateus Rodrigues de Oliveira - ???</h5>
  
  <h3> Gestão da cadeia de suprimentos</h3>
   <h5>Antonio Eduardo Oliveira - ???</h5>
   <h5> Aluno - RGM </h5>
   <h5> Aluno - RGM </h5>
   <h5> Aluno - RGM </h5>
   <h5> Aluno - RGM </h5>
  
  <h3> Estoque e produção</h3>
   <h5>Lucas Volkmann - ???</h5>
   <h5> Aluno - RGM </h5>
   <h5> Aluno - RGM </h5>
   <h5> Aluno - RGM </h5>
   <h5> Aluno - RGM </h5>
  
  <h3>  Recursos humanos</h3>
   <h5>Pedro Kappes - ???</h5>
   <h5> Aluno - RGM </h5>
   <h5> Aluno - RGM </h5>
   <h5> Aluno - RGM </h5>
   <h5> Aluno - RGM </h5>
  
  <h3> Financeiro, contábil e ativos</h3>
   <h5>Felipe Macchi - ???</h5>
   <h5>Rafael Romig -???</h5>
   <h5> Aluno - RGM </h5>
   <h5> Aluno - RGM </h5>
   <h5> Aluno - RGM </h5>
  
  <h3> Compras e vendas</h3>
   <h5>Lucas Rodrigues Leite - 8813279432</h5> 
   <h5>Vinícius Kruchelski Gugelmin - 8813365614</h5>
   <h5>Garbriel Fernando Cazeque Zanin - 8813372831</h5>
   <h5>Carlos Roberto Pereira Neres Filho - 8813207156</h5>
  
  <h3> Sistemas estratégicos</h3>
   <h5>Rafaela - ???</h5>
   <h5> Aluno - RGM </h5>
   <h5> Aluno - RGM </h5>
   <h5> Aluno - RGM </h5>
   <h5> Aluno - RGM </h5>
