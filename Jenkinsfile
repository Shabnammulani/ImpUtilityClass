pipeline {
    agent any

    stages {
        stage('Build & Install Utility') {
            steps {
                echo 'Building and installing ImpUtilityClass...'
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'mvn test'
            }
        }
    }

    post {
        success {
            echo 'ImpUtilityClass built and installed successfully.'
        }
        failure {
            echo 'ImpUtilityClass build failed.'
        }
    }
}
