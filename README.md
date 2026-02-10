1. Set largest = arr[0]
2. Loop through the array
3. If arr[i] > largest, update largest
4. Print largest
The above optimal solution's time complexity reduces to o(n) and space complexity to o(1).
However,itcan be solved by Brute force technique,which sorts the array in ascending order. 
The element at the last index position is the largest number. 
But its time complexity is o(nlog(n)) and space complexity is o(1), which is inefficient.
