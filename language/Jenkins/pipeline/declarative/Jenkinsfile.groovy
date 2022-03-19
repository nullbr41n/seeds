//Example code to copy artifact from another job.
//Example Job id: job_01
//Example step copies facts.json from job_01.

// Uses Declarative syntax to run commands inside a container.
pipeline {
    agent any
    stages {
        stage('Copy Artifact from another job') {
             steps {
                 script {
                    step ([$class: 'CopyArtifact',
                        projectName: 'job_01',
                        filter: "facts.json",
                        target: '.']);
                }
            }
        }
   }
}
