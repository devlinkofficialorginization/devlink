FROM alpine:3.10

MAINTAINER Steven McDonald

EXPOSE 8080

WORKDIR /usr/local/bin/

COPY target/devlink-apigateway-0.0.1-SNAPSHOT.jar webapp.jar

CMD ["java", "-Xmx50m","-jar","webapp.jar"]