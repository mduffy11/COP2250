# Lab 06: Loops — Number Analyzer

**COP2250 Java Programming**  
**Kevin Pyatt, Ph.D. | Pyatt Labs**

---

## Objective

Write a program that reads integers from the user until the sentinel value `0` is entered. The program counts how many positive and how many negative values were entered, computes the total, and displays the average (not counting zeros).

---

## Concepts

- `while` loop with sentinel value
- Priming read pattern (read before the loop, read again at end of loop body)
- Counters (`positiveCount`, `negativeCount`)
- Accumulator (`total`)
- Average calculation with edge case handling

---

## Sample Run

```
Enter an integer (0 to quit): 5
Enter an integer (0 to quit): -3
Enter an integer (0 to quit): 8
Enter an integer (0 to quit): -1
Enter an integer (0 to quit): 0
Positive count: 2
Negative count: 2
Total: 9
Average: 2.25
```

## Edge Case

```
Enter an integer (0 to quit): 0
No numbers were entered.
```

---

## Terminal Commands

```bash
cd ~/scf-java-labs/labs/week6-loops
javac NumberAnalyzer.java
java NumberAnalyzer
```

---

## Starter Code

**[Download NumberAnalyzer.java](https://raw.githubusercontent.com/PyattLabs/scf-java-labs/main/labs/week6-loops/NumberAnalyzer.java)**

Right-click → Save Link As

---

## Checklist

- [ ] Program compiles with `javac`
- [ ] Reads integers until 0 is entered
- [ ] Correctly counts positives and negatives
- [ ] Computes total (excluding sentinel)
- [ ] Computes average as floating-point
- [ ] Handles edge case when no numbers entered
- [ ] Clean terminal output matching sample run

---

*This lab is instructor-authored intellectual property.*
