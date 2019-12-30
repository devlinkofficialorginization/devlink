FROM alpine:3.10

MAINTAINER Steven McDonald

ADD target/users-0.0.1-SNAPSHOT.jar webapp.jar

CMD ["java","-Xmx50m","-jar","webapp.jar"]