# This is the sample project to test the log4jShell issue
## Steps
### For vs code users
- you can simple run the main function in the App.java
- Replace the log msg with the jndi:ldap url from log4shell.huntress.com for both app and dependency
- Before running the app it compile the parent pom
- You can use the env in the launch.json file in the log msg
- For testing the vulnarable version(2.14.1) of log4j is added in the pom, comment and uncomment between fix version
- For each log msg you can see the entry in log4shell.huntress.com
- You can include the vmargs with vulnarable version to test
### For non vs code users
- You can build and run the jar with and without the vmargs and version change to test
- Follow the general steps mentioned above
- Donot forget to replace the log msg with new generated jndi:ldap url from log4shell.huntress.com
