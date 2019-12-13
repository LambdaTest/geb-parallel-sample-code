package Spec

import geb.spock.GebSpec
import groovy.json.JsonSlurper
import org.junit.Rule
import org.junit.rules.TestName
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
import spock.lang.Stepwise

class BasePageGebSpec extends GebSpec {
    public String username = System.getenv("LT_USERNAME")
    public String accessKey = System.getenv("LT_ACCESS_KEY")

    /**
     * Represents the browser to be used as part of the test run.
     */
    private String browser
    /**
     * Represents the operating system to be used as part of the test run.
     */
    private String os
    /**
     * Represents the version of the browser to be used as part of the test run.
     */
    private String version
    /**
     * Represents the deviceName of mobile device
     */
    private String deviceName
    /**
     * Represents the device-orientation of mobile device
     */
    private String deviceOrientation
    /**
     * Instance variable which contains the Sauce Job Id.
     */
    private String sessionId

    private static boolean driverCreated

    @Rule
    public TestName name = new TestName() {
        public String getMethodName() {
            return super.getMethodName()
        }
    }

    private isSpecStepwise() {
        this.class.getAnnotation(Stepwise) != null
    }

    /**
    *
    * @return the value of the Sauce Job id.
    */
    public String getSessionId() {
        return sessionId
    }

    public void setupSpec() throws Exception {
        driverCreated = false
    }

    public void setup() throws Exception {
        Map<String, String> capMap
        String capabilityString = System.getProperty("lambdageb.capabilities")


            if (capabilityString) {
                capMap = new JsonSlurper().parseText(capabilityString)
                DesiredCapabilities capabilities = new DesiredCapabilities(capMap)
                String methodName = name.getMethodName()
                String specName = this.class.getSimpleName()
                if(isSpecStepwise()){
                    methodName = "All tests in " + specName
                }
                capabilities.setCapability("name", String.format("%s.%s", specName, methodName))
                capabilities.setCapability("newCommandTimeout", 180)
                driver = new RemoteWebDriver(
                        new URL("https://" + username + ":" + accessKey +
                                "@hub.lambdatest.com/wd/hub"), capabilities)

                this.sessionId = (((RemoteWebDriver) driver).getSessionId()).toString()
            }
            driverCreated = true
    }

    @Override
    public void cleanup() throws Exception {
        if(!isSpecStepwise()){
            driver.quit()
        }
    }
}