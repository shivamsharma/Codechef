/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
#include <math.h>
int main()
{
    int i,j,n;
    scanf("%d",&n);
    int list[n],nzeros[n];
    for(i=0;i<n;i++)
    {
                    scanf("%d",&list[i]);
    }
    for(i=0;i<n;i++)
    {
        nzeros[i]=0,j=1;
        while(list[i]/(pow(5,j))>0)
        {
            nzeros[i]=nzeros[i]+list[i]/(pow(5,j));
            j++;
        }
    printf("%d\n",nzeros[i]);
    }
    scanf("%d",&i);
    return 0;
}