1.	Given the following class, write 3 methods that can be used to return an array that has no duplicates.
3 Methods are as below:
public int[] removeDupUsingForLoop()
public int[] sortAndRemoveDup()
public Set<Integer> removeDupUsingHashSet()
2.	You should define a method signature that you feel is appropriate to the problem.
3.	We would prefer to see three implementations (one that should take into consideration #4 below) and an explanation of what use-cases are suitable to each implementation 
Refer Solution-3 for #4 considerations.
4.	What if we need to retain the original order?
5.	What are the positives and negatives of your solution?
a.	Can you implement it another way so as to avoid the negatives?
Solution-1:
Positive:   Simple traditional way using “for loop”, will work fine for small size of arrays.
Negative: Performance will decrease as the array items increases.

Solution-2:
Positive:  It will be faster than Solution-1 as the number of comparison will decrease due to list is sorted. 
Negative: In case of bigger array items performance will decrease.

Solution-3:
Positive:   Using the collection API will increase the performance. Very minimal coding is required to achieve the desire output. Code optimized nicely. Better solution then Solution-1 and 2. 
6.	Your solution should be testable and “production ready.”
7.	Your solution should be posted to a public github repo that SEI can clone.
https://github.com/sahutejesh/Solution
