/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
#include <string.h>
#include <math.h>
int reverse(int num)
{
	int len=1,rev=0,temp=num;
	while(temp/10>0)
	{
		len++;
		temp=temp/10;
	}
	temp=num;
	int a;
	while(len>0)
	{
		a=temp%10;
		rev=rev+a*pow(10,len-1);
		len--;
		temp/=10;
	}
	return rev;
}
		
int main()
{
	int t,i,tc;
	scanf("%d",&t);
	int flag=0,itr=0;
	for(i=0;i<t;i++)
	{
		scanf("%d",&tc);
		flag=0;
		itr=0;
		while(flag!=1)
		{
			itr++;
			tc=tc+reverse(tc);
			if(tc==reverse(tc))
			flag=1;
		}
		printf("%d %d\n",itr,tc);
	}
	getch();
	return 0;
}
				