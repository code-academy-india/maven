Multi module project

Sample application to demonstrate maven multi module project feature.
bank is the main project and serves as parent project.Dependecies are added in parent project. These are used in modules.client-app and server-app are two modules under bank parent.

Open Windows MS-Dos prompt and goto your source folder.

	Assume you are in d:\maven\bank

Step1

Remove all previous built artifacts and build module.
bank parent project uses gson and log4j2 dependencies.
bank-client-app project uses Log4J2 logging framework.
Change logging path and file name in log4j2.xml

	mvn clean install package

Step3 

Run client module using maven commands
Goto folder d:\maven\bank\client-app

	mvn exec:java -Dexec.mainClass=icc.multi.bankclient.Client

verify log files in logging folder

Step5

server-app module

Right now this module is empty
You can make any code changes and run as in step 3