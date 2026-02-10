# Week 5 Lab: Character Practice

**COP2250 Java Programming**  
**Kevin Pyatt, Ph.D. | Pyatt Labs**

---

## Objective

Learn to work with the `char` data type and Character class methods. This prepares you for Assignment 4 (Vowel or Consonant Checker).

---

## Key Concepts

### Reading a Character

Scanner doesn't have `nextChar()`. Use this pattern:
```java
Scanner input = new Scanner(System.in);
System.out.print("Enter a character: ");
String s = input.nextLine();
char ch = s.charAt(0);  // Get first character
```

### Character Class Methods
```java
Character.isLetter(ch)      // true if a-z or A-Z
Character.isDigit(ch)       // true if 0-9
Character.isUpperCase(ch)   // true if A-Z
Character.isLowerCase(ch)   // true if a-z
Character.toUpperCase(ch)   // converts to uppercase
Character.toLowerCase(ch)   // converts to lowercase
```

### Checking for Vowels
```java
char lower = Character.toLowerCase(ch);
if (lower == 'a' || lower == 'e' || lower == 'i' 
    || lower == 'o' || lower == 'u') {
    // It's a vowel
}
```

---

## Compile and Run
```bash
javac CharacterPractice.java
java CharacterPractice
```

---

## Checklist Before Leaving Lab

- [ ] I can read a character using `nextLine().charAt(0)`
- [ ] I can use `Character.isLetter()` to check for letters
- [ ] I can use `Character.toLowerCase()` to convert case
- [ ] I understand how to check for vowels
- [ ] I'm ready for Assignment 4

---

## Starter Code

**[Download CharacterPractice.java](https://raw.githubusercontent.com/PyattLabs/scf-java-labs/main/labs/week5-characters/CharacterPractice.java)**

Right-click → Save Link As

---

*This lab is instructor-authored intellectual property.*
