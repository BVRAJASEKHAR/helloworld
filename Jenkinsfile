pipeline {
  agent any
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
            bat 'mvn clean install' 
        }
      }
   }
} 
