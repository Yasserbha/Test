FROM tomcat
ADD target/ecrire.jar ecrire.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/ecrire.jar"]