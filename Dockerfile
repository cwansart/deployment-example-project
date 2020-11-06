FROM maven AS build
COPY . .
RUN mvn package

FROM jboss/wildfly
COPY --from=build target/deployment-example-project.war /opt/jboss/wildfly/standalone/deployments/
