# JDBC Setup

Before we start, we need to connect our Java file to the MySQL database. This requires a connector file. Follow the steps below to set up JDBC (Java Database Connectivity):

## 1. Create a New Java Project
   - Create a new Java project named `app_java_x`.

## 2. Add Connector Jar File
   - Right-click on the project and select "Add Folder".
   - Create a folder named `lib`.
   - Copy and paste the executable JAR file `mysql-connector-j-8.3.0.jar` into the `lib` folder.

## 3. Link the Connector
   - Right-click on the project and select "Properties".
   - Go to `Java Build Path` > `Libraries`.
   - Click on "Add Jars".
   - The project name should be highlighted.
   - Navigate to `app_java_x` > `lib` > `mysql-connector-j-8.3.0.jar`, select it, and click "Apply".
   - Click "OK" and then "Close".

With these steps, you have linked the MySQL connector to your Java project, allowing you to connect to a MySQL database using JDBC.
# Apache Tomcat Setup

Before starting a dynamic web project, we need to set up or install the Apache Tomcat server in Eclipse.

## Setting up Apache Tomcat Server in Eclipse

1. **Download Apache Tomcat:**
   - Go to [Tomcat Downloads](https://tomcat.apache.org/download-90.cgi) and select the Tomcat 9 download.
   - Under the "Core" section, select the .zip (pgp, sha512) file to start the download. (e.g., 11.7MB file).

2. **Extract Tomcat Archive:**
   - Once the file is downloaded, copy the zip file.
   - Create a folder in the C drive, e.g., "tomcat-jan-batch".
   - Paste the zip file into that folder and extract it. 

3. **Setting up in Eclipse:**
   - Open Eclipse.
   - Go to `Window` > `Show View` > `Servers` tab.
   - If no server is available, click to add a new server or use `Ctrl + N` and type "server".
   - In the server tab, click the dropdown of Apache and select "Tomcat v9.0" (select according to the version you have downloaded).

4. **Configure Server Path:**
   - It will ask for the server's path.
   - Click on "Browse" and select the root path for the bin directory, e.g., "C:\tomcat-jan-batch\apache-tomcat-9.0.86".
   - Click "Finish" to complete the setup.

With these steps, you have set up Apache Tomcat server in Eclipse, ready to be used for your dynamic web projects.







# JDBC setup
Before we start we need to connect to the java file to the msql database thats why we need a connecter file i.e. "C:\mysql_jar\mysql-connector-j-8.3.0" 
1. Create a new java project app_java_x,
2. then right click on the project , add a folder "lib" and copy and paste the executable jar "mysql-connector-j-8.3.0.jar "file into the lib folder

still there is no linking to link it to the mysql database

3.right click on project > properties >java buildpath > Libraties > Add jars > 
4. then the project name should be highlighted go to 
app_java_x > lib > mysql-connector-j-8.3.0.jar select it apply > ok > close


# JRE setup
Windows>Preferences>search JRE> select installed JREs> Add> Standard VM > NExt> JRE HOME______(Directory)>select jdk version and folder you require from the path installed
"C:\Program Files\Java\jdk1.8.0_202" >Select folder > Finish > Apply and Close


# Apache tomcat setup 

BEfore Startinng a dynamic web project we need to seup or install the servers of apacahe tomcat server in ecllipse

Windows >Show view > server tab > No server Available click to add new server OR/OR


1.google tomcat download > select tomcat 9 download> in left menu under download section select tomcat 9 > under core select .zip(pgp, sha512)11.7mb file to start download

After the file has downloaded
2.Copy the zip file > create a folder in C drive "tomcat-jan-batch" >paste the zip file in that folder > Click Extract here 


Windows >Show view > server tab > if No server Available click to add new server OR/OR ctrl+N andt type server > In server tab click dropdown of apache > select Tomcat v9.0(select according  to the version that you have downloaded)

Then it will ask for path 
Browse> select root path for bin "C:\tomcat-jan-batch\apache-tomcat-9.0.86" > select finish



How to link a DYnamic web project into JDBC

Copy the "mysql-connector-j-8.3.0.jar"file and past it in the
src > main > webapp > WEB-INF > lib and paste it there


SHOW THE PATH TO APACHE TOMCAT which was tomcat unable to locate of its own
 to tomcat where is the driver class 
for the error"No suitable driver found for jdbc:mysql://localhost:3306/jan_db at java.sql/java.sql.DriverManager.getConnection"

(project)web_app >  Web App Libraries > mysql-connector-jar-j-8.0 > com.mysql.cj.jdbc > Driver.class

			add Class.forName("com.mysql.cj.jdbc.Driver");










| Task              | Instructions                                                                                                                                                            |
|-------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| JDBC setup        | 1. Create a new java project `app_java_x`. <br> 2. Right-click on the project, add a folder named `lib`, and copy `mysql-connector-j-8.3.0.jar` into the `lib` folder. <br> 3. Right-click on the project > Properties > Java Build Path > Libraries > Add Jars > Navigate to `app_java_x` > `lib` > `mysql-connector-j-8.3.0.jar`, select it, and click "Apply" > "OK" > "Close". |
| JRE setup         | 1. Go to Windows > Preferences > Search for "JRE" > Select "Installed JREs" > Add > Standard VM > Next > JRE HOME______(Directory) > Select JDK version and folder you require from the path installed "C:\Program Files\Java\jdk1.8.0_202" > Select folder > Finish > Apply and Close. |
| Apache Tomcat setup | 1. Download Tomcat 9 from the [official website](https://tomcat.apache.org/download-90.cgi)(https://tomcat.apache.org/download-90.cgi). <br> 2. Copy the downloaded zip file into a folder (e.g., "tomcat-jan-batch") in C drive and extract it. <br> 3. In Eclipse, go to Window > Show View > Server tab > Click to add a new server OR use Ctrl+N and type "server" > In the server tab, click the dropdown of Apache > Select Tomcat v9.0 (according to the downloaded version) > Browse and select the root path for bin (e.g., "C:\tomcat-jan-batch\apache-tomcat-9.0.86") > Select "Finish". |
|How to link a DYnamic web project into JDBC | Copy the "mysql-connector-j-8.3.0.jar"file and past it in the path`src > main > webapp > WEB-INF > lib`and paste it there |
|SHOW THE PATH TO APACHE TOMCAT | which was tomcat unable to locate of its own to tomcat where is the driver class for the error `"No suitable driver found for jdbc:mysql://localhost:3306/jan_db at java.sql/java.sql.DriverManager.getConnection"` `(project)web_app >  Web App Libraries > mysql-connector-jar-j-8.0 > com.mysql.cj.jdbc > Driver.class` add Class.forName("com.mysql.cj.jdbc.Driver"); |











