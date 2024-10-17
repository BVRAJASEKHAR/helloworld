pipeline {
  agent any
  tools{
    jdk 'java-17'
    maven 'maven-3.9.9'
  }
  stages {
  stage('Stage 1') {
      steps {
        script {
          echo 'Stage 1'
      }
    }
  }
    stage('Build') { 
         steps { 
           bat 'mvn clean package' 
        }
      }
   }
} 
