FROM openjdk:17-oracle
ADD target/sampleproject-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]