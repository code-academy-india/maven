# java-demo	maven core java project
#	Demo for pom.xml usage like
#	adding properties, dependencies and pass command line args
#	also choose java versions to compile and package
#
# Open windows Dos prompt and goto your source folder.
# Assume you are in d:\maven\java-demo
#
# step1	- remove all previous built artifacts. package as a JAR
#		  install jar into local repo. All steps as args in single step
#
#	mvn clean package install
#		This demo has tests also. You can observe tests output in console.
#		These tests are run during many phases in maven build.
#
# step2 disable tests during build
#	mvn clean package install -DskipTests
#
# step3 run project using maven commands
#	mvn exec:java -Dexec.mainClass=icc.maven.javademo.Client -Dexec.args="database:MySQL5 userid:root password:Admin123"
#