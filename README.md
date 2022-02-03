# Geb-Parallel-Sample
![Geb](https://opengraph.githubassets.com/ac541a54277dd7a8c077029799dd7f19363b2b9173847a0a25244af12750c7a0/LambdaTest/geb-parallel-sample-code)

### Prerequisites
1. Install and set environment variable for java.
    * Windows - https://www.oracle.com/java/technologies/downloads/
    * Linux - ```  sudo apt-get install openjdk-8-jre  ```
    * MacOS - Java should already be present on Mac OS X by default.
2 Install and set environment varibale for Maven.
    * Windows - https://maven.apache.org/install.html
    * Linux/ MacOS -  [Homebrew](http://brew.sh/) (Easier)
    ```
     install maven
    ```
    
### Run your First Test
1. Clone the Geb-Parallel-Sample repository. 
```
git clone https://github.com/LambdaTest/geb-parallel-sample-code
```
2. Next get into Geb-Parallel-Sample folder, and import Lamabdatest Credentials. You can get these from lambdatest automation dashboard.
   <p align="center">
   <b>For Linux/macOS:</b>:
 
```
export LT_USERNAME="YOUR_USERNAME"
export LT_ACCESS_KEY="YOUR ACCESS KEY"
```
<p align="center">
   <b>For Windows:</b>

```
set LT_USERNAME="YOUR_USERNAME"
set LT_ACCESS_KEY="YOUR ACCESS KEY"
```
Step 3. Make sure to install the mandatory Selenium dependencies for Maven by running the below command.
```
mvn compile
mvn versions:display-dependency-updates
```

### Run Parallel Test
Use the command below from the root of the project to run your tests.
```
run.sh
mvn -Dlambdageb.capabilities=capabilities clean test
```
It will run the tests in your project with each of the configurations listed concurrently by configuration. i.e. all configurations will run at the same time. 
Individual test outputs will be routed to a log file named after the configuration in the project root folder. 
```bash
==> {"build": "GebParallelTest", "platform":  "OS X Yosemite", "browserName": "Chrome", "version":"72.0"}.log
```

### Advice/Troubleshooting
1. It may be useful to use a Java IDE such as IntelliJ or Eclipse to help troubleshoot potential issues. 

## About LambdaTest
[LambdaTest](https://www.lambdatest.com/) is a cloud based selenium grid infrastructure that can help you run automated cross browser compatibility tests on 2000+ different browser and operating system environments. LambdaTest supports all programming languages and frameworks that are supported with Selenium, and have easy integrations with all popular CI/CD platforms. It's a perfect solution to bring your [selenium automation testing](https://www.lambdatest.com/selenium-automation) to cloud based infrastructure that not only helps you increase your test coverage over multiple desktop and mobile browsers, but also allows you to cut down your test execution time by running tests on parallel.

### Resources

##### [SeleniumHQ Documentation](http://www.seleniumhq.org/docs/)

##### [Groovy Documentation](http://www.groovy-lang.org/documentation.html)

##### [Spock Documentation](http://spockframework.github.io/spock/docs/1.0/index.html)

##### [Geb Documentation](http://www.gebish.org/manual/current/)





