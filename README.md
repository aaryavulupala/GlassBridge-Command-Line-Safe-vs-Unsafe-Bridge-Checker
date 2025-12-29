# GlassBridge (Java)

A simple Java command-line program that simulates the Squid Game “Glass Bridge” challenge. The program checks whether a chosen left/right path across a 2×10 bridge is safe based on provided boolean tile values.

## Description
The bridge consists of 2 rows and 10 columns. Each tile is either safe (`true`) or unsafe (`false`). The user provides a sequence of left (`L`) and right (`R`) choices. The program determines whether the entire path is safe.

## Requirements
- Java

## Compile
javac GlassBridge.java

## Run
java GlassBridge <20 booleans> <10 L/R chars>

Example:
java GlassBridge true false true false true false true false true false true false true false true false true false true false L L L L L L L L L L

## Input Format
- First 20 inputs: `true` or `false` (case-insensitive)
  - Two values per column (left then right)
- Last 10 inputs: `L` or `R` (case-insensitive)
  - One choice per column

## Game Logic
- `L` selects the left tile (row 0)
- `R` selects the right tile (row 1)
- If all chosen tiles are `true`, the path is safe
- If any chosen tile is `false`, the path is unsafe

## Output
Safe  
or  
Unsafe

## Notes
- Exactly 30 arguments must be provided
- Invalid input formats print a usage message and exit
