pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'mvn clean install'
      }
    }

    stage('') {
      steps {
        emailext(subject: 'mysql-source build success', body: 'build has been successfully completed', to: 'mithunkhatri@gmail.com')
      }
    }

  }
}