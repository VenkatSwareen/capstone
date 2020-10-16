FROM openjdk:8
EXPOSE 8085
ADD target/docker-capstone.jar docker-capstone.jar
ENTRYPOINT ["java","-jar","docker-capstone.jar"]