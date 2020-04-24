Maven core java project

Learn first steps with maven build system using core java maven project.

Open Windows MS-Dos prompt and goto your source folder.

	Assume you are in d:\maven\hello-world


Step1
	
Remove all previous built artifacts like classes, jars ... etc.

	mvn clean

Step2

Maven package compiles, builds and packages project as a JAR file. Install build phase moves one copy of JAR into local maven repository.

	mvn package install


Step3

Run core java project using maven commands.
		
		mvn exec:java -Dexec.mainClass=icc.maven.helloworld.Client

Step4 

Verify JAR file in your local repo

	Goto C:\Users\<windows-userid>\.m2\repository\icc\maven\hello-world\1.0.0
	Check for hello-world-1.0.0.jar file