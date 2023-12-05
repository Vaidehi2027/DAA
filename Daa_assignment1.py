import random
def bubble_sort(arr):
    for i in range(len(arr)-1):
        for j in range(len(arr)-i-1):
            if arr[j] > arr[j+1]:
                arr[j] , arr[j+1] = arr[j+1] , arr[j]

def binary_search(arr,number):
    low = 0
    high = len(arr) - 1
    while(low <= high):
        mid = low + (high-low) // 2
        if(arr[mid] == number):
            return mid
        elif(number > arr[mid]):
            low = mid + 1
        else:
            high = mid - 1
    return -1

arr = [random.randint(0,10000) for i in range(5000)]

bubble_sort(arr)
print(arr[4999])
print("The sorted array is: ")
for i in arr:
    print(i , end = " ")
print()
print("Enter a number you want to search for: ")
number = int(input())
index = binary_search(arr,number)
print(index)