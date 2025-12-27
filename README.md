# Console-Based Tic-Tac-Toe Game (Java)

A lightweight, terminal-based implementation of the classic Tic-Tac-Toe game, focusing on clean logic and object-oriented principles in Java.

## 🚀 Key Features
* **Interactive 3x3 Grid:** Real-time rendering of the game board in the console.
* **Winner Detection Logic:** Efficient algorithm to check rows, columns, and diagonals for a win.
* **Input Validation:** Prevents players from selecting occupied slots or entering invalid numbers.
* **Automated Draw Detection:** The engine identifies when no more moves are possible and declares a draw.

## 🛠 Tech Stack
* **Language:** Java (JDK 17+)
* **Logic:** Array manipulation, nested loops for matrix traversal, and input stream handling via `Scanner`.

## 📂 Project Structure
The project is organized into two classes to separate data storage from game logic:
* `TicTacToe.java`: A data container class that stores the game state (the 3x3 board and the current player's turn).
* `App.java`: The core engine of the application, responsible for handling user input, executing game rules, and rendering the board to the console.
