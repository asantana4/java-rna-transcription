# RNA Transcription

A simple Java application that determines and returns the RNA complement (as a String) of a given DNA sequence entered (as a String).

## About the project

This project is based on the “RNA Transcription” exercise from Exercism (Java track). It represents my own implementation of the problem. The exercise can be found here: https://exercism.org/tracks/java/exercises/rna-transcription

The program demonstrates how a DNA strand can be transcribed into its RNA complement by replacing each nucleotide with its corresponding pair.

DNA nucleotides: A, C, G, T
RNA nucleotides: A, C, G, U

Transcription rules:

- G → C

- C → G

- T → A

- A → U

The program applies these rules to generate the RNA sequence from a given DNA string.

## Built with

- Java 17
- IntelliJ IDEA

## Getting started

### Prerequisites

- Java 17 or later

### Getting the project 

1. Clone the repository
2. Or download it as a ZIP

### Running the project

1. Open the project in IntelliJ IDEA or any IDE
2. Locate Main.java
3. Click the Run button

or if you use the terminal:

```bash
javac Main.java
java Main
```

Note: This assumes Main.java is in the project root and uses no packages.

## Usage

The program applies RNA transcription rules to a DNA strand defined in the source code and generates the corresponding RNA strand. It then prints both the original DNA nucleotide sequence and the transcribed RNA nucleotide sequence.



### Example

When the DNA sequence 'CCTAGT' is processed, the program outputs:

```
            DNA strand: CCTAGT
Transcribed RNA strand: GGAUCA
```


## Learning goals

This project is a small Java program created to practice core programming and problem-solving skills. This project focuses on core logic and string manipulation rather than user input or error handling. The project is intended as a learning exercise rather than a production-ready application.


## Feedback

Open to suggestions and improvements.