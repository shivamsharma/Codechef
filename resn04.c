/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
int main()
{
	int i,t,temp;
	scanf("%d",&t);
	for(i=0;i<t;i++)
	{
		int n,flag=0;
		scanf("%d",&n);
		int piles[n],j;
		for(j=0;j<n;j++)
		scanf("%d",&piles[j]);
		for(j=1;j<=n;j++)			//temp=piles[k]/k; now if temp is even or odd
		{
			if((piles[j-1]/j)%2!=0)		//flag=0 ==>alice flag=1  ==>bob
			{
				if(j==n)
				temp=flag;
				if(flag==1)
				flag=0;
				else flag=1;
			}
			if(j==n&&(piles[j-1]/j)%2==0)
			{
				if(flag==0) temp=1;
				else temp=0;
			}
		}
		if(temp==0)
		printf("ALICE\n");
		else printf("BOB\n");
	}
	return 0;
}