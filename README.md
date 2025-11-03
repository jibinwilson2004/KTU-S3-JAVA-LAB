<<<<<<< HEAD
# KTU-S3-JAVA-LAB
=======
# KTU S3 OOPS Java Lab Programs (S7 CSE Collection)

This repository contains 18 Java programs typically assigned in the KTU OOPS (Object Oriented Programming) lab. Each program is in a separate `.java` file and is ready to compile and run individually.

Keywords: KTU OOPS Lab, KTU Java Lab Programs, S3 OOPS Java, KTU S3 OOPS, Java inheritance, Java polymorphism, Java multithreading, Java file handling, Java Swing, JDBC

## Contents
1. Palindrome check — `Palindrome.java`
2. Character frequency in a string — `CharFrequency.java`
3. Matrix multiplication — `MatrixMultiply.java`
4. Inheritance (Employee/Officer/Manager) — `EmployeeDemo.java`
5. Abstract class and polymorphism (Shape) — `ShapeDemo.java`
6. Garbage Collector demo — `GarbageCollectorDemo.java`
7. File handling with Reader/Writer — `FileReadWriteDemo.java`
8. File read → write with exceptions — `FileCopyWithExceptions.java`
9. StringTokenizer integers + sum — `IntegerTokenizerSum.java`
10. try, catch, throws, finally — `ExceptionFlowDemo.java`
11. Multi-threaded (random, square/cube) — `MultiThreadEvenOddSquaresCubes.java`
12. Thread synchronization — `ThreadSynchronizationDemo.java`
13. Swing Calculator — `SwingCalculator.java`
14. Swing Traffic Light simulator — `TrafficLightSimulator.java`
15. JDBC display all records from a table — `JDBCDisplayAllRecords.java`
16. Doubly linked list (create, delete, display) — `DoublyLinkedListDemo.java`
17. Quick sort names (ascending) — `QuickSortNames.java`
18. Binary search — `BinarySearchDemo.java`

All files include the header comment: `// made by JIBIN WILSON S7 CSE`.

## Prerequisites
- Java JDK 8+ installed (`java -version`)
- For Swing programs (13, 14): run on a system with a GUI.
- For JDBC (15): a reachable database, correct JDBC URL, driver on classpath if required.

## How to Compile and Run
From this directory:

```bash
# Compile
javac FileName.java

# Run
java FileName
```

Examples:

```bash
# 1) Palindrome
javac Palindrome.java && java Palindrome

# 7) Reader/Writer copy
javac FileReadWriteDemo.java && java FileReadWriteDemo input.txt output.txt

# 8) File copy with exceptions
javac FileCopyWithExceptions.java && java FileCopyWithExceptions src.dat dest.dat

# 9) Tokenizer sum (enter integers when prompted)
javac IntegerTokenizerSum.java && java IntegerTokenizerSum

# 13) Swing Calculator (GUI)
javac SwingCalculator.java && java SwingCalculator

# 14) Traffic Light (GUI)
javac TrafficLightSimulator.java && java TrafficLightSimulator

# 15) JDBC display (adjust URL/user/pass/table)
javac JDBCDisplayAllRecords.java && java JDBCDisplayAllRecords "jdbc:your:URL" user pass table_name
```

## Notes
- Program 11 runs three threads for ~10 seconds; adjust as needed.
- Program 12 shows synchronization correctness by matching expected vs actual counter values.
- Program 15 requires valid DB credentials and optionally a JDBC driver (add to classpath if not included with your JDK/DB).

## Suggested Repository Naming and Topics (for visibility)
- Repository name: `ktu-s3-oops-java-lab-programs` (or similar, all lowercase)
- Description: `KTU S3 OOPS Java Lab Programs (18 Programs) — File Handling, OOP, Threads, Swing, JDBC`
- Topics: `ktu`, `ktu-notes`, `ktu-oops`, `java`, `java-lab`, `oop`, `swing`, `jdbc`, `multithreading`, `file-handling`

## Author
All programs include the header comment:

```text
// made by JIBIN WILSON S7 CSE
```

If you use this repository for academic purposes, please credit the author line above in your submissions.

## License
Add a license if you plan to share publicly (e.g., MIT). This helps others reuse your work and improves repo credibility in search.

---
For a searchable landing page (GitHub Pages) with the same content, see `docs/index.md` and enable GitHub Pages in repo settings (details below).

>>>>>>> e74bf62 (KTU S3 OOPS Java Lab: 18 programs + README + docs)
