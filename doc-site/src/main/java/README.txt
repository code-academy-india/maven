# doc-site	maven site project
#	build documentation by maven for Project Information and Project Reports
#	Project Information mostly consists of pom.xml details
#	Project Reports show javadoc, provided the code is decorated with javadoc annotations 
#	surefire plugin generates junit test results in html format.
#
# Open windows Dos prompt and goto your source folder.
# Assume you are in d:\maven\doc-site
#
# step1	- remove all previous built artifacts like classes, jars ... etc
#		  compile, package and generate all documents in html site format
#	mvn clean install site surefire-report:repot
#
# step2 - observe junit results on dos console	
#
# step3 open doccs in browser
#	goto folder D:\maven\doc-site\target\site
#	open index.html in browser 
#   Go through project info and javadoc sections
#
# step4 view surefire reports 
#	goto folder D:\maven\doc-site\target\site
#	open surefire-report.html in browser 
#