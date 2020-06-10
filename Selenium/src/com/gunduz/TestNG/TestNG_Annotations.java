package com.gunduz.TestNG;

public class TestNG_Annotations {


    /*

    @BeforeTest: This will be executed before defined test case
    @AfterTest:  This will be executed after defined test case

    @BeforeSuite: This will be executed before suite
    @AfterSuite:  This will be executed after suite

    @BeforeMethod: This will be executed before EVERY methods in the class
    @AfterMethod:  This will be executed after EVERY methods in the class

    @BeforeClass: This will be executed before defined class
    @AfterClass:  This will be executed after defined class

    Groups: To run specific methods in any class;
        After @Test annotation put (groups={"groupName"})
        And then define your groups in xml file

    Ex: @Test (groups= {"SmokeTesting"})
         Method you chose{
         ....
         }


    In xml file: Before the class you want to run

        <groups>
            <run>
                <include name="SmokeTesting"/>
            </run>
        </groups>


        Dependent: To run specific method before another method in same class
        After @Test annotation put  (dependsOnMethods = {"MethodName here"})

        This will be executed given method first then annotated method will be executed

        Ex: @Test(dependsOnMethods = {"WebLoginCarLoan"})
            public void LoginAPICarLoan(){
                System.out.println("Login API Car Loan");
            }

            1. WebLoginCarLoan will be executed
            2. LoginAPICarLoan will be executed



        Enabled:    To skip a method that give constantly error
        After @Test annotation put (enabled=false)

        Ex: @Test(enabled=false)


          TimeOut:   To wait a method that take to much to load before give an error
          After @Test annotation put (TimeOut = time in second)

          Ex:  @Test (TimeOut = 4000)


          Parameters Annotation: @Parameters({"parameters here"})
          TestNG allows the user to pass values to test methods
                as arguments by using parameter annotations through testng.xml file.

            Some times it may be required for us to pass values to test methods
                during run time. Like we can pass user name and password
                through testNG.xml instead of hard coding it in test methods.
                or we can pass browser name as parameter to execute in specific browser.

        Ex: In xml file put these in suite or before test
            <parameter name="URL" value="www.google.com"/>
            <parameter name="APIKey/username" value="123456789"/>

            Then in class:
            Put @Parameters({"URL","APIKey/username"})

            As method parameter:
            @Parameters({"URL","APIKey/username"})
            @Test
            public void secondDemo(String urlName, String key){
                System.out.println("TestNg Second Test");
                System.out.println(urlName);
                System.out.println(key);
            }


        DataProvider Annotation:

        Listeners:
     */





}
