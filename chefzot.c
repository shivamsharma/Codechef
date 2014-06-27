/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
int main()
{
	int n,i;
	scanf("%d",&n);
	int A[n];
	for(i=0;i<n;i++)
	{
		scanf("%d",&A[i]);
	}
	int max=0,temp=0;
	for(i=0;i<n;i++)
	{
		if(A[i]!=0)
		{
			temp++;
		}
		else
		{
			temp=0;
		}
		 if(max<temp)
                 max=temp;
	}
	printf("%d\n",max);
	return 0;
}