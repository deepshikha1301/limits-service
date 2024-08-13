pipeline{
	agent any
	environment{
		mavenHome = tool 'jenkins-maven'
	}
	tools{
		jdk 'JAVA-HOME'
	}
	stages{
		stage('Build'){
			steps{
				bat 'echo "Building in progress via webhook1"'
				bat "C:/Users/deeps/apache-maven-3.8.6/bin mvn clean install -DskipTests"
			}
		}
		stage('Test'){
			steps{
				bat "mvn test"
			}
		}
		stage('Deploy'){
			steps{
				bat "mvn jar:jar deploy:deploy"
			}
		}
	}
}
