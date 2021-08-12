FROM adoptopenjdk/openjdk11:ubi
ARG JAR_FILE=target/*.jar
ENV BOT_NAME=test.rich1e_javarush_bot
ENV BOT_TOKEN=1801576388:AAFIDW1eqJADtQ-DNaV3G7BtG-qdgxqqerU
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Dbot.username=${BOT_NAME}", "-Dbot.token=${BOT_TOKEN}", "-jar", "/app.jar"]