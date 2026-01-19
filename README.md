## Rocket Launch Simulator

Java multithreading project using CountDownLatch.

### About Project
This project simulates the launch of multiple rockets using Java threads.
Each rocket runs in a separate thread, performs a countdown, and launches.
The main thread waits until all rockets are launched successfully.

###  Concepts Used
- Thread
- CountDownLatch
- Multithreading
- Thread synchronization

###  How It Works
- Multiple rocket threads are created
- Each rocket prints countdown from 3 to 1
- After launch, it signals the main thread
- Main thread waits for all rockets to finish

### How to Run
javac RocketLaunch.java
java RocketLaunch

### Project Structure
Rocket_Launch/
 └─ src/
    └─ RocketLaunch.java

### Output
Rocket-1 countdown starting...
Rocket-2 countdown starting...
Rocket-3 countdown starting...
Rocket-1 Launched!
Rocket-2 Launched!
Rocket-3 Launched!
All rockets launched successfully!

### 👩‍💻 Author
Sakshi
