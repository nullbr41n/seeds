/*
Sample snippet to lookup credentials from JenkinsCredentials
*/
import jenkins.*
import jenkins.model.* 
import hudson.*
import hudson.model.*
  

def jenkinsCredentials = com.cloudbees.plugins.credentials.CredentialsProvider.lookupCredentials(
        com.cloudbees.plugins.credentials.Credentials.class,
        Jenkins.instance,
        null,
        null
);


for (creds in jenkinsCredentials) {
      if(creds.id == "my-key-id"){
         authString = "${creds.username}:${creds.password}"
      }
}
