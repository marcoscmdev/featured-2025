As mentioned in the main README of this review exercises repository, all the exercises are free to use for personal and academic purposes.  
You are welcome to use the formulas in your own projects, and you can download the entire project to try it on your computer.  
I encourage you to do so, as most of the exercises have practical or recreational value.  
**Learn and enjoy!**

---

## 🧮 Variables and Operators

### ✅ Exercise 1 – Ideal Weight Calculator

**Instructions:**  
>Design a program to calculate a person’s ideal weight using various formulas:

---

### **Lorentz Formula**
$$
\text{IdealWeight} = A - 100 - \frac{(A - 150)}{4} + \frac{(E - 20)}{K}
$$
- **A** = Height in cm
- **E** = Age in years
- **K** = 4 (for men), 2.5 (for women)

### **Perroult Formula:**
$$
\text{IdealWeight} = A - 100 + \left( \frac{E}{10} \times \frac{9}{10} \right)
$$
- **A** = Height in cm
- **E** = Age in years
### ** Broca Index:**
$$
\text{IdealWeight} = A - 100
$$
- **A** = Height in cm

### **Metropolitan Life Insurance Company Formula:**

$$
\text{IdealWeight} = 50 + 0.75 \times (A - 150)
$$
- **A** = Height in cm

- **A** = Height in cm
_
---

📝 **Reflections:**  
I started this repository with an exercise that covers the foundations of programming: working with **variables** and **operators**.

This exercise was quite a challenge for me at the beginning of the course because it involved using different **mathematical formulas**.  
Math had always been a bit difficult for me, especially after a long time without practicing it.

However, it was also connected to something that deeply interests me: **physical change, sport, and nutrition**. Calculating your ideal weight is a great first step toward those goals.

That’s why I think this is the perfect exercise to:

1. Start enjoying math again  
2. See how math applies to real life

It’s also very useful for learning the **order of operations in Java** and how to use **parentheses** to isolate or prioritize expressions.

To make the exercise more dynamic, I added a **console menu** (even though the instructions didn’t ask for it), so the program asks the user for input via keyboard and shows the results for all the formulas.  
_(I love menus!)_

In the future, I plan to improve this project by adding a simple **graphical interface** to make it more visually appealing and interactive.

---

## 🔁 Loops

### ✅ Exercise 2 – Asterisk Tree

**Instructions:**  
>Create a program that accepts an integer number `n` representing the number of lines to draw.  
>Based on the input, the program displays a growing sequence of asterisks line by line.

📝 **Reflections:**  
This is a classic exercise for practicing loops. I chose it because of its **visual impact** and because I find it **fun, simple, and useful** for building logical thinking.

I remember struggling with this at first. I couldn’t quite grasp the idea of **concatenating strings inside a loop**.  
But after a long afternoon of frustration and trial and error… I finally got it!

I also want to note that my working method **excludes using ChatGPT or Stack Overflow** unless I’ve been stuck for at least **an hour** trying to solve it on my own.

💡 In this version:
- I added a `try-catch` block to handle invalid input  
- I implemented **both** `while` and `for` loops  
- The tree is displayed twice, once with each type of loop

---

### ✅ Exercise 3 – The Secret Number

**Instructions:**  
>This is the classic **Secret Number Game**.  
>The computer selects a random number between 1 and 100.  
>The user enters guesses via the keyboard, and the computer responds:

>> “My number is higher.”  
>> “My number is lower.”

>When the user guesses the number correctly, the program congratulates them and displays the number of attempts.

📝 **Reflections:**  
A simple but **surprisingly fun** exercise.  
I chose it because I love how **something so basic can be so entertaining**.  
_(I love games!)_

In this project:
- I used Java’s **Random class** instead of `Math.random()` (which I prefer)  
- I added an option to **exit the game** anytime  
- And yes... in the future I’ll definitely add a **beautiful graphical interface**!

---

## 🚀 What's Next?

- [ ] Add basic GUI with Java Swing or JavaFX  
- [ ] Refactor input validation into a helper class  
- [ ] Add unit tests with JUnit for the weight calculation methods  
- [ ] Translate the menu to multiple languages (EN/ES)  

---

🎯 **Goal:** Keep improving while enjoying the learning journey.
---
