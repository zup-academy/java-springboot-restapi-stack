# **Java Spring Boot REST API Stack**

A Stack Java Spring Boot REST API, pode ser definida como um conjunto de técnologias Java e Spring que juntas auxiliam na criação de APIs REST. Cada tecnologia que compoem esta Stack é configurada baseada em boas práticas de uso, afim de proporcionar a melhor experiência de desenvolvimento.   

Nas proximas sessões você encontrará em detalhes informações sobre como utilizar Stack Java Spring Boot REST API  para construção de seus projetos. 

Abaixo esta de forma sumariazada cada sessão desta documentação.

1. [Técnologias base da Stack](#técnologias-base-da-stack)
2. [Capacidades Habilitadas ao uso da Stack](#quais-são-as-capacidades-habilitadas)
3. [Beneficio de utilizar a Stack](#quais-os-beneficios-de-utilizar-java-spring-boot-rest-api-stack)
4. [Extenda a capacidade do seu projeto através dos Plugins](#extendendo-capacidades-de-seu-projeto)
    1. [Java Spring Data JPA Plugin](#java-spring-data-jpa-plugin)
    2. [Java Spring Security OAuth2 Resource Server Plugin](#java-spring-security-oauth2-resource-server-plugin)
    3. [Java Spring Open Feign Plugin](#java-spring-open-feing-plugin)
    4. [Java Spring Cache Redis Plugin](#java-spring-cache-redis-plugin)
    5. [Java Spring Kafka Plugin](#java-spring-kafka-plugin)
    6. [Java Spring AWS SQS Plugin](#java-spring-aws-sqs-plugin)
    7. [Java Spring AWS SNS Plugin](#java-spring-aws-sns-plugin)
    8. [Java Spring AWS S3 Plugin](#java-spring-aws-s3-plugin)
    9. [Java Spring AWS DynamoDB Plugin](#java-spring-aws-dynamodb-plugin)
5. [Criando prjetos com Java Spring Boot REST API Stack](#criando-prjetos-com-java-spring-boot-rest-api-stack)


## **Técnologias base da Stack**
Objetivo desta sessão é informar quais são as técnologias que fazem parte da Java Spring Boot REST API Stack.

Ao criar um projeto utilizando Java Spring Boot REST API Stack, seu projeto utilizará Java como linguagem de programação e se beneficiará de toda infra-estrutura do Spring Boot.

### **Composição Técnologica**

A definição desta Stack foi pensada visando todos processos necessários para exposição de uma REST API na Web. Deste a exposição e configuração de um Web Server até em como facilitar o consumo da API por seus clientes.

Entendemos que a qualidade é inegociavel, e olhamos para as técnologias e metodologias como meio para obter a tão desejada qualidade no software. Essa premissa foi o guia para escolha de cada técnologia detalhada abaixo.


- Linguagem de programação
    - Java 17
- Modulo de Desenvolvimento Web
    - Spring MVC
    - Jackson Desserializer
    - Tomcat Web Server
    - Zalando Problem Details
- Validação
    - Bean/Hibernate Validator
- Observabilidade
    - Spring Actuator
- Documentacao
    - Spring Docs OpenAPI
- Testes
    - Spring Test
        - JUNit 4 e 5
        - Hamcrest
        - AssertJ
- Exposição a ambientes clusterizados
    - Docker

## **Quais são as capacidades Habilitadas**

Ao criar seu projeto Java Spring Boot utilizando esta Stack, seu projeto será capaz:

1. Criar Controllers utilizando toda tecnologia Spring Web
2. Aplicar validacoes utilizando Bean Validation
3. Expor retornos de erro padronizados através da especificação HTTP Problem Details.
4. Documentar suas APIs utilizando a especificação OpenAPI
5. Expor APIs para monitoramento de metricas, afim de validar o desempenho e performance do projeto.
6. Construir Suites de Testes robustas, compostas por testes unitarios e integrados.
7. Facilidade ao deploy em ambientes clusterizado através do DockerImage

## **Quais os Beneficios de Utilizar Java Spring Boot REST API Stack**

1. Facilidade na criação do projeto através da StackSpot CLI
2. Decisões de Configuração da  necessárias para Startup da aplicação predefinidas
3. Configurações de exposições de Health Check e metricas para uso em ambientes como Kubernets já definidas.
4. Codigos de exemplo de Criação de Serviços Web (Controllers) baseado em boas praticas.
5. Codigos de exemplo de documentação de Controllers utilizando OpenAPI
6. Configuração para tratamento de problemas HTTP padronizado através da Zalando Problem Details.
7. DockerImage baseado em MultiStage Build afim de criar imagens otimizadas da sua aplicação.
8. Codigos de exemplo para Testes de Integração mostrando como extrair o maximo do Spring Test afim de aumentar a qualidade do seu sistema.
9. Extensão das capacidades através de Plugins


[Assita este video para ver os beneficios de utilizar Java Spring Boot REST API Stack em seu projeto](https://youtu.be/IC1J9VkUiwQ)

## **Extendendo capacidades de seu projeto**

Java Spring Boot REST API Stack oferece uma coleção de **plugins** que auxiliaram a extender a capacidade do seu projeto a lidar com técnologias como: Banco de Dados Relacionais, Apache Kafka, Redis e AWS Services como SQS, SNS, S3 e DynamoDB.



### **Java Spring Data JPA Plugin**

Habilite a capacidade de uso dos RDBMS com JPA/Hibernate configurado para alta performance.

[Veja como Java Spring Data JPA Plugin pode auxiliar a dinamica de uso de RBDMS em seu projeto](https://youtu.be/8u6hdthmgu0)

[Acesse aqui o repositorio oficial do plugin!](https://github.com/zup-academy/java-spring-data-jpa-plugin)

### **Java Spring Security OAuth2 Resource Server Plugin**

Habilidade a capacidade de proteger sua aplicação através do OAuth2, utilizando o Spring Security para habilitar a capacidade do seu servidor trabalhar como um Resourcer Server se conectando a qualquer Authorization Server.

[Veja como Java Spring Security OAuth2 Resource Server Plugin pode auxiliar a dinamica de configuração e uso de segurança em seu projeto](https://youtu.be/hlZUwmPGxh0)

[Acesse aqui o repositorio oficial do plugin!](https://github.com/zup-academy/java-spring-security-oauth2-resourceserver-plugin)

## **Java Spring Open Feign Plugin**

Crie Clients HTTP de forma declarativa, utilizando a API de Mapeamento do Spring Web através do Spring Cloud Open Feign.


[Veja como Java Spring Open Feign Plugin pode auxiliar a dinamica de consumo de Serviços HTTP em seu projeto](https://youtu.be/JhG3LjNhggA)

[Acesse aqui o repositorio oficial do plugin!](https://github.com/zup-academy/java-spring-open-feign-plugin)

## **Java Spring Cache Redis Plugin**

Habilite a capacidade de utilizar o Redis como provedor de Cache distribuido através da API de caching de objetos do Spring Boot.

[Veja como Java Spring Cache Redis Plugin pode auxiliar a dinamica de uso de cache distribuido com redis em seu projeto](https://youtu.be/-2GJR3e4LDs)

[Acesse aqui o repositorio oficial do plugin!](https://github.com/zup-academy/java-spring-cache-redis-plugin)

## **Java Spring Kafka Plugin**

Habilite a capacidade de criar e testar publishers e subscribes através da API Spring for Apache Kafka.

[Veja como Java Spring Kafka Plugin pode auxiliar a dinamica de uso do Apache Kafka em seu projeto](https://youtu.be/Gx2ejA3buEA)

[Acesse aqui o repositorio oficial do plugin!](https://github.com/zup-academy/java-spring-kafka-plugin)


## **Java Spring AWS SQS Plugin**

Habilite a capacidade de criar producers e consumers através das APIs Spring Cloud AWS Messaging junto ao AWS SQS.

[Veja como Java Spring AWS SQS Plugin pode auxiliar a dinamica de uso do Amazon SQS em seu projeto](https://youtu.be/mBLcN2dr6Ys)

[Acesse aqui o repositorio oficial do plugin!](https://github.com/zup-academy/java-spring-aws-sqs-plugin)

## **Java Spring AWS SNS Plugin**

Habilite a capacidade de enviar notificações  APIs Spring Cloud AWS Messaging junto ao AWS SNS 

[Veja como Java Spring AWS SNS Plugin pode auxiliar a dinamica de uso do Amazon SNS em seu projeto](https://github.com/zup-academy/java-spring-aws-sns-plugin)

[Acesse aqui o repositorio oficial do plugin!](https://github.com/zup-academy/java-spring-aws-sns-plugin)

## **Java Spring AWS S3 Plugin**

Habilite a capacidade de utilizar Amazon S3 como Storage através das APIs da Spring Cloud AWS Core junto ao AWS S3

[Veja como Java Spring AWS S3 Plugin pode auxiliar a dinamica de uso do Amazon S3 em seu projeto](https://youtu.be/mIp44nnWVpo)

[Acesse aqui o repositorio oficial do plugin!](https://github.com/zup-academy/java-spring-aws-s3-plugin)

## **Java Spring AWS DynamoDB Plugin**

Habilite a capacidade de utilizar Amazon DynamoDb junto aos beneficios do projeto Spring Data

[Veja como Java Spring AWS DynamoDB Plugin pode auxiliar a dinamica de uso do Amazon DynamoDB em seu projeto](https://youtu.be/azGk4QYM_iQ)


[Acesse aqui o repositorio oficial do plugin!](https://github.com/zup-academy/java-spring-aws-dynamodb-plugin)



## **Criando prjetos com Java Spring Boot REST API Stack**

Para criar seus projetos com todos beneficios da Java Spring Boot REST API Stack é necessário que você tenha a CLI da StackSpot instalada em sua maquina. [Caso você não tenha siga este tutorial para fazer a instalação](https://docs.stackspot.com/docs/stk-cli/installation/).

### 1. Importe a Stack em sua maquina

```sh
stk import stack https://github.com/zup-academy/java-springboot-restapi-stack
```

### 2. Agora verifique se a Stack foi importada com sucesso.

```sh
stk list stack | grep java-springboot
```

### 3. Crie sua aplicação

```sh
stk create app <app_name> -t java-springboot-restapi-stack/default-template
```   

### 4. Importe sua aplicação como um projeto Maven em usa IDE preferida e começe a codificar.

### 5. E para executar sua aplicação, vá ao diretorio do projeto, e utilize o seguinte comando.

```sh
./mvnw spring-boot:run
```



## Suporte

Caso precise de ajuda, por favor abra uma [issue no repositorio do Github da Stack](https://github.com/zup-academy/java-springboot-restapi-stack/issues).