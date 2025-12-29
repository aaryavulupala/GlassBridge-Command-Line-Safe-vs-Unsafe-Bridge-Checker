GlassBridge

A simple Java command-line program that simulates the Squid Game “glass bridge” check.

You provide:
	•	20 booleans describing which tiles are safe (true) or unsafe (false) on a 2-row × 10-column bridge
	•	10 choices (L or R) representing the player’s path across the 10 columns

The program prints:
	•	Safe if every chosen tile is true
	•	Unsafe if any chosen tile is false

How it works
	•	Inputs args[0..19] fill a 2×10 boolean grid:
	•	For each column col (0–9):
	•	args[2*col] → row 0 (Left)
	•	args[2*col+1] → row 1 (Right)
	•	Inputs args[20..29] are the path:
	•	L selects row 0
	•	R selects row 1
	•	The program checks the selected tile in each column and stops early if a tile is unsafe.

Requirements
	•	Java 8+ (works on newer versions too)
