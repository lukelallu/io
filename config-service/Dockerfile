FROM openjdk:8
ADD target/config.jar /app/config.jar
EXPOSE 9088
ENTRYPOINT ["java","-jar","/app/config.jar"]