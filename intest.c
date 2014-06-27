/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
int main()
{
        int i,count=0;
        int n,k;
        scanf("%d%d",&n,&k);
        int t[n];
        for(i=0;i<n;i++)
        scanf("%d",&t[i]);
        i=0;
        while(i<n)
        {
        if(t[i]%k==0)
        count++;
        i++;
        }
        printf("%d\n",count);
        return 0;
}