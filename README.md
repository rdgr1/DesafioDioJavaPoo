
# Bootcamp Learning Simulation

This Java project simulates a learning experience within a bootcamp, where developers can enroll in courses and mentoring sessions. The project showcases the use of Object-Oriented Programming (OOP) principles like inheritance, encapsulation, and polymorphism. It also implements a basic system to track a developer's progress, completed content, and accumulated experience points (XP).

## Features

- **Courses**: Developers can enroll in multiple courses, each containing a description and a workload (hours).
- **Mentoring Sessions**: Mentoring sessions are provided, each with a specific date and focus on a programming topic.
- **Bootcamp**: Developers can sign up for bootcamps that include courses and mentoring sessions, and track their progress.
- **XP System**: Developers earn XP based on the courses and mentoring sessions they complete.

## Code Overview

### `Main` Class

The `Main` class initializes two courses and one mentoring session. These contents are added to a bootcamp. Two developers (`Rodger` and `Irineu`) sign up for the bootcamp, progress through the content, and their XP is calculated.

### Example Output

```java
----------
Enrolled Contents [Java, JavaScript, Dart Mentoring]
Completed Contents [Java]
XP: 10.0
----------
Enrolled Contents [JavaScript, Dart Mentoring]
Completed Contents [Java]
XP: 10.0
```

## Classes Overview

- **Curso**: Represents a course with a title, description, and duration in hours.
- **Mentoria**: Represents a mentoring session with a specific date, title, and description.
- **Bootcamp**: Contains a list of contents (courses and mentoring sessions) that developers can enroll in.
- **Dev**: Represents a developer who can enroll in a bootcamp, progress through content, and calculate the total XP earned.

## Requirements

- Java 8 or higher

## How to Run

1. Clone the repository.
2. Ensure you have Java installed on your machine.
3. Compile and run the `Main` class to see the simulation in action.

## Example Usage

```bash
javac Main.java
java Main
```

---
