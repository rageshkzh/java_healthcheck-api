# HealthCheck API

Healthcheck API application provide an end point - /healthcheck - to return basic information about the application in JSON format. The retuned JSON object contains the fields: 
  - Applications Version.
  - Description
  - Last Commit SHA.

Travis CI has been integrated with the application. Build is triggered automatically on pushing the code to Github repository.

## Travis CI - Tasks :
Travis CI process perform the following tasks:
 1. Compile the application using <b>Maven</b>
 2. Execute the <b>Junits</b>
 3. <b>Review</b> the code using <b>SonarQuebe</b> and publish the results to <b>Sonar Cloud Dashboard</b>
 4. Calculate the <b>Code coverage</b> using <b>Jacoco</b>and publish the coverage results to Sonar Cloud Dashboard
 5. Containerize the application using <b>Docker</b> and push the image to Dockerhub registry


## Links :
1. <b>Travis dashboard :</b> https://travis-ci.org/rageshk/java_healthcheck-api
2. <b>SonarQuebe Cloud Dashboard :</b> https://sonarcloud.io/organizations/rageshk-github/projects
   (Contains both code coverage and code analysis reports)
3. <b>Docker:</b> https://cloud.docker.com/u/rageshkh/repository/docker/rageshkh/healthcheckapi


## Technology Stack : 
Java, SpringBoot, Travis, Docker, Maven, SonarQuebe and Jacoco

## Pending Task:
The API is designed using Java and SpringBoot. The application information has been hardcoded due to time constraints.
We could have used the library - JGit - to access the last commit sha from Git repository. 

