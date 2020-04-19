# web-demo	maven web application
#	Demo for pom.xml usage like
#	adding dependencies and dependency exclusions
#	deploy to tomcat
#
# Open windows Dos prompt and goto your source folder.
# Assume you are in d:\maven\web-demo
#
# step1	- remove all previous built artifacts. package as a WAR
#	mvn clean package install
#
# step2 goto d:\maven\web-demo\target folder
#	copy web-demo.war into your local tomcat webapps folder
#
# step3	start tomcat using startup.bat and open app using
#	http://localhost:8080/web-demo/
#