**Setup and Configuration**

1.Launch Eclipse
2.Install Cucumber Plugin and Natural Plugin 
3.Set Enviromnetal Variables[Java,Maven]

**Create Maven Project and pom.xml with below dependencies**
  Cucumber.java,Cucumber.html,cucumber.java,cucumber.junit,cucumber.jvm-deps,Selenium.java,Junit,Cucumber.reporting.
  
**Folder Structure**
  ProjectName:TestdemoScript
  Create a folder for Feature.
  Create a Package for Pageobjects
  Create Stepdefinitions Package
  Create a package for Utilities
  Create a package for Testrunner
  Create a Folder for Drivers and copy drivers into Drivers folder.
  
**Adding Four Product to Wishlist**
1.Create Product.Feature in Feature Folder.
2.Create Pageobjectclass AddingProduct.java under Pageobjects Package.
3.Create steps.java under StepDefinitions Package and implements methods.
4.Create Testrunner.java under TestrunnerPackage

**Execution Process**
1.Run TestRunner.java files as Junit Test.
2.Chrome browser will auromatically launched and http://testdemoscrpit.com website opened.
3.It will automatically searches Mobiles,laptop Powerbank and  Ipad one by one.
4.Automatically Select the first one in the list from each one to the Wishlist.
5.In wishlist,it sort by price from low to high.
6.It select the first item in wishlist and it moved to MyCart.
7.Report will be generated in output.html. 

  
  
  
  


