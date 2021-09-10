def call(String repoUrl) {
  pipeline {
       agent any
     
       stages {
           stage("Tools initialization") {
               steps {
                   
                   sh "docker --version"
               }
           }
           stage("Checkout Code") {
             steps {
               sh "cloning repo .."
             }
           }
           stage("Cleaning workspace") {
               steps {
                   sh "step"
               }
           }
           stage("Running Testcase") {
              steps {
                   sh "step"
               }
           }
           stage("Packing Application") {
               steps {
                   sh "doing sth..."
               }
           }
       }
   }
}
