# Spring Quickstart Guide
A classic “Hello World!” endpoint which any browser can connect to. You can even tell it your name, and it will respond in a more friendly way.

## Requirements ##
A [Java Development Kit(JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) of your choice

## Instructions ##
- Download the entire folder and access it though the terminal or command prompt.
- If on a MAC OS enter: **./mvnw spring-boot:run** in order to launch
- if on a Windows OS enter: **mvnw spring-boot:run** in order to launch

### Warning ###
- If port 8080 is being used application will not work. Run this in the chance you encounter that error
- **lsof -n -i4TCP:8080**
- **kill -9 PID** where PID is the scond field 
