# bank	multi module maven project
#	bank parent project
#	client-app and server-app as modules for parent project bank
#
# Open windows Dos prompt and goto your source folder.
# Assume you are in d:\maven\bank
#
# step1	- remove all previous built artifacts and build module
#	bank parent project uses gson and log4j2 dependencies.
#	bank-client-app project uses Log4J2 logging framework
#   change logging path and file name in log4j2.xml
#	mvn clean install package
#
# step3 run client module using maven commands
#   goto folder d:\maven\bank\client-app
#	mvn exec:java -Dexec.mainClass=icc.multi.bankclient.Client
#	verify log files in logging folder
#
# step4 server-app module
#	right now this module is empty
#	you can make any code changes and run as in step 3
#