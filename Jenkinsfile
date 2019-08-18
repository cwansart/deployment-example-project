def mvn(cmd) {
    configFileProvider(
        [configFile(fileId: 'deployment-settings', variable: 'MAVEN_SETTINGS')]) {
        sh "mvn -s $MAVEN_SETTINGS ${cmd}"
    }
}

def dockerImage

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
                echo 'Created docker image'
                /*script {
                    dockerImage = docker.build("deployment-example-project:${env.BUILD_ID}")
                }*/
            }
        }

        stage('Push Docker image') {
            steps {
                script {
                    echo 'Pushed docker image'
                    /*docker.withRegistry('http://nexus:9999', 'docker-publisher') {
                        dockerImage.push()
                    }*/
                }
            }
        }
    }
}
