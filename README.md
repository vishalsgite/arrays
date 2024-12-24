**Java Arrays**
**Introduction**
An array in Java is a data structure used to store multiple values of the same type in a single variable. Arrays are fixed-size and index-based, which means they have a predefined size, and elements are accessed via an index (starting from 0). Arrays are objects in Java, and they are stored in the heap memory.

**Key Points:**
Arrays are homogeneous, meaning they can store only elements of the same data type.
They can store primitive types or objects.
Arrays are ordered and stored in contiguous memory locations.
Arrays are not dynamically resizable, so once the size is declared, it cannot be changed.
**Characteristics of Java Arrays**
Index-Based: The first element is at index 0, the second at index 1, and so on.
Array Type: An array in Java can hold either primitive values (e.g., int, char, float) or object references (e.g., String, Integer).
Serializable: Java arrays implement the Serializable interface, making them capable of being serialized.
Cloneable: Arrays are also Cloneable, meaning they can be cloned (copied) using the clone() method.
**Default Values in Arrays**
When an array is created, it is automatically initialized with default values:

Primitive types:
int, short, long, byte → 0
float, double → 0.0
char → \u0000
boolean → false
Object types (e.g., String, Object) → null
**Types of Arrays**
One-Dimensional Array: A simple array containing elements of the same type.

int[] arr = new int[5];

Multi-Dimensional Array: Arrays containing other arrays. These can be 2D, 3D, or higher.

int[][] matrix = new int[3][3];

Jagged Arrays: A multi-dimensional array where the inner arrays can have different lengths.

int[][] jaggedArray = new int[3][];
jaggedArray[0] = new int[4];
jaggedArray[1] = new int[2];
jaggedArray[2] = new int[3];

**Methods for Copying Arrays**
Manually: Using a loop to copy each element.
Using System.arraycopy(): The fastest and most efficient method for copying arrays or parts of arrays.
System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);
Using Arrays.copyOf(): Copies the entire array or part of it.
Using clone(): Creates a shallow copy of the array.
**Common Array Operations**
1. Reversing an Array:

for (int i = 0; i < arr.length / 2; i++) {
    int temp = arr[i];
    arr[i] = arr[arr.length - 1 - i];
    arr[arr.length - 1 - i] = temp;
}
2. Searching in an Array:
Linear Search: Iterate through the array and compare each element.
Binary Search: Requires the array to be sorted first. Use Arrays.binarySearch().
3. Sorting an Array:

Arrays.sort(arr);
4. Finding Duplicates:
Brute Force Method: Compare each element with every other element.
Using HashSet: Faster approach by storing elements in a HashSet.
Using HashMap: Store array elements as keys and their frequency as values.
Common Array Errors
1. NegativeArraySizeException
Arrays cannot have negative sizes. Declaring a negative size array will not result in a compile-time error but will throw a runtime exception:

int[] arr = new int[-5]; // Throws NegativeArraySizeException
2. ArrayIndexOutOfBoundsException
This occurs when attempting to access an index outside the array’s range:

int[] arr = new int[5];
arr[5] = 10; // Throws ArrayIndexOutOfBoundsException
**Differences Between Arrays and ArrayLists**
Feature	Array	ArrayList
Size	Fixed size	Dynamic size
Data Types	Can hold primitives and objects	Holds only objects
Iteration	Using loops	Provides iterators
Performance	Faster for simple operations	Slightly slower for resizing
Generic Support	Does not support generics	Supports generics
Multi-Dimensional	Supports multi-dimensional arrays	Does not support multi-dimensional arrays
Memory Allocation	Fixed allocation	Automatically resizes
**Advantages of Arrays**
Efficient for storing multiple elements of the same type.
Provides fast access to elements via indexing.
Supports both primitive types and objects.
Disadvantages of Arrays
Fixed size (cannot be resized after creation).
Inserting or deleting elements is difficult since elements are stored in contiguous memory.
Wasting memory if the array size is over-allocated.
**Array Methods**
1. Checking if an Element Exists in an Array:
Java provides the isExists() and contains() methods in the Arrays class to check if an array contains elements.

2. Using Arrays Class:
Sorting: Arrays.sort(arr)
Copying: Arrays.copyOf(arr, newSize)
Searching: Arrays.binarySearch(arr, key)
Equality: Arrays.equals(arr1, arr2)
Filling: Arrays.fill(arr, value)
**Conclusion**
Java arrays are essential for working with multiple data elements. They provide efficient access to data but come with certain limitations, such as a fixed size and difficulty in inserting or deleting elements. However, their use is vital in various data structures and algorithms.

Feel free to contribute to this repository, share your improvements, or suggest new additions!
