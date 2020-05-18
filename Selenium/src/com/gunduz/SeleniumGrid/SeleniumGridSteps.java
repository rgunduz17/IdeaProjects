package com.gunduz.SeleniumGrid;

public class SeleniumGridSteps {

    /*
    WHAT IS SELENIUM GRID?
Selenium Grid is a smart proxy server that allows Selenium tests
  to route commands to remote web browser instances.
  Its aim is to provide an easy way to run tests in parallel on multiple machines.

With Selenium Grid, one server acts as the hub that routes JSON formatted test commands
 to one or more registered Grid nodes. Tests contact the hub to obtain access
 to remote browser instances. The hub has a list of registered servers that
 it provides access to, and allows control of these instances.

Selenium Grid allows us to run tests in parallel on multiple machines,
  and to manage different browser versions and browser configurations centrally
  (instead of in each individual test).

Selenium Grid is not a silver bullet. It solves a subset of common delegation
  and distribution problems, but will for example not manage your infrastructure,
  and might not suit your specific needs.
     */

    /*
    Purposes and main functionalities:
            Central entry point for all tests
            Management and control of the nodes / environment where the browsers run
            Scaling
            Running tests in parallel
            Cross platform testing
            Load balancing
     */

    /*
    Hub
Intermediary and manager
Accepts requests to run tests
Takes instructions from client and executes them remotely on the nodes
Manages threads

A Hub is a central point where all your tests are sent.
Each Selenium Grid consists of exactly one hub.
The hub needs to be reachable from the respective clients (i.e. CI server, Developer machine etc.)
The hub will connect one or more nodes that tests will be delegated to.

Nodes
Where the browsers live
Registers itself to the hub and communicates its capabilities
Receives requests from the hub and executes them

Nodes are different Selenium instances that will execute tests on individual computer systems.
There can be many nodes in a grid. The machines which are nodes do not need to be the same platform
or have the same browser selection as that of the hub or the other nodes.
A node on Windows might have the capability of offering Internet Explorer as a browser option,
whereas this wouldn’t be possible on Linux or Mac.
     */

    // Step1: Download Selenium Grid from https://www.selenium.dev/downloads/
    // Step2: Register hub with following code(Type the code to console):
        /*
        java -jar selenium-server-standalone(version here).jar -role hub
         */



    // Step3: Login to another machine and register it as node for Hub
    //        Download the selenium server jar in node machine as well
    // Register node with following code(Type the code to console)
    /*
    java -jar selenium-server-standalone(version here).jar -role webdriver -hub (type IP address here)/grid/register/ -port 5566
     */
    //  Download and java and selenium to node machine


    // Step 4: Register chrome driver to node machine
    /*
    java Dwebdriver.chrome.driver = "(Path of chrome driver)" -jar selenium-server-standalone(version here).jar -role webdriver -hub (type IP address here)/grid/register/ -port 5566
     */


    // http://localhost:4444/grid/console

    // To use in same machine:

    // 1. Open the console and type following code:
    //  java -jar selenium-server-standalone-3.141.59.jar -role hub

    // 2. Open another console tab and type following code:
    //      Chrome
    // java -jar -Dwebdriver.chrome.driver="//Users//ridvangunduz//Desktop//selenium//chromedriver" selenium-server-standalone-3.141.59.jar -role node -hub http://192.168.0.150:4444/grid/register/
    //      Firefox
    // java -jar -Dwebdriver.gecko.driver="//Users//ridvangunduz//Desktop//selenium//geckodriver" selenium-server-standalone-3.141.59.jar -role node -hub http://192.168.0.150:4444/grid/register/
    //      Microsoft Edge
    // java -jar -Dwebdriver.edge.driver="//Users//ridvangunduz//Desktop//selenium//msedgedriver" selenium-server-standalone-3.141.59.jar -role node -hub http://192.168.0.150:4444/grid/register/
    //      Safari
    // java -jar -Dwebdriver.safari.driver="//usr//bin//safaridriver" selenium-server-standalone-3.141.59.jar -role node -hub http://192.168.0.150:4444/grid/register/




}
