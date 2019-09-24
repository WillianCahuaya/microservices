FROM wcahuaya/ubuntu-javita
LABEL MAINTAINER Willian Cahuaya <wcahuayaramos@gmail.com>
EXPOSE 8084
ADD onlinesale-msmanagement.jar onlinesale-msmanagement.jar
ENV ip_container=localhost
ENV profiles_active=dev
ENTRYPOINT ["java", "-Dspring.cloud.config.uri=http://${ip_container}:8888/ctxpath-ms-configserver", "-Deureka.client.serviceUrl.defaultZone=http://${ip_container}:8765/ctxpath-ms-discoverserver/eureka/", "-Dspring.profiles.active=${profiles_active}","-jar", "onlinesale-msmanagement.jar"]
