FROM openjdk:8
ADD target/irisi3.jar irisi3.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar","/irisi3.jar"]