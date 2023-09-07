# CS441 Assignment 1

Problem 1:
I decided that a nested for loop that goes through the list comparing one element to another would be the solution. This would have a time complexity of O(n)

Problem 2:
The first and last positions of an element in a sorted array was found using a binary search were one kind of binary search found the first position and another the last. This would give a time complexity of O(log n)

Problem 3:
To find the median of two arrays, I used a binary search which searched both arrays at the same time, dividing the searchable ranges in half each time. Since binary searches are run on both of them at the same time the time complexity would be O(log (m + n))

Problem 4:
To find the Nth node from the end of a linked list, I first found the length of the list and used it to find the Nth position from the end. This would give a time complexity of O(n)

Problem 5:
I solved this problem by using a Priority Queue which would sort the elements of the lists given to it and send them out in order of priority. This would give a time complexity of O(kn*log n)
