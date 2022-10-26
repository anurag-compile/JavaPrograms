## GCD of N Numbers in Java

#### Program description:-

Write a Java program to find the GCD of N numbers or more than two numbers. GCD of three or more numbers can be calculated by repeatedly taking the GCD of pairs of numbers.

#### gcd(a, b, c) = gcd(a, gcd(b, c)) = gcd(gcd(a, b), c) = gcd(gcd(a, c), b)

The GCD of N numbers is also calculated by finding the prime factors, the GCD of N numbers is equal to the prime factors common to all the numbers.

#### For an array of numbers, the GCD can be calculated as,

// initialize result with first number in the array

result = arr[0];

// loop

for i = 1 to n-1

result = findHCF(result, arr[i])

#### Procedure to find GCD or HCF of two numbers,

1) Take two numbers

2) Find the largest & smallest number among them

3) Subtract the smallest number value from the largest number

4) Repeat this process until both numbers become equal

#### The GCD or HCF of two numbers in Java can be calculated as,

// Java method to find GCD or HCF of two numbers

public static int findHCF(int num1, int num2) {

while(num1 != num2) {

    if(num1 > num2) 

       num1 = num1 - num2;

    else

       num2 = num2 - num1;

}

return num1;

}
## Feedback

If you have any feedback, please reach out to me at duttanurag0005@gmail.com


## 🚀 About Me
I am a student of VIT Bhopal, pursuing master's degree in Computer Applications.
I've learned and implemented the concept of Cloud and DEVOPS. currently, developing my skills in the field of software development.

A zest for learning and an eagerness to apply that dedication to everything keeps moving forward with my interest.

