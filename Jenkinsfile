def mvn(cmd) {
    configFileProvider(
        [configFile(fileId: 'deployment-settings', variable: 'MAVEN_SETTINGS')]) {
        sh "mvn -s $MAVEN_SETTINGS ${cmd}"
    }
}

pipeline {
    agent any

    tools {
        maven 'maven3.6.1'
    }

    stages {
        stage('Build') {
            steps {
                mvn 'clean compile'
            }
        }

        stage('Test') {
            steps {
                mvn 'test'
            }
        }

        stage('Package') {
            steps {
                mvn 'package'
            }
        }

        stage('Deploy') {
            steps {
                mvn 'deploy'
            }
        }

        stage('Create Docker image') {
            steps {
                echo 'To be done'
            }
        }

        stage('Push Docker image') {
            steps {
                echo 'To be done'
            }
        }
    }
}
