
## How to Reverse a Number in Java


In this section, we will learn how to reverse a number in Java using while loop
, for loop
and recursion.

To reverse a number, follow the steps given below:
1. First, we find the remainder of the given number by using the modulo (%) operator.
2. Multiply the variable reverse by 10 and add the remainder into it.
3. Divide the number by 10.


* How to Reverse a Number in Java : 
1. Reverse a number using while loop
2. Reverse a number using for loop
3. Reverse a number using recursion

Suppose, we want to reverse the number 1234.

In this example, we have taken three variables named number (the number to be reversed), remainder (stores the remainder), reverse (stores the reverse number) initialized 0.

Iteration 1:

number = 1234

remainder = 1234 % 10 = 4

reverse = 0 * 10 + 4 = 0 + 4 = 4

number = 1234 / 10 = 123

Now the value of the number and reverse variable is 123 and 4, respectively.

Iteration 2:

number = 123

remainder = 123 % 10 = 3

reverse = 4 * 10 + 3 = 40 + 3 = 43

number = 123 / 10 = 12

Now the value of the number and reverse variable is 12 and 43, respectively.

Iteration 3:

number = 12

remainder = 12 % 10 = 2

reverse = 43 * 10 + 2 = 430 + 2 = 432

number = 12 / 10 = 1

Now the value of the number and reverse variable is 1 and 432, respectively.

Iteration 4:

number = 1

remainder = 1 % 10 = 1

reverse = 432 * 10 + 1 = 4320 + 1 = 4321

number = 1 / 10 = 0

Now the variable number become 0. Hence, we get the reverse number 4321.
