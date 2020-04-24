Docsite for Source and Tests

Maven build has many plugins for each use case in industry.
Build documentation by maven for Project Information and Project Reports.
Project Information mostly consists of pom.xml details.
Project Reports show javadoc, provided the code is decorated with javadoc annotations 

Surefire plugin generates junit test results in html format.

Open Windows MS-Dos prompt and goto your source folder.

	Assume you are in d:\maven\doc-site

Step1

Remove all previous built artifacts like classes, jars ... etc.
Compile, package and generate all documents in html site format

	mvn clean install site surefire-report:repot

Step2

Observe junit results on dos console

Step3

Open docs in browser

	goto folder D:\maven\doc-site\target\site
	open index.html in browser.Go through project info and javadoc sections

Step4

View surefire reports 

	Goto folder D:\maven\doc-site\target\site.
	Open surefire-report.html in browser .

