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
               println "Checkout Code .."
             }
           }
           stage("Cleaning workspace") {
               steps {
                   println "Cleanig workspace ..."
               }
           }
           stage("Running Testcase") {
              steps {
                   println "Running tescase ..."
               }
           }
           stage("Packing Application") {
               steps {
                   println "Packing app"
               }
           }
       }
   }
}
