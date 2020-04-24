Maven pom.xml Settings

Core java maven project to showcase pom.xml settings like
properties, dependencies and passing command line arguments.
Choose java version to compile and package project.

Open Windows MS-Dos prompt and goto your source folder.

	Assume you are in d:\maven\java-demo

Step1

	Remove all previous built artifacts.Package as a JAR file. Install jar into local repo.All build steps are passed as mvn command line arguments in single step.
	
		mvn clean package install

This project has sample unit tests also.You can observe tests output in console.These tests are run during many phases in maven build.

Step2 

	Disable tests during build

		mvn clean package install -DskipTests

Step3

	Run project using maven command, three command line args are passed as key:value pairs

		mvn exec:java -Dexec.mainClass=icc.maven.javademo.Client -Dexec.args="database:MySQL5 userid:root password:Admin123"