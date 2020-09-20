# nttdata-finalProject
Final Capstone Project for Wells Training candidates

<h1> Model-View-Controller (MVC) </h1>

It is a pattern used in software engineering to separate the application logic from the user interface. As the name implies, the MVC pattern has three layers.

The Model defines the business layer of the application, the Controller manages the flow of the application, and the View defines the presentation layer of the application.

Although the MVC pattern isn't specific to web applications, it fits very well in this type of applications. In a Java context, the Model consists of simple Java classes, the Controller consists of servlets and the View consists of JSP pages.

<h3> Here're some key features of the pattern: </h3>

It separates the presentation layer from the business layer.
The Controller performs the action of invoking the Model and sending data to View.
The Model is not even aware that it is used by some web application or a desktop application.

<h2>The Business Layer</h2>

This is the data layer which contains business logic of the system, and also represents the state of the application.

It's independent of the presentation layer, the controller fetches the data from the Model layer and sends it to the View layer.

<h2> The Controller Layer </h2>

Controller layer acts as an interface between View and Model. It receives requests from the View layer and processes them, including the necessary validations.

The requests are further sent to Model layer for data processing, and once they are processed, the data is sent back to the Controller and then displayed on the View.

<h2> The View Layer </h2>

This layer represents the output of the application, usually some form of UI. The presentation layer is used to display the Model data fetched by the Controller.

<h2> Prequisites for building and running this project </h2>

1. Java 8 or above installed on your local machine

2. Apache Maven 3.3.3 or above configured

3. Eclipse STS IDE for developing the project

4. Apache tomcat 8 or above for deploying and running the project on your local machine.

<h2> Steps to run this application on your local machine </h2>

1. Fork this repo and setup your origin.

2. Clone the origin repo onto your local.

3. Open Command prompt and navigate to go to the root folder of the project where the parent pom.xml file exists

4. Use the below command to build the application.

    <h4> mvn clean install eclipse:eclipse -Dtomcat=true </h4>
    
    (This command will download all the required dependencies and creates a .war file which includes all the compiled files in this project. )
      
5. Once the build is successful, open Eclipse/STS or any other IDE to import the project. To do this click on 

      File -> import -> Maven -> Existing Maven Project -> Next -> Browse to root folder of the project -> Finish
      
6. Once the import is done, the next step is to add a server. This can be done as below
  
      Go to File -> New -> Other -> Server -> Apache Tomcat 8.0 -> Browse to the location where Apache tomcat is downloaded -> Next -> Finish

7. Once the server is added, open the server.xml file and add the below line at the end of the file just before </Host>
      
      <h4> <Context docBase="add the path here where the Snapshot/war is generated at" path="/"/> </h4>
      
      You can find the snapshot/war file at /../final-project-web/target/final-project-web-0.0.1-SNAPSHOT
      
8. Once the server.xml file is updated, open the logback.xml file under final-project-web module/src/main/resources and edit the line number 3 "LOG_PATH" to a location on your        machine where you want the log files to be generated. After this is done build the project again as mentioned in Step 4.

9. Once this is done start the Server and from the browser go to http://localhost:8080/
