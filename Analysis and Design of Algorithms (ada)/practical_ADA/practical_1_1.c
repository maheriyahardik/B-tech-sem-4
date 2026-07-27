//sum of 1 to N Numner with and without for loop
#include <stdio.h>

    int main()
    {
   int n,count,sum=0;
    printf("Enter a number: ");
    scanf("%d",&n);
    for(count=1;count<=n;count++)
    {
        sum=sum+count;
    }
    printf("sum of 1 to %d is %d\n",n,sum);
    return 0;
    }
    

