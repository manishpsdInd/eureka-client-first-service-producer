FROM openjdk:11
ADD target C:\Users\manis\OneDrive\Documents\workspace\LoadBalancer\SpringCamelIntegration_I\target\SpringCamelIntegration-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "SpringCamelIntegration-0.0.1-SNAPSHOT.jar"]