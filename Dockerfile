FROM openjdk:8-alpine

COPY target/uberjar/org-browser.jar /org-browser/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/org-browser/app.jar"]
