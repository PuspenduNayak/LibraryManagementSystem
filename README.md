# Library Management System 📚

A comprehensive, command-line-based Library Management System built in Java. This application provides an efficient solution for managing book collections with features for adding, borrowing, returning, and tracking library inventory through an intuitive CLI interface.

![Java](https://img.shields.io/badge/Java-8+-orange?style=flat&logo=java)
![License](https://img.shields.io/badge/License-MIT-green?style=flat)
![CLI](https://img.shields.io/badge/Interface-Command%20Line-blue?style=flat)
![Status](https://img.shields.io/badge/Status-Active-brightgreen?style=flat)

## 🌟 Features

### Core Functionality
- **📖 Book Management** - Add new books with ISBN, title, and author information
- **📋 Inventory Tracking** - View complete library collection with real-time availability status
- **🔄 Borrowing System** - Seamlessly borrow and return books with status updates
- **🔍 Smart Search** - Quick book lookup using ISBN with HashMap-based efficient retrieval
- **📊 Status Monitoring** - Real-time tracking of book availability (Available/Borrowed)

### User Experience
- **💻 Intuitive CLI** - Clean, menu-driven command-line interface
- **⚡ Fast Performance** - Optimized data structures for quick operations
- **🛡️ Input Validation** - Comprehensive error handling and input validation
- **📝 Detailed Feedback** - Clear success/error messages for all operations

## 🚀 Quick Start

### Prerequisites

Ensure you have the Java Development Kit (JDK) installed on your system:

| Requirement | Minimum Version | Recommended |
|-------------|----------------|-------------|
| **Java JDK** | 8+ | 11 or higher |

#### Verify Installation
```bash
# Check Java Runtime Environment
java -version

# Check Java Compiler
javac -version
```

**Expected Output:**
```
java version "11.0.x" 2023-xx-xx
Java(TM) SE Runtime Environment (build 11.0.x+x)
```

> **📥 Need Java?** Download from [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.org/)

## 💻 Installation & Setup

### Method 1: Clone Repository (Recommended)

```bash
# Clone the repository
git clone https://github.com/YOUR_USERNAME/library-management-system.git
cd library-management-system
```

### Method 2: Manual Download

1. **📁 Create Project Directory**
   ```bash
   mkdir library-management-system
   cd library-management-system
   ```

2. **📄 Download Source Files**
   - `Book.java` - Book model class
   - `Library.java` - Library management logic
   - `Main.java` - Application entry point

## 🏃‍♂️ Running the Application

### Quick Start Commands

```bash
# Navigate to project directory
cd library-management-system

# Compile all Java files
javac *.java

# Run the application
java Main
```

### Alternative: Using Package Structure

```bash
# If using packages, compile with classpath
javac -d . src/*.java

# Run with package name
java -cp . Main
```

## 📱 Usage Guide

### Main Menu Interface

When you run the application, you'll see the following menu:

```
=========================================
    📚 Library Management System 📚
=========================================

Choose an option:
1. 📖 Add New Book
2. 📋 Display All Books
3. 🔄 Borrow Book
4. ↩️  Return Book
5. 🚪 Exit

Enter your choice (1-5): 
```

### Feature Walkthrough

#### 1. Adding a New Book
```
📖 Add New Book
----------------
Enter ISBN: 978-0134685991
Enter Title: Effective Java
Enter Author: Joshua Bloch

✅ Book added successfully!
```

#### 2. Viewing Library Inventory
```
📋 Library Inventory
-------------------
ISBN: 978-0134685991
Title: Effective Java
Author: Joshua Bloch
Status: ✅ Available

ISBN: 978-0321356680
Title: Java: The Complete Reference
Author: Herbert Schildt
Status: ❌ Borrowed
-------------------
Total Books: 2 | Available: 1 | Borrowed: 1
```

#### 3. Borrowing a Book
```
🔄 Borrow Book
--------------
Enter ISBN to borrow: 978-0134685991

✅ Book "Effective Java" has been borrowed successfully!
```

#### 4. Returning a Book
```
↩️ Return Book
--------------
Enter ISBN to return: 978-0134685991

✅ Book "Effective Java" has been returned successfully!
```

## 🏗️ Project Architecture

### Project Structure
```
library-management-system/
├── src/
│   ├── Book.java           # Book model class
│   ├── Library.java        # Library management logic
│   └── Main.java          # Application entry point
├── docs/
│   └── README.md          # This documentation
├── tests/
│   └── LibraryTest.java   # Unit tests (future)
└── .gitignore            # Git ignore rules
```

### Class Overview

#### 📖 `Book.java` - Book Model
```java
public class Book {
    private String isbn;        // Unique identifier
    private String title;       // Book title
    private String author;      // Book author
    private boolean isBorrowed; // Borrowing status
    
    // Constructor, getters, setters, and utility methods
}
```

**Key Features:**
- Encapsulated book properties
- Boolean status tracking
- String representation for display
- Validation methods

#### 📚 `Library.java` - Core Management System
```java
public class Library {
    private HashMap<String, Book> books; // ISBN -> Book mapping
    
    // Core operations
    public void addBook(Book book)
    public boolean borrowBook(String isbn)
    public boolean returnBook(String isbn)
    public void displayAllBooks()
}
```

**Key Features:**
- HashMap for O(1) book lookups
- CRUD operations for book management
- Status validation and updates
- Formatted display methods

#### 🖥️ `Main.java` - User Interface
```java
public class Main {
    private static Library library = new Library();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Menu-driven interface logic
    }
}
```

**Key Features:**
- Interactive CLI menu system
- Input validation and error handling
- User-friendly prompts and feedback
- Clean application lifecycle management

## 🛠️ Technical Details

### Data Structures Used
| Component | Data Structure | Reason |
|-----------|----------------|---------|
| **Book Storage** | `HashMap<String, Book>` | O(1) lookup time by ISBN |
| **User Input** | `Scanner` | Standard input reading |
| **Book Status** | `boolean` | Simple available/borrowed state |

### Algorithms & Complexity
| Operation | Time Complexity | Space Complexity |
|-----------|----------------|------------------|
| **Add Book** | O(1) | O(1) |
| **Find Book** | O(1) | O(1) |
| **Borrow/Return** | O(1) | O(1) |
| **Display All** | O(n) | O(1) |

## 🧪 Testing

### Manual Testing Checklist

- [ ] ✅ Add books with valid ISBN, title, and author
- [ ] ❌ Handle duplicate ISBN entries
- [ ] 🔄 Borrow available books successfully
- [ ] ❌ Prevent borrowing already borrowed books
- [ ] ↩️ Return borrowed books successfully
- [ ] ❌ Handle returning non-existent or available books
- [ ] 📋 Display accurate inventory with correct status
- [ ] 🚪 Exit application cleanly

### Sample Test Data

```java
// Test Books
Book book1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch");
Book book2 = new Book("978-0321356680", "Java: The Complete Reference", "Herbert Schildt");
Book book3 = new Book("978-1617291999", "Java 8 in Action", "Raoul-Gabriel Urma");
```

## 🔧 Configuration

### Customization Options

#### Modify Display Format
Edit the `displayAllBooks()` method in `Library.java`:
```java
System.out.println("📖 " + book.getTitle() + " by " + book.getAuthor());
```

#### Add Data Persistence
Consider implementing file I/O for data persistence:
```java
// Save to file
public void saveToFile(String filename)

// Load from file  
public void loadFromFile(String filename)
```

## 🐛 Troubleshooting

### Common Issues & Solutions

**❌ "javac: command not found"**
- **Solution**: Install JDK and add to system PATH
- **Verify**: Run `echo $JAVA_HOME` (Linux/Mac) or `echo %JAVA_HOME%` (Windows)

**❌ "Could not find or load main class Main"**
- **Solution**: Ensure you're in the correct directory with compiled `.class` files
- **Check**: Verify `Main.class` exists after compilation

**❌ "Exception in thread 'main' java.util.InputMismatchException"**
- **Solution**: Enter valid numeric choices in menu (1-5)
- **Fix**: Improved input validation in future versions

**❌ Books not persisting between runs**
- **Expected Behavior**: Currently stores data in memory only
- **Future Enhancement**: File-based persistence planned

### Debug Mode

Add debug output by modifying the Library class:
```java
private static final boolean DEBUG = true;

private void debug(String message) {
    if (DEBUG) {
        System.out.println("[DEBUG] " + message);
    }
}
```

## 🚧 Roadmap

### Planned Features
- [ ] **💾 Data Persistence** - Save/load library data to/from files
- [ ] **🔍 Advanced Search** - Search by title, author, or keywords
- [ ] **👥 User Management** - Track who borrowed which books
- [ ] **📅 Due Dates** - Add borrowing duration and overdue tracking
- [ ] **📊 Reports** - Generate library statistics and reports
- [ ] **🖥️ GUI Version** - JavaFX-based graphical interface
- [ ] **📱 Web Interface** - Spring Boot web application
- [ ] **🔔 Notifications** - Email reminders for overdue books

### Technical Improvements
- [ ] **🧪 Unit Tests** - Comprehensive JUnit test coverage
- [ ] **📝 Logging** - Implement proper logging with Log4j
- [ ] **⚙️ Configuration** - External configuration file support
- [ ] **🗄️ Database Integration** - MySQL/PostgreSQL support
- [ ] **🔐 Authentication** - User login and role management
- [ ] **📦 Maven/Gradle** - Build tool integration
- [ ] **🐳 Docker Support** - Containerized deployment

## 🤝 Contributing

We welcome contributions! Here's how you can help:

### Getting Started
1. **🍴 Fork** the repository
2. **🌿 Create** a feature branch: `git checkout -b feature/amazing-feature`
3. **📝 Make** your changes with proper comments
4. **✅ Test** your changes thoroughly
5. **📤 Commit** your changes: `git commit -m 'Add amazing feature'`
6. **🚀 Push** to branch: `git push origin feature/amazing-feature`
7. **📬 Submit** a Pull Request with detailed description

### Development Guidelines
- Follow Java naming conventions (camelCase, PascalCase)
- Add comprehensive comments for complex logic
- Ensure backward compatibility
- Update documentation for new features
- Include error handling for edge cases

### Code Style
- **Indentation**: 4 spaces (no tabs)
- **Line Length**: Maximum 120 characters
- **Braces**: Opening brace on same line
- **Comments**: JavaDoc for public methods

## 📄 License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

```
MIT License

Copyright (c) 2025 [Your Name]

Permission is hereby granted, free of charge, to any person obtaining a copy...
```

## 🙏 Acknowledgments

- **☕ Oracle/OpenJDK Community** - For the Java platform
- **📚 Library Science Community** - For inspiring real-world library management
- **💻 Open Source Community** - For feedback and contributions
- **🎓 Educational Resources** - Java tutorials and documentation

## 👤 Author

**Your Name**
- **GitHub**: Puspendu Nayak(https://github.com/PuspenduNayak))

## 📞 Support

Need help? Here are your options:

- **🐛 Bug Reports**: [GitHub Issues](https://github.com/PuspenduNayak/library-management-system/issues)
- **💡 Feature Requests**: [GitHub Discussions](https://github.com/PuspenduNayak/library-management-system/discussions)

## 📊 Project Stats

- **📅 Created**: July 2025
- **📈 Version**: 1.0.0
- **🗣️ Language**: Java
- **📦 Size**: ~15KB source code
- **⭐ Features**: 5 core operations

---

**⭐ If you find this project helpful, please give it a star on GitHub!**

*Built with ❤️ for learning and educational purposes*
