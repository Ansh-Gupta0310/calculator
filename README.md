# Simple Calculator App (Automated with Jenkins & Docker)

A Java CLI Calculator application.

## 🚀 Features
* Addition
* Subtraction
* Automated Testing via Jenkins

## 🛠️ Tech Stack
* **Java 17**
* **Jenkins** (CI/CD)
* **Docker** (Containerization)

## 🏃‍♂️ How to Run
```bash
docker build -t calculator-app .
docker run -it calculator-app
---

### **Step 2: Update Jenkins Pipeline**
Since the filenames changed, the old pipeline will fail. You must update it.

1.  Go to **Jenkins** $\rightarrow$ **ToDo-Pipeline** (or create a new one named `Calculator-Pipeline`).
2.  Click **Configure**.
3.  Replace the script with this one:

```groovy
pipeline {
    agent any

    stages {
        stage('Pull Code') {
            steps {
                // Ensure this URL is correct
                git branch: 'main', url: 'https://github.com/prakrititz/jenkins-assignment'
            }
        }
        
        stage('Build') {
            steps {
                // CHANGED: Compiles Calculator files now
                bat 'javac CalculatorApp.java TestCalculatorApp.java'
            }
        }
        
        stage('Test') {
            steps {
                // CHANGED: Runs Calculator test
                bat 'java TestCalculatorApp'
            }
        }
        
        stage('Create Docker Image') {
            steps {
                // CHANGED: Image name is now 'calculator-app'
                bat 'docker build -t calculator-app .'
            }
        }
    }
}
