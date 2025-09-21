pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/your-username/your-repo.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Building...'
                // Example: run build command
                sh './gradlew build'   // for Java/Gradle
                // or npm install / mvn clean install etc.
            }
        }
        stage('Test') {
            steps {
                echo 'Running Tests...'
                sh './gradlew test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                // Add deployment steps (docker, kubernetes, server copy, etc.)
            }
        }
    }
}
