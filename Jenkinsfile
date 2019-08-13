pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean build'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Deploy') {
            steps {
                echo 'To be done'
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
