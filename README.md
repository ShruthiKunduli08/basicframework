# basicframework
There are two automation in this framework
1. UI Automation:
   Login to Amazon and search for iphone using Selenium with Java
   Launch Chrome driver and pass the url(ex:amazon.com) to launch the website
   In the search bar send text "iphone" using sendKeys method and click on search button
   We are checking if the first search result contains apple iphone and closing thye chrome driver
2. API Automation:
   Examples for POST, PUT, GET, DELETE methods using 2 users is demonstrated using restassured framework. I have taken the sample API https://reqres.in/


# Prerequisites:
1. Download and install Java 1.8 or 11 [Explain me how, JDK8](https://www.oracle.com/java/technologies/downloads/#java8)
2. Configure Java environment variables [Explain me how](https://confluence.atl/.sian.com/doc/setting-the-java_home-variable-in-windows-8895.html)
3. You'll need an IDE. We suggest downloading and installing IntelliJ IDEA.
4. Configure Maven [Explain me how](https://www.jetbrains.com/help/idea/convert-a-regular-project-into-a-maven-project.html#develop_with_maven)
5.validate the chrome driver and chrome version installed in your system is supported
