Maven Dependency

Maven web application to show Java JARs inclusion or exclusion.
Most of Java open source libraries or JARS are hosted centrally at
https://mvnrepository.com/repos/central.
These JARs are classified based on groupId or artifactId.

To include JARs in your project use maven dependency management features.
Open Windows MS-Dos prompt and goto your source folder.

	Assume you are in d:\maven\web-demo

Step1

Remove all previous built artifacts. package as a WAR file

	mvn clean package install

Step2

Goto d:\maven\web-demo\target folder.
Copy web-demo.war into your local tomcat webapps folder

Step3

Start tomcat using startup.bat and open web application in browser
using

	http://localhost:8080/web-demo/