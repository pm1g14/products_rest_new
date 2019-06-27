FROM tomcat:latest

MAINTAINER Panos Mavrothalassitis "panamavr@hotmail.com"

EXPOSE 8080

WORKDIR /usr/local/tomcat/webapps/

COPY ./target/products_rest-0.0.1.jar webapp.jar

CMD ["catalina.sh", "run"]