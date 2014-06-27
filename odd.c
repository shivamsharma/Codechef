/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
#include <math.h>
int main()
{
    int i,j,n;
    scanf("%d",&n);
    int select[n];
    for (i=0;i<n;i++)
    scanf("%d",&select[i]);
    int temp;
    
    for (i=0;i<n;i++)
    {
                    j=0;
                    while(pow(2,j)<=select[i])
                    {
                                              j++;
                    }
                    temp=pow(2,j-1);
                    printf("%d\n",temp);
    }scanf("%d",&i);
    return 0;
}