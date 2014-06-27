/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
#define ull unsigned long long

int overlucky(unsigned int n)
{
	unsigned int temp=n,t;
	while(temp>0)
	{
		t=temp%10;
		if(t==4||t==7)
		return 1;
		temp=temp/10;
	}
	return 0;
}
unsigned int solver(unsigned int n)
{
	unsigned int i,count=0;
	for(i=2;i<sqrt(n);i++)
	{
		if(n%i==0)
		{
			if(overlucky(i))
			count++;
			if(overlucky(n/i))
			count++;
		}
	}
	if(i*i==n&&overlucky(i))
	count++;
	if(overlucky(n))
	count++;
	return count;
}

int main()
{
	int tc;
	scanf("%d",&tc);
	while(tc--)
	{
		unsigned int n;
		scanf("%u",&n);
		printf("%u\n",solver(n));
	}
	return 0;
}