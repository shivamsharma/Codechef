/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
void display(long long int *a,int n)
{
	int i=0;
	for (i = 0; i < n; ++i)
	{
		printf("%lld ",a[i]);
	}
	printf("\n");
}
int main()
{
	int n,k,i,j;
	scanf("%d%d",&n,&k);
	long long int a[n],b[n],c[n];
	scanf("%lld",&a[0]);
	long long int max=a[0],min=a[0];
	int maxindex=0,minindex=0;
	for(i=1;i<n;i++)
	{
		scanf("%lld",&a[i]);
		if(max<a[i])
		{
			max=a[i];
			maxindex=i;
		}
		if(min>a[i])
		{
			min=a[i];
			minindex=i;
		}
	}
	for(i=0;i<n;i++)
	{
		b[i]=max-a[i];
	}
	int temp=minindex;
	minindex=maxindex;
	maxindex=temp;
	max=b[maxindex];
	min=b[minindex];
	//printf("%d   %d\n",max,min );
	for(i=0;i<n;i++)
	{
		c[i]=max-b[i];
	}
	if(k==0)
		display(a,n);
	else if(k%2==0)
		display(c,n);
	else display(b,n);
	return 0;
}