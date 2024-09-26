pipeline{
    environment{
        DOCKERHUB_CRED = credentials("Docker_Credentials_shouryap1")
    }
    agent any
    stages{
        stage("Stage 1 : Git Clone") {
            steps {
                sh 'git clone https://github.com/shouryap1/Caluclator_SPE_MiniProject.git'
            }
        }



        stage("Stage 2 : Maven Build"){
            steps{
                sh 'mvn clean install'
            }
        }

        stage("Stage 3 : Build Docker Image"){
            steps{
                sh "docker build -t shouryap1/calculator:latest ."
            }
        }

        stage("Stage 4 : Push Docker Image to Dockerhub"){
            steps{
                sh 'echo $DOCKERHUB_CRED_PSW | docker login -u $DOCKERHUB_CRED_USR --password-stdin'
                sh "docker push shouryap1/calculator:latest"
            }
        }

        stage("Stage 5 : Clean Unwanted Docker Images"){
            steps{
                sh "docker container prune -f"
                sh "docker image prune -a -f"
            }
        }

        stage('Stage 6 : Ansible Deployment') {
            steps {
                    sh 'ansible-playbook -i inventory Deploy_Calculator.yml'

             }
        }
    }
}