## Count Repeated Elements in Array in Java

How to count repeated elements in an array in Java programming language. If the array is sorted then counting repeated elements in an array will be easy compare to the unsorted array.

#### Example 1 :- An unsorted array
Array = { 50, 20, 10, 40, 20, 10, 10, 60, 30, 70 };

Total Repeated elements: 2

Repeated elements are: 20 10

#### Example 2 :- A sorted array
Array = { 10, 10, 10, 20, 20, 30, 40, 50, 60, 70 };

Total Repeated elements: 2

Repeated elements are: 10 20

The below program is applicable on any array which can be a sorted or an unsorted array. Here we will create a temporary array of similar length, traverse through the original array, and if the repeated element is found then insert it in the temporary array. If the next element is already available in the temporary array then skip it. The procedure to solve this problem,

a) Take an array

b) Create a new temporary array (assuming for the worst case when there are no duplicate elements)

c) Traverse through the original array

d) If the current element is available in the temporary array then skip checking for the current element.

e) Else compare the current element and all next elements.

f) If the match found then insert it into the temporary array, and stop comparing with the next elements.

g) Finally, display total repeated elements.


## Feedback


If you have any feedback, please reach out to me at duttanurag0005@gmail.com


## 🚀 About Me
I am a student of VIT Bhopal, pursuing master's degree in Computer Applications.
I've learned and implemented the concept of Cloud and DEVOPS. currently developing my skills in the field of software development.

A zest for learning and an eagerness to apply that dedication to everything keeps moving forward with my interest.

