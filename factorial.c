/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include<stdio.h>
int main()
{
	int t;
	scanf("%d",&t);
	while (t--)
	{
		int a[200];
		int n;
		int i;
		scanf("%d",&n);
		a[0]=1;
		int m=1;
		int j;
		int r=n;
		int c=0;
		while (r>0)
		{
			int t=r%10;
			a[c]=t;
			r=r/10;
			c=c+1;
		}
		for (i=1;i<n;i++)
		{
		
			int temp=0;
			for (j=0;j<c;j++)
			{
				int x=a[j]*i+temp;
				a[j]=x%10;
				temp=x/10;
			}
			while (temp!=0)
			{
				a[c]=temp%10;
				temp=temp/10;
				c=c+1;
			}
		}
		for (i=c-1;i>=0;i--)
		{
			printf("%d",a[i]);
		}
		printf("\n");
	}
	return 0;
}
 