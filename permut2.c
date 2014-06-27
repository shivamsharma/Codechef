/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
int main()
{
	int i,flag;
	while(1)
	{
		int tc;
		//for test case
		scanf("%d",&tc);
		if(tc==0)
		break;		//end condition
		int a[tc+1],b[tc+1];
		for(i=1;i<=tc;i++)
		scanf("%d",&a[i]);
		for(i=1;i<=tc;i++)
		{
			flag=0;
			b[a[i]]=i;
			if(b[a[i]]!=a[a[i]])
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		printf("not ambiguous\n");
		else
		printf("ambiguous\n");
	}
	return 0;
}