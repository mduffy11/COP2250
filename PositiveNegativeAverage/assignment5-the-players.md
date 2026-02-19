# Assignment 5: The Players — Positive/Negative Analyzer

**COP2250 Java Programming**  
**Kevin Pyatt, Ph.D. | Pyatt Labs**

---

## The Cast

### `while` Loop
Repeats a block of code **while** a condition is true. Checks the condition **before** each iteration.

```java
while (condition) {
    // body
}
```

### Sentinel Value
A special value that signals the end of input. It is **not** processed as data.

```java
// 0 is the sentinel — it ends the loop, not counted as input
while (num != 0) {
    // process num
}
```

### Priming Read
Reading the first input **before** the loop starts. Without this, the loop condition has nothing to check.

```java
int num = input.nextInt();   // priming read
while (num != 0) {
    // process
    num = input.nextInt();   // read again at bottom
}
```

### Counter
A variable that tracks **how many times** something happens.

```java
int positiveCount = 0;
// inside loop:
positiveCount++;   // add 1 each time
```

### Accumulator
A variable that tracks a **running total**.

```java
int total = 0;
// inside loop:
total += num;   // add current value to total
```

### Average Calculation
Total divided by count. **Cast to `double`** to get a decimal result.

```java
double average = (double) total / count;
```

Without the cast: `9 / 4` gives `2` (integer division).  
With the cast: `(double) 9 / 4` gives `2.25`.

### Edge Case Handling
What if the user enters 0 immediately? You'd divide by zero. Always check.

```java
if (count == 0) {
    System.out.println("No numbers were entered.");
} else {
    System.out.println("Average: " + average);
}
```

---

## Key Patterns

| Pattern | Code | Purpose |
|---------|------|---------|
| Priming read | `num = input.nextInt();` before loop | Initialize loop variable |
| Sentinel check | `while (num != 0)` | Stop when sentinel entered |
| Count positives | `if (num > 0) positiveCount++;` | Track positive inputs |
| Count negatives | `if (num < 0) negativeCount++;` | Track negative inputs |
| Accumulate | `total += num;` | Running total |
| Cast for average | `(double) total / count` | Avoid integer division |
| Edge case | `if (count == 0)` | Prevent divide-by-zero |

---

## Common Mistakes

| Mistake | What Happens | Fix |
|---------|-------------|-----|
| No priming read | Loop condition checks uninitialized variable | Read before the loop |
| Forgetting bottom read | Infinite loop — `num` never changes | Read again at end of loop body |
| Processing the sentinel | 0 gets counted/added to total | Loop exits before processing |
| Integer division | `9 / 4` = `2` instead of `2.25` | Cast: `(double) total / count` |
| No edge case check | `ArithmeticException` if no numbers entered | Check `count == 0` before dividing |

---

*This assignment is instructor-authored intellectual property.*
