pipeline {
  agent any
  stages {
  stage('Stage 1') {
      steps {
        script {
          echo 'Stage 1'
          echo 'Hello World'
          echo 'Hello World1'
        }
    }
  }
    stage('Build') { 
         steps { 
            sh "mvn clean install" 
        }
      }
}
} 
