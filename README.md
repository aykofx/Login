# 🔐 Java Login System

A simple console-based login system written in Java.  
It allows users to register with a username and password and log in within the same session.  
No database is used — credentials are stored in memory using a `HashMap`.

---

## 📋 Features

- Register new users
- Login with existing credentials
- Prevent duplicate usernames
- In-memory storage using `HashMap<String, String>`
- Runs entirely in the console

---

## 🧠 How It Works

1. User is shown a menu:
   - `1` → Register a new user
   - `2` → Login
   - `3` → Exit the program

2. **Registration**:
   - Prompts for a new username and password.
   - If the username already exists, it rejects the registration.

3. **Login**:
   - Asks for username and password.
   - Compares input against stored credentials in the `HashMap`.

4. **Exiting**:
   - Ends the session and closes the program.

---

## 💻 Example

```
==== Login System ====
1. Register new user
2. Login
3. Exit
```

---

## 📦 Technologies

- Java
- `java.util.HashMap`
- `java.util.Scanner`

---

## 🚀 Getting Started

1. Clone the repository or download the `.java` file.
2. Open it in any Java IDE (e.g., IntelliJ, Eclipse) or use the terminal.
3. Compile the file:

```
javac Main.java
```

4. Run it:

```
java Main
```

---

## 🧾 Notes

- This project does **not** persist data. All information is lost when the program closes.
- For real applications, use password hashing and persistent storage (e.g., database).

---

## 📁 File Structure

```
Main.java       // Contains the entire login logic
README.md       // Project description
```

---
