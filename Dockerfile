From openjdk:8
EXPOSE 8080
ADD /target/BOHORooms-0.0.1-SNAPSHOT.jar.original BOHORooms-0.0.1-SNAPSHOT.jar.original
ENTRYPOINT ["java","-jar","BOHORooms-0.0.1-SNAPSHOT.jar.original"]
