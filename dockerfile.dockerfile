#FROM debian:9

#RUN apt-get update -yq \
#&& apt-get install curl gnupg -yq \
#&& curl -sL https://deb.nodesource.com/setup_10.x | bash \
#&& apt-get install nodejs -yq \
#&& apt-get clean -y

#ADD . /app/
#WORKDIR /app
#RUN npm install

#EXPOSE 2368
#VOLUME /app/logs

#CMD npm run start*
# syntax=docker/dockerfile:1

FROM openjdk:16-alpine3.13

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]
#CMD npm run start
