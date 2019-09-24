FROM wcahuaya/ubuntu-javita
LABEL MAINTAINER Willian Cahuaya <wcahuayaramos@gmail.com>
EXPOSE 8091
ADD onlinesale-msbusquery.jar onlinesale-msbusquery.jar
ENV ip_container=localhost
ENTRYPOINT ["java", "-Deureka.client.serviceUrl.defaultZone=http://${ip_container}:8765/ctxpath-ms-discoverserver/eureka/", "-jar", "onlinesale-msbusquery.jar"]
