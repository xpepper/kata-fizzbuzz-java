# FizzBuzz


# Aufgabe 1

Refactor this code to make it easier to implement new "Buzz-Words".

First, find out which of the SOLID-principles were violated. 
Then refactor the existing code and make sure the program still behaves the same way after your refactoring. 
There's a unit test in place that checks that on a very rudimentary level.

# Aufgabe 2

When you're done refactoring, test the quality of your refactoring by implementing new stuff:

Implement two new "Buzz-Words":

* "Foo"
 - comes always first
 - comes only if the number is a multiple of 6 or 7

* "Bar"
 - comes in between "Fizz" and "Buzz"
 - comes if the number has the digit 3 in it

Evaluate whether or not your refactoring made life easier for you.

Ultimate goal:
For adding yet another "Buzz-Word" no existing code should need to change!
(Except special places like Factories or Construction/Wiring-Methods) 

[![Gitpod ready-to-code](https://img.shields.io/badge/Gitpod-ready--to--code-blue?logo=gitpod)](https://gitpod.io/#https://github.com/modernSE/kata-fizzbuzz-java)

## Machen


- [F] apply Foo also on numbers multiple of 7
- [R] rename tests to convey more info on how the rule works (E.g. `FooComesFirstAndIsOn...`)
- [R] `SumRule` should have a list of rules to sum
- [R] `OrRule` should have a list of rules and apply the first applicable
