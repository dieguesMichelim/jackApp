# jackApp

- Para rodar o projeto, é necessário subir um banco de dados PostgreSQL 
criar um DATABADE com nome bancodados, porta comunicação 5432;
- Para subir o PstgreSQL, pode-se utilizar o docker e subir uma imagem do banco de dados.


Docker:
- docker ps
- docker ps -a
- docker run <nome_da_imagem>
- docker start postbanco

properties
spring_profiles_active=prod
PROD_DB_HOST=containers-us-west-42.railway.app
PROD_DB_PORT=6381
PROD_DB_NAME=railway
PROD_DB_PASSWORD=zcvL7SzRc6iUcIMzKoPK
PROD_DB_USERNAME=root

