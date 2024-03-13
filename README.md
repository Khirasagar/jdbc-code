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



JDBC setup
Before we start we need to connect to the java file to the msql database thats why we need a connecter file i.e. "C:\mysql_jar\mysql-connector-j-8.3.0" 
1. Create a new java project app_java_x,
2. then right click on the project , add a folder "lib" and copy and paste the executable jar "mysql-connector-j-8.3.0.jar "file into the lib folder

still there is no linking to link it to the mysql database

3.right click on project > properties >java buildpath > Libraties > Add jars > 
4. then the project name should be highlighted go to 
app_java_x > lib > mysql-connector-j-8.3.0.jar select it apply > ok > close


JRE setup
Windows>Preferences>search JRE> select installed JREs> Add> Standard VM > NExt> JRE HOME______(Directory)>select jdk version and folder you require from the path installed
"C:\Program Files\Java\jdk1.8.0_202" >Select folder > Finish > Apply and Close


Apache tomcat setup 

BEfore Startinng a dynamic web project we need to seup or install the servers of apacahe tomcat server in ecllipse

Windows >Show view > server tab > No server Available click to add new server OR/OR


1.google tomcat download > select tomcat 9 download> in left menu under download section select tomcat 9 > under core select .zip(pgp, sha512)11.7mb file to start download

After the file has downloaded
2.Copy the zip file > create a folder in C drive "tomcat-jan-batch" >paste the zip file in that folder > Click Extract here 


Windows >Show view > server tab > if No server Available click to add new server OR/OR ctrl+N andt type server > In server tab click dropdown of apache > select Tomcat v9.0(select according  to the version that you have downloaded)

Then it will ask for path 
Browse> select root path for bin "C:\tomcat-jan-batch\apache-tomcat-9.0.86" > select finish















