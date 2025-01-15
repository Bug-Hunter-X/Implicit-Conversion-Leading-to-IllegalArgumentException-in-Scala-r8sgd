# Implicit Conversion Bug in Scala

This repository demonstrates an uncommon bug in Scala related to implicit type conversions.  The `MyClass` class has an `age` property with validation to prevent negative values.  However, due to implicit conversions, unexpected behavior can occur if a non-Int value is assigned to `age`.  The solution demonstrates how to mitigate this issue.

## Bug

The original code, `bug.scala`, contains the `MyClass` class with an `age` property and validation to prevent negative age. However, if you try to assign a value that's not an `Int`, the implicit conversions can cause a surprising runtime error.

## Solution

The `bugSolution.scala` file shows a solution to prevent this issue by removing implicit conversions. This makes it explicit and less prone to errors and ensures the type safety of the `age` property. Note that this is not always avoidable. In this case, we avoid using types that could implicitly convert to Int.