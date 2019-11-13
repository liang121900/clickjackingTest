FROM openjdk:8u212-b04-jdk-stretch

MAINTAINER Zhiliang Xie "xie121900@gmail.com"

EXPOSE 8080

WORKDIR /usr/local/bin/

COPY ./target/demo-0.0.1-SNAPSHOT.jar webapp.jar

CMD ["java","-jar","webapp.jar"]