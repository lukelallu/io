FROM openjdk:8
ADD target/proxy.jar /app/proxy.jar
EXPOSE 9060
ENTRYPOINT ["java","-jar","/app/proxy.jar"]