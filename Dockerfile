FROM payara/micro
COPY target/jsf-crud-postgres.war jsf-crud-postgres.war
CMD ["java", "-jar", "payara-micro.jar", "--deploy", "jsf-crud-postgres.war"]