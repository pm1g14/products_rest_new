pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean install'
                bat "docker image build . -t products_rest:${env.BUILD_ID}"
            }
        }
    }
}