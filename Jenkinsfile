pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {

        stage('Build'){
            steps {
                // for prod env
                 bat "mvn -Dusername=${username} -Dpassword=${password}  clean install -DskipTests"
                // for dev env
                // bat "mvn clean install -DskipTests -P dev"
            }
        }
        stage('Deploy'){
            steps {
                   bat "java -cp C:\Users\Dell\.m2\repository\org\example\java-api\1.0-SNAPSHOT\java-api-1.0-SNAPSHOT.jar com.neplab.UserManagement"
            }
        }
    }
}