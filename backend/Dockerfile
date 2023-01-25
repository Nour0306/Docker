# Build the application
FROM openjdk:17-alpine AS build

RUN apk add --update maven
COPY . /usr/src/app
WORKDIR /usr/src/app
RUN mvn clean package -DskipTests

# Create the final image
FROM openjdk:17-alpine
COPY --from=build /usr/src/app/target/*.jar app.jar

ENV CATALINA_OPTS -Dcatalina.http.redirectPort=-1
ENTRYPOINT ["java","-jar","/app.jar"]

#
#CMD ["java", "-Dspring.data.mongodb.uri=mongodb://mongodb:27017/mongoDB"}