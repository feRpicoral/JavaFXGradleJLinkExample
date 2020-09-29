# JavaFX with JLink and Gradle

Example on how to create a JavaFX application and ship it using Gradle and JLink.

Inspired by this [repo](https://bitbucket.org/FlPe/javafx_jlink_example/src/master/)

## Run the application
```bash
# Windows
gradlew.bat run

# Linux/macOS
./gradlew run
``` 

## Create a distributable zip file

```bash
# Windows
gradlew.bat assemble

# Linux/macOS
./gradlew assemble

# The result is in "build/distributions"
# The application can be run with a batch or a bash file
# A JRE is needed to run the application
``` 

## Create a native application with JLink

The native application created with Jlink will work with the OS that you are currently using:
```bash
# Windows
gradlew.bat jlink

# Linux/macOS
./gradlew jlink

# The result is in "build/image" (the content of the folder is needed to run the application)
# You run the application with "build/image/bin/exe_name.bat" (Windows) or "build/image/bin/exe_name" (Linux/macOS)
# You don't need a JRE to be able to run it
```  

## License

[CC0-1.0](./LICENSE)
