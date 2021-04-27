pipeline {
  agent any
  tools {
    maven 'Maven 3.6.3'
  }
    node('app Test'){
        stages {
            stage('Build') {
                steps{
                    sh 'mvn compile -f pom.xml'
                } 
            }

            stage('Test') {
                steps {
                    sh 'mvn test -f pom.xml'
                }
            }
       }
    }
}
