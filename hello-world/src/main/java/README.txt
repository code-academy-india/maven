# hello-world	maven core java project
#	core java maven project for maven initial steps in build system
#
# Open windows Dos prompt and goto your source folder.
# Assume you are in d:\maven
#
# step1	- remove all previous built artifacts like classes, jars ... etc
#	mvn clean
#
# step2 - build and deploy in local maven repo
#	mvn package install
#
# step3 run project using maven commands
#	mvn exec:java -Dexec.mainClass=icc.maven.helloworld.Client
#
# step4 verify jar in your local repo
#	goto C:\Users\<windows-userid>\.m2\repository\icc\maven\hello-world\1.0.0
#	check for hello-world-1.0.0.jar file