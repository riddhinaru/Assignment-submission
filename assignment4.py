Write a program to implement insertion sort

def insertion_sort(alist):
    for i in range[i]
    j = i - 1
    while(j >= 0 and temp <alist[j]):
        alist[j + 1] = alist[j]
        j = j - 1
    alist[j + 1] = temp



 alist =input('Enter the list of numbers: ').split()
 alist =[int(x) for x in alist]
 insertion_sort(alist)
 print('Sorted list:' ,end='')
 print(alist)

