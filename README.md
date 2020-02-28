# Geb Groovy Spock LambdaTest Code

![LambdaTest Logo](https://www.lambdatest.com/static/images/logo.svg)

---

### Prerequisites
1. Maven is required to be installed:
   https://maven.apache.org/install.html

### Environment Setup
1. Global Dependencies
    * Install [Java8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
2. Lambdatest Credentials
    * Set LambdaTest username and access key in environment variables. It can be obtained from [LambdaTest dashboard](https://automation.lambdatest.com/)    
    example:
    - For linux/mac
    ```
    export LT_USERNAME="YOUR_USERNAME"
    export LT_ACCESS_KEY="YOUR ACCESS KEY"
    
    ```
    - For Windows
    ```
    set LT_USERNAME="YOUR_USERNAME"
    set LT_ACCESS_KEY="YOUR ACCESS KEY"
    
    ```
3. Setup
       * Clone [Geb-Groovy-Spock-LambdaTest-Code](https://github.com/LambdaTest/lambdatest-geb-groovy-code.git) from GitHub.
       * Navigate to the cloned directory
       * Compile maven dependencies
       ```
       $ mvn compile
       ```
       * You may also want to run the command below to check for outdated dependencies. Please be sure to verify and review updates before editing your pom.xml file. The updated packages may or may not be compatible with your code.
       	```
       	$ mvn versions:display-dependency-updates
       	```

### Important Note:
Some Safari & IE browsers, doesn't support automatic resolution of the URL string "localhost". Therefore if you test on URLs like "http://localhost/" or "http://localhost:8080" etc, you would get an error in these browsers. A possible solution is to use "localhost.lambdatest.com" or replace the string "localhost" with machine IP address. For example if you wanted to test "http://localhost/dashboard" or, and your machine IP is 192.168.2.6 you can instead test on "http://192.168.2.6/dashboard" or "http://localhost.lambdatest.com/dashboard".

### Running Tests

Tests in Parallel:

* Edit the **capabilities.json** file with the capabilities you prefer. Each line needs to be a valid json object and the file needs to end with a newline. As shown below. 
```json
{"build": "GebParallelTest", "platform":  "Windows 8", "browserName": "Mozilla", "version":"65.0"}
{"build": "GebParallelTest", "platform":  "OS X Yosemite", "browserName": "Chrome", "version":"72.0"}
```
Please refer to the [LambdaTest Capability Generator](https://www.lambdatest.com/capabilities-generator/ to set your capabilities.

* Use the command below from the root of the project to run your tests.
```bash
./run.sh
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
