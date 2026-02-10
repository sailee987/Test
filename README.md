The problem of largest number from an array can be found by Brute force technique,which sorts the array in ascending order. 
The largest number is fetched by the element at the last index position. 
But its time complexity is o(nlog(n)).
To optimize it,the first element is stored in a variable,which is compared with every other element inside a loop.
If any element is found to be greater,it is aasigned to the largest variable. It's time complexity reduces to o(n).
