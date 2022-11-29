# **Java Spring Boot REST API Stack**

The Java Spring Boot REST API Stack can be defined as a set of Java and Spring technologies that together help create REST APIs. Each technology that makes up this Stack is configured based on good usage practices, in order to provide the best development experience.

In the next sections you will find detailed information on how to use Stack Java Spring Boot REST API to build your projects.

Below is a summary of each section of this documentation.


1. [Stack-Base Technologies](#stack-core-technologies)
2. [Stack Enabled Capabilities](#what-are-the-capabilities-enabled)
3. [Benefit of using the Stack](#what-are-the-benefits-of-using-java-spring-boot-rest-api-stack)
4. [Extend your project capabilities through Plugins](#extending-your-project-capabilities)
    1. [Java Spring Data JPA Plugin](#java-spring-data-jpa-plugin)
    2. [Java Spring Security OAuth2 Resource Server Plugin](#java-spring-security-oauth2-resource-server-plugin)
    3. [Java Spring Open Feing Plugin](#java-spring-open-feing-plugin)
    4. [Java Spring Cache Redis Plugin](#java-spring-cache-redis-plugin)
    5. [Java Spring Kafka Plugin](#java-spring-kafka-plugin)
    6. [Java Spring AWS SQS Plugin](#java-spring-aws-sqs-plugin)
    7. [Java Spring AWS SNS Plugin](#java-spring-aws-sns-plugin)
    8. [Java Spring AWS S3 Plugin](#java-spring-aws-s3-plugin)
    9. [Java Spring AWS DynamoDB Plugin](#java-spring-aws-dynamodb-plugin)
5. [Creating projects with Java Spring Boot REST API Stack](#creating-projects-with-java-spring-boot-rest-api-stack)


## **Stack Core Technologies**
The purpose of this session is to inform which technologies are part of the Java Spring Boot REST API Stack.

When creating a project using Java Spring Boot REST API Stack, your project will use Java as a programming language and benefit from the entire Spring Boot infrastructure.

### **Technological Composition**

The definition of this Stack was designed aiming at all the processes necessary for exposing a REST API on the Web. From exposure and configuration of a Web Server to how to facilitate the consumption of the API by your customers.

We understand that quality is non-negotiable, and we look to technologies and methodologies as a means to obtain the much-desired software quality. This premise was the guide for choosing each technology detailed below.


- Programming language
    - Java 17
- Web Development Module
    - Spring MVC
    - Jackson Deserializer
    - Tomcat Web Server
    - Zalando Problem Details
- Validation
    - Bean/Hibernate Validator
- Observability
    - Spring Actuator
- Documentation
    - SpringDocs OpenAPI
- Tests
    - Spring Test
        - JUNit 4 and 5
        - Hamcrest
        - AssertJ
- Exposure to clustered environments
    - Docker

## **What are the capabilities Enabled**

By creating your Java Spring Boot project using this Stack, your project will be able to:

1. Create Controllers using all Spring Web technology
2. Apply validations using Bean Validation
3. Expose standardized error returns through the HTTP Problem Details specification.
4. Document your APIs using the OpenAPI specification
5. Expose APIs for monitoring metrics, in order to validate the performance of the project.
6. Build robust Test Suites, composed of unitary and integrated tests.
7. Ease of deployment in clustered environments through DockerImage

## **What are the benefits of using Java Spring Boot REST API Stack**

1. Easy project creation through StackSpot CLI
2. Predefined Application Startup Needed Configuration Decisions
3. Health Check exposure settings and metrics for use in environments such as Kubernets already defined.
4. Sample Codes for Creating Web Services (Controllers) based on good practices.
5. Controllers documentation example codes using OpenAPI
6. Configuration for standard HTTP problem handling through Zalando Problem Details.
7. DockerImage based on MultiStage Build in order to create optimized images of your application.
8. Sample Codes for Integration Tests showing how to get the most out of Spring Test in order to increase the quality of your system.
9. Extension of capabilities through Plugins


[Watch this video to see the benefits of using Java Spring Boot REST API Stack in your project](https://youtu.be/IC1J9VkUiwQ)

## **Extending capabilities of your project**

Java Spring Boot REST API Stack offers a collection of **plugins** that help you extend your project's ability to handle technologies such as: Relational Database, Apache Kafka, Redis and AWS Services such as SQS, SNS, S3 and DynamoDB.

### **Java Spring Data JPA Plugin**

Enable RDBMS usability with JPA/Hibernate configured for high performance.

[See how Java Spring Data JPA Plugin can help the dynamics of using RBDMS in your project](https://youtu.be/8u6hdthmgu0)

[Access the official plugin repository here!](https://github.com/zup-academy/java-spring-data-jpa-plugin)

### **Java Spring Security OAuth2 Resource Server Plugin**

Ability to secure your application through OAuth2, using Spring Security to enable your server's ability to work as a Resourcer Server by connecting to any Authorization Server.

[See how Java Spring Security OAuth2 Resource Server Plugin can help the dynamic configuration and use of security in your project](https://youtu.be/hlZUwmPGxh0)

[Access the official plugin repository here!](https://github.com/zup-academy/java-spring-security-oauth2-resourceserver-plugin)

## **Java Spring Open Feign Plugin**

Create HTTP Clients declaratively using the Spring Web Mapping API through Spring Cloud Open Feign.


[See how Java Spring Open Feign Plugin can help the dynamic consumption of HTTP Services in your project](https://youtu.be/JhG3LjNhggA)

[Access the official plugin repository here!](https://github.com/zup-academy/java-spring-open-feign-plugin)

## **Java Spring Cache Redis Plugin**

Enable the ability to use Redis as a distributed Cache provider through Spring Boot's Object Caching API.

[See how Java Spring Cache Redis Plugin can help the dynamics of using distributed cache with redis in your project](https://youtu.be/-2GJR3e4LDs)

[Access the official plugin repository here!](https://github.com/zup-academy/java-spring-cache-redis-plugin)

## **Java Spring Kafka Plugin**

Enable the ability to create and test publishers and subscribes through the Spring API for Apache Kafka.

[See how Java Spring Kafka Plugin can help the dynamics of using Apache Kafka in your project](https://youtu.be/Gx2ejA3buEA)

[Access the official plugin repository here!](https://github.com/zup-academy/java-spring-kafka-plugin)


## **Java Spring AWS SQS Plugin**

Enable the ability to create producers and consumers through Spring Cloud AWS Messaging APIs alongside AWS SQS.

[See how Java Spring AWS SQS Plugin can help the dynamics of using Amazon SQS in your project](https://www.youtube.com/watch?v=mBLcN2dr6Ys&list=PLV3Gf3Ojibfw-APcal7p2HgdhVJNCRk0T&index=37)

[Access the official plugin repository here!](https://github.com/zup-academy/java-spring-aws-sqs-plugin)

## **Java Spring AWS SNS Plugin**

Enable the ability to send notifications to Spring Cloud AWS Messaging APIs along with AWS SNS

[See how Java Spring AWS SNS Plugin can help the dynamics of using Amazon SNS in your project](https://github.com/zup-academy/java-spring-aws-sns-plugin)

[Access the official plugin repository here!](https://github.com/zup-academy/java-spring-aws-sns-plugin)

## **Java Spring AWS S3 Plugin**

Enable the ability to use Amazon S3 as Storage through Spring Cloud AWS Core APIs alongside AWS S3

[See how Java Spring AWS S3 Plugin can help the dynamics of using Amazon S3 in your project](https://www.youtube.com/watch?v=mIp44nnWVpo&list=PLV3Gf3Ojibfw-APcal7p2HgdhVJNCRk0T&index=36)

[Access the official plugin repository here!](https://github.com/zup-academy/java-spring-aws-s3-plugin)

## **Java Spring AWS DynamoDB Plugin**

Enable the ability to leverage Amazon DynamoDb along with Spring Data project benefits

[See how Java Spring AWS DynamoDB Plugin can help the dynamics of using Amazon DynamoDB in your project](https://www.youtube.com/watch?v=azGk4QYM_iQ&list=PLV3Gf3Ojibfw-APcal7p2HgdhVJNCRk0T&index=39)


[Access the official plugin repository here!](https://github.com/zup-academy/java-spring-aws-dynamodb-plugin)

## **Creating projects with Java Spring Boot REST API Stack**

To create your projects with all the benefits of the Java Spring Boot REST API Stack you need to have the StackSpot CLI installed on your machine. [If not, follow this tutorial to install](https://docs.stackspot.com/docs/stk-cli/installation/).

### 1. Import the Stack on your machine

```sh
stk import stack https://github.com/zup-academy/java-springboot-restapi-stack
```

### 2. Now check if the Stack was successfully imported.

```sh
stk list stack | grep java-springboot
```

### 3. Create your application

```sh
stk create app <app_name> -t java-springboot-restapi-stack/default-template
```

### 4. Import your application as a Maven project in your preferred IDE and start coding.

### 5. And to run your application, go to the project directory, and use the following command.

```sh
./mvnw spring-boot:run
```



## Support

If you need help, please open an [issue on Stack's Github repository](https://github.com/zup-academy/java-springboot-restapi-stack/issues).