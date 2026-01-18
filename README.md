# Inventory-Database
README

This project is a Java console-based store simulation where users can log in,
purchase items, manage their balance, and use owned items.

Classes Overview
----------------

Customer
- Stores a username, account balance, and owned media items
- Allows users to buy items if sufficient funds are available
- Displays owned items and allows users to use them

MediaItem
- Represents an item in the store with a name, price, and sale status
- Applies a discount automatically when an item is on sale
- Can be "used" by the customer

Store
- Holds a list of available media items
- Stores predefined customers with starting balances

Proj03mrauf3 (Main Program)
--------------------------
- Prompts users to log in with a valid username
- Displays a menu to:
  1. Shop for media items
  2. Add funds and view balance
  3. View owned media items
  4. Use owned media items
  5. Log off
- Runs continuously until the user chooses to quit

Key Concepts Used
-----------------
- Object-oriented programming (classes, objects, constructors)
- Arrays for storing customers and items
- Loops and conditionals
- User input handling with Scanner
- Basic menu-driven program structure
