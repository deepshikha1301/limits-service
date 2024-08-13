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
				bat 'echo "Building in progress"'
				bat "mvn clean install -DskipTests"
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
