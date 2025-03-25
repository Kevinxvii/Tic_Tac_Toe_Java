# Tic Tac Toe – Java Console Version

A simple two-player Tic Tac Toe game implemented in Java for the console.

## 🎮 Features

- Two-player mode (`X` and `O`)
- Input validation (no overwriting or out-of-bounds moves)
- Win detection (rows, columns, and diagonals)
- Draw detection
- Clean and simple text-based interface

## 🛠️ How to Run

1. Clone or download this repository.
2. Open the project in your favorite Java IDE or terminal.
3. Compile the code:
   ```bash
   javac App.java
   ```
4. Run the program:
   ```bash
   java App
   ```

## 📋 How to Play

- The game is played on a 3x3 grid.
- Players take turns to enter their move by typing the row and column (0–2) separated by a space.
- Example:
  ```
  Giocatore X, inserisci la riga e la colonna (0-2 separati da spazio):
  1 1
  ```
- The first player to align three of their symbols (horizontally, vertically, or diagonally) wins.
- If the board is full and no one wins, the game ends in a draw.

## 📌 Example Output

```
-----------
|   |   |   | 
-----------
|   |   |   | 
-----------
|   |   |   | 
-----------
Player X, enter row and column (0-2):
1 1
...
Player O wins!
```

## ✅ Requirements

- Java 8 or higher

## 📦 File Structure

```
Tic_Tac_Toe/
└── src/
    └── App.java     # Main game file
```

## 💡 Future Improvements

- Add AI to play against the computer
- Add GUI using Java Swing
- Score tracking between rounds
