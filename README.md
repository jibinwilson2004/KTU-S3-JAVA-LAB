# KTU S3 OOPS Java Lab Programs (S7 CSE)

This repository contains 18 Java programs typically assigned in the KTU OOPS (Object Oriented Programming) lab. Each program is in a separate `.java` file and can be compiled and run individually.

Keywords: KTU OOPS Lab, KTU Java Lab Programs, S3 OOPS Java, KTU S3 OOPS, Java inheritance, Java polymorphism, Java multithreading, Java file handling, Java Swing, JDBC

## Program List
1. Palindrome check — `Palindrome.java`
2. Character frequency in a string — `CharFrequency.java`
3. Matrix multiplication — `MatrixMultiply.java`
4. Inheritance (Employee/Officer/Manager) — `EmployeeDemo.java`
5. Abstract class and polymorphism (Shape) — `ShapeDemo.java`
6. Garbage Collector demo — `GarbageCollectorDemo.java`
7. File handling with Reader/Writer — `FileReadWriteDemo.java`
8. File copy with exceptions — `FileCopyWithExceptions.java`
9. StringTokenizer integers + sum — `IntegerTokenizerSum.java`
10. try, catch, throws, finally — `ExceptionFlowDemo.java`
11. Multithread: random generator + square/cube — `MultiThreadEvenOddSquaresCubes.java`
12. Thread synchronization — `ThreadSynchronizationDemo.java`
13. Swing Calculator — `SwingCalculator.java`
14. Swing Traffic Light simulator — `TrafficLightSimulator.java`
15. JDBC display all records — `JDBCDisplayAllRecords.java`
16. Doubly linked list (create, delete, display) — `DoublyLinkedListDemo.java`
17. Quick sort names (ascending) — `QuickSortNames.java`
18. Binary search — `BinarySearchDemo.java`

All files include the header comment: `// made by JIBIN WILSON S7 CSE`.

## Prerequisites
- Java JDK 8+ (`java -version`)
- GUI environment for Swing (13, 14)
- JDBC (15): valid DB URL/credentials and JDBC driver on classpath if required

## Compile and Run
From this directory:

```bash
# Compile
javac FileName.java
# Run
java FileName
```

Examples:

```bash
# Palindrome
javac Palindrome.java && java Palindrome

# Reader/Writer copy
javac FileReadWriteDemo.java && java FileReadWriteDemo input.txt output.txt

# File copy with exceptions
javac FileCopyWithExceptions.java && java FileCopyWithExceptions src.dat dest.dat

# Tokenizer sum
javac IntegerTokenizerSum.java && java IntegerTokenizerSum

# Swing Calculator (GUI)
javac SwingCalculator.java && java SwingCalculator

# Traffic Light (GUI)
javac TrafficLightSimulator.java && java TrafficLightSimulator

# JDBC (adjust URL/user/pass/table)
javac JDBCDisplayAllRecords.java && java JDBCDisplayAllRecords "jdbc:your:URL" user pass table_name
```

## Notes
- Program 11 runs its threads for ~10 seconds.
- Program 12 prints expected vs actual counter to show synchronization.
- Program 15 requires valid DB connection details and possibly a JDBC driver jar.

## Project Structure
```
OOPS/
├─ docs/
│  └─ index.md            # GitHub Pages landing page
├─ README.md              # This file
├─ *.java                 # 18 program files
```

## GitHub Pages (for indexing)
If hosted on GitHub, enable: Settings → Pages → Source: Branch `main`, Folder `/docs`. The page will publish from `docs/index.md`.

## Repository Metadata (SEO)
- Description: KTU S3 OOPS Java Lab Programs (18 Programs) — File Handling, OOP, Threads, Swing, JDBC
- Topics: `ktu`, `ktu-notes`, `ktu-oops`, `java`, `java-lab`, `oop`, `swing`, `jdbc`, `multithreading`, `file-handling`

## Author
```text
// made by JIBIN WILSON S7 CSE
```

## License
Consider adding an MIT License to allow reuse.

—
Repo: `https://github.com/jibinwilson2004/KTU-S3-JAVA-LAB`
