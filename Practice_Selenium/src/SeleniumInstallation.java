public class SeleniumInstallation {

    /*
    Steps to install Selenium:

    1. Configure Java Path in system variables

    (For Windows users)
    A) Find the java - bin directory from program files
    B) Copy the path and go to Control Panel ==> System ==> Advanced System settings
        ==> Environment Variables  ==> Find the Path variable and paste java path there press OK
    C) You need to create new SYSTEM VARIABLE
        Click new and type:    JAVA_HOME
        Paste your java path there press OK

        Ex: C:\Program Files\Java\jdk1.8.0_201      ==> Check your Java version

    D) Find the "Path" variable and select "Edit"
        Select new and Paste your Java bin path (Find Java bin directory)
        Ex: C:\Program Files\Java\jdk1.8.0_201\bin      ==> Check your Java version

    E) Click OK and then OK. (Exit from Advanced System Settings)

    (For Mac Users)
    A)Check the java version (java -version)
    B) type these in Terminal:   vim ~/.bash_profile
        Press i to type anything
    C) Find java path in your system
        Macintosh HD > Library > Java > JavaVirtualMachines > jdk1.8.0_231.jdk > Contents > Home
        Right click and choose "Get Info"
        /Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home
    D) Type : export JAVA_HOME=$(/usr/libexec/java_home)
    E) Save the file and press Esc then type      :wq          to quit from bash_profile
    F) Type    source ~/.bash_profile        to update your bash profile settings
    G) Check your path by typing    echo $JAVA_HOME



    2. Selenium jars download
     A)Go to link: https://www.selenium.dev/downloads/
     B) Find Selenium Server Grid
     C) Choose "Latest stable version 3.141.59" and download it
     D) Save it to new folder (Recommended: Create new folder for each file/driver for selenium )



    3. Configure Selenium jars in project
    A) Open a new project in Intellij IDEA
    B) Click  ==> File > Project Structure > Modules
    C) Click on + button and choose JARS or Directories
    D) Find your Selenium Alpha Folder and choose it.
    E) Click OK (Make sure selected Compile)


    4. Browser drivers download
    A) Go to https://www.selenium.dev/downloads/
    B) Find Browser section and click on it.
    C) Before download webdrivers check your browser version
        Ex: Chrome ==> Click three dots on top right corner and go to "Help" then "About Google Chrome"
    D) Choose the following links for specific browsers
        Chrome: https://sites.google.com/a/chromium.org/chromedriver/
        Firefox: https://firefox-source-docs.mozilla.org/testing/geckodriver/Support.html
        Microsoft Edge: https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/#downloads
        Safari: https://developer.apple.com/documentation/webkit/about_webdriver_for_safari

    E. Download stable version of the Webdrivers (Recommended: Put all driver in a new folder under Selenium folder)

    5.Configure Webdriver for Chrome Browser
    A) Create a new class and Name it ChromeBrowser (or something related with Chrome)
    B) Inside main method:
        Type: System.setProperty(String Key , String Value )
            String key for Chrome Browser: "webdriver.chrome.driver"
            String value for Chrome Browser: " Find your chromedriver path, paste it here "
                NOTE: For each path use double forward slash //   and   chromedriver to the end.
            Ex for Mac users: System.setProperty("webdriver.chrome.driver" , "//Users//ridvangunduz//Documents//Selenium//Webdrivers//chromedriver");
            Ex for Windows users: System.setProperty("webdriver.chrome.driver" , "//Users//ridvangunduz//Documents//Selenium//Webdrivers//chromedriver.exe");

     C) Create Driver object by using WebDriver interface for Chrome Browser
        WebDriver driver = new ChromeDriver();

     */
}
