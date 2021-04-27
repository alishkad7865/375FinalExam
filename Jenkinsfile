pipeline {
  agent any
  tools {
    maven 'Maven 3.6.3'
  }
    stages {
        stage('Build') {
            steps{
                sh 'mvn compile -f pom.xml'
            } 
        }
        stage ('Single Tests'){
             sh 'mvn -Dtest=AppTest test'
        }
        stage('Test') {
            steps {
                sh 'mvn test -f pom.xml'
            }
        }
   }
}
