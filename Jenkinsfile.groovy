pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean install'
                bat "docker image build .dockerfile -t products_rest:${env.BUILD_ID}"
            }
        }
    }
}