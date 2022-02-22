pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {

        stage('Build'){
            
//             bat "${mvnHome}/bin/mvn package
            steps {
                // for prod env
                def mvnhome=tool name: '', type: 'maven'
                 bat " C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2021.3.1\\plugins\\maven\\lib\\maven3\\bin\\mvn  -Dusername=${username} -Dpassword=${password}  clean install -DskipTests"
                // for dev env
                // bat "mvn clean install -DskipTests -P dev"
            }
        }
//         stage('Deploy'){
//             steps {
//                    bat "java -cp C:\Users\Dell\.m2\repository\org\example\java-api\1.0-SNAPSHOT\java-api-1.0-SNAPSHOT.jar com.neplab.UserManagement"
//             }
//         }
    }
}
