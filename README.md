This is the sample project to test the log4jShell issue

If you are using the vscode you can simple run the main function in the App.java
Replace the log msg with the jndi:ldap url from log4shell.huntress.com
Before running it remove the vmArgs in the launch.json
You can use the env in the launch.json file in the log msg
For testing the vulnarable version(2.14.1) of log4j is added in the pom
You can include the vmargs or update the version to 2.17.0 to see the fix

For non vs code users
You can build and run the jar with and without the vmargs and version change to test