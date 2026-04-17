FROM eclipse-temurin:17-jre-alpine
WORKDIR /order
COPY target/order-0.0.1-SNAPSHOT.war order_application.war
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/order_application.war"]
