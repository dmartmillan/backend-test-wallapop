# MY SOLUTION

I wanted to make this refactor in a clean and intuitive way, making the code self-explanatory. Also I wanted to make the code in a way that it was easy to 
add new features in the future.

I began identifying that we have two main classes [Rover](./src/main/java/marsrover/Rover.java) (robot) and 
[Mars](./src/main/java/marsrover/Mars.java) (planet). Then, in order to make the code more clear, I separated the interaction that it happens 
between the user and the terminal ([UserInteraction](./src/main/java/marsrover/interaction/UserInteraction.java)). Also, 
building an enum for messages that appear on the terminal ([EnumMessage](./src/main/java/marsrover/interaction/EnumMessage.java))
giving the possibility to add and apply changes easily.

Afterwards I started looking which Design Pattern fits better for the code that we wanted to refactor. 
I realized and studied that the [Command Pattern](./src/main/java/marsrover/command) fits good in order to execute each 
command for the robot, avoiding multiple annoyed _if-else_ cases. On the other hand, I used [State Pattern](./src/main/java/marsrover/direction) 
for direction feature. Making each direction a state of the robot, because in each direction Rover will behave different
depending on the command executed on that moment. Besides, with this pattern we will avoid unnecessary and annoying _if-else_ cases. 

After partly refactored the code, I started to make Test Driven Development to check different functionalities and fix the bugs. 
I didn't have a TDD background, at least in Java, hence I had to study which was the best way to execute these tests. 
I used JUnit and Maven to be able to build and execute them. I tried to test different scenarios and fixing the bad behaviours 
and bugs. In addition, I created another enum to make clearly the meaning of each [error](./src/main/java/marsrover/error)
when it occurs.

At the end of this technical test I implemented and tested the bonus points being able to add some [Obstacles](./src/main/java/marsrover/Obstacle.java) 
into the map.  

I didn't have a huge experience with Java, neither with TDD and neither with Design Patterns. Even so, making an accurate
research I was able to come out with a proper solution. Although, it is not probably as perfect as it could be but I did my best.
I would like to have the opportunity to discuss the approach made with your developers. 

## Environment

- Java SE Development Kit 16.0.1
- IntelliJ IDEA Ultimate Edition 2021.1
- JUnit 4.13
- Apache Maven 3.8.1

## Usage

Can be compiled and executed with an IDE, but if your prefer to executed it in the terminal:

```bash
cd src/main/java/
javac marsrover/*.java
java marsrover.MarsRover
```

In order to execute the test you can use Maven, executing (on the `backend-test-wallapop` folder): 

```bash
mvn clean compile test 
```