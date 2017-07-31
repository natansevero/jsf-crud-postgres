mvn clean install
docker stop webapp_jsf
docker rm webapp_jsf
docker build -t natan/webapp_jsf .
docker run -p 8081:8080 -d --name webapp_jsf natan/webapp_jsf
