docker run -d --name jenkins -p 8081:8080 -p 50000:50000 -v jenkins-volume:/var/jenkins_home jenkins/jenkins:lts-jdk8
