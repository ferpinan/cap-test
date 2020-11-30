## 1
__C__

Compiler Error: `show` method is final in Base class, it can not be overridden

## 2

__A__

    Base
    Derived
    Derived
    
## 3

__C__

__Compiler error__: `int arr[2];` is not correct

## 4

__A__

     0
     1 2
     3 4 5
     6 7 8 9

## 5

__A__

    Copy constructor called
    (10.0 + 15.0i)
    
## 6

__A__

Compiler Error. `ArrayIndexOutOfBoundsException` is caught in `Exception`.

## 7

__D__ Throwable

## 8

__A__ 

    i = 10, j = 20
    
## 9

Answered at `eus.ferpinan.captest.PrintNamesUsingStreamMain.java` file.

# 10

Answered at `eus.ferpinan.captest.FindBiggerToTheRightMain.java` and it's dependencies. Some unit test have been done to test these implementations. They can be run with the next commmand (only applies if we have `maven`):

    mvn clean test


> Note: the first implementation complexity did not convince me so I made a new Implementation. Therefore, this answer has two parts.

### 10 (Part 1)

This implementation was done at `FindBiggerNumberToTheRightServiceStreamsImpl`.

__A__

List has been used so we could use streams to find the first bigger element in a sublist.
Set was discarded because it can not contain duplcated elements.

__B__ 

The complexity is O(n+n-1+n-2....n times).

To solve this complexity, we need to use Sum for mathematics formula by see this link

    => n+n+n...n times - (1+2+3...n times)
    => n^2- (n^2+n)/2

Complexity will be

__`O((n^2-n)/2)`__

### 10 (Part 2)

This implementation was done at `FindBiggerNumberToTheRightServiceStackImpl`.

__A__

The previous implementation was not very efficient so I found in the internet how to make it better. The best aproach was using a `Stack` were indices were saved in case next number was smaller until the algorithm finds the next bigger one.

__B__ 

The complexity in the best case is O(n) (if the array is ordered ascendant).
The complexity in the worst case is O(2*n) (if the array is ordered descendant).

