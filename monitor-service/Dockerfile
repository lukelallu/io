FROM openjdk:8
ADD target/monitor.jar /app/monitor.jar
EXPOSE 9093
ENTRYPOINT ["java","-jar","/app/monitor.jar"]