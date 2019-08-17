FROM jboss/wildfly
ADD target/deployment-example-project.war /opt/jboss/wildfly/standalone/deployments/
