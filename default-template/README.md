## Java and Spring Boot REST API Stack (`java-springboot-restapi-stack`)

Stack for bulding a REST API application with Java and Spring Boot.

The default template of this stack uses those technologies:

- Java +17
- Spring Boot
- Spring Web
- Spring Actuator
- SpringDoc OpenAPI
- Spring Testing and jUnit 5
- Bean Validation

If you need more features you can apply as many plugins as you want.

## How to use

The following steps show how to import the stack and create an application using the java-springboot-restapi stack.

1. First, import the stack:
```sh
stk import stack https://github.com/zup-academy/java-springboot-restapi-stack
```

2. Now, verify if the stack was imported correctly:
```sh
stk list stack | grep java-springboot
```

3. Create your application and answer all the questions:
```sh
stk create app <app_name> -t java-springboot-restapi-stack/default-template
```

4. Execute the application:
```sh
stk create app <app_name> -t java-springboot-restapi-stack/default-template
```

## Support

If you need any help, please open an [issue on Stack's Github repository](https://github.com/zup-academy/java-springboot-restapi-stack/issues). 
