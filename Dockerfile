FROM eclipse-temurin:17
COPY target/myjava.jar myjava.jar
CMD [ "java","-jar","myjava.jar" ]