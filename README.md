# API TESTE PRÁTICO TINNOVA #

Api em Spring Boot destinada à resolução das questões propostas no teste prático da Tinnova (Fev. 2021)

## VERSÕES ##
1.0 - Implementação das funcionalidades que competem à todas as 5 questões solicitadas

## EXECUTANDO A APLICAÇÃO ##
1. Acessar a pasta do projeto e executar o comando abaixo para build do pacote:
```
mvn clean install
```

2. Acessar a pasta target e executar o comando abaixo:
```
java -jar tinnova-teste-pratico.jar
```

## SWAGGER ##
http://localhost:8080/tinnova/swagger-ui.html

## SERVIÇOS DISPONIBILIZADOS ##
* Exercicio 1 - Votos em relação ao total de eleitores
	- [x] Percentual dos votos válidos em relação ao total de eleitores http://localhost:8080/tinnova/v1/api/ex1/perc-validos-total-eleitores
	- [x] Percentual dos votos brancos em relação ao total de eleitores http://localhost:8080/tinnova/v1/api/ex1/perc-brancos-total-eleitores
	- [x] Percentual dos votos nulos em relação ao total de eleitores http://localhost:8080/tinnova/v1/api/ex1/perc-nulos-total-eleitores
* Exercicio 2 - Algoritmo de ordenação Bubble Sort
	- [x] Endpoint que retorna o vetor {5, 3, 2, 4, 7, 1, 0, 6} em ordem crescente http://localhost:8080/tinnova/v1/api/ex2/ordenar
* Exercicio 3 - Fatorial
	- [x] Endpoint que retorna o fatorial do número informado via *PathParam* http://localhost:8080/tinnova/v1/api/ex3/calcular-fatorial/{numeroParaFatorar}
* Exercicio 4 - Soma de Multíplos de 3 ou 5
	- [x] Endpoint responsável por retornar a soma dos múltiplos de 3 e 5 de acordo com o número informado via *QueryParam* http://localhost:8080/tinnova/v1/api/ex4/multiplos?numeroParaCalcular=?
* Exercicicio 5 - Cadastro de veículos
	- [x] Endpoint responsável por retornar todos os veículos via GET http://localhost:8080/tinnova/v1/api/ex5/veiculos
	- [x] Endpoint responsável pela busca de um veículo por nome via GET http://localhost:8080/tinnova/v1/api/ex5/veiculos/find/{nomeParaBusca}]
	- [x] Endpoint responsável pela busca de um veículo por ID via GET http://localhost:8080/tinnova/v1/api/ex5/veiculos/{idVeiculo}
	- [x] Endpoint responsável pela criação de um novo veículo via POST com o JSON passando no body da requisição http://localhost:8080/tinnova/v1/api/ex5/veiculos
	- [x] Endpoint responsável pela atualização dos dados do veículo via PUT com o JSON do objeto passado no body da requisição http://localhost:8080/tinnova/v1/api/ex5/veiculos
	- [x] Endpoint responsável pela atualização do veiculo para vendido via PATCH http://localhost:8080/tinnova/v1/api/ex5/veiculos/{idVeiculo}
	- [x] Endpoint responsável pela remoção de um véiculo via DELETE http://localhost:8080/tinnova/v1/api/ex5/veiculos?idVeiculo=?

## TECNOLOGIAS ENVOLVIDAS ##
* Java 11
* Spring Boot 2.4.1
* MariaDB 10.4.17
* Maven

## ESTRUTURA DAS CAMADAS DO PROJETO ##
Este projeto possui a seguinte estrutura:

* Classe principal TestePraticoApplication
* Classes de controle (Controllers)
* Classes de serviço (Services)
* Classes de configuração do swagger (Config)
* Classes de modelo (Models)
* Classes de respositórios (Repositorys)
* Classes de tratamentos de exceção (Exceptions)
* Classes de transferencia de dados DTO (DTO - Data Transfer Object)