/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
#include <string.h>
int main()
{
	int n1,n2,i,add=0,j,len;
	scanf("%d%d",&n1,&n2);
	int clicks[n2],click[n1+1];
	char sam[10];
	for(i=0;i<(n1+1);i++)
	click[i]=0;
	
	for(i=0;i<n2;i++)
	{
		scanf("%s",sam);
		len=strlen(sam);
		if(len!=8)
		{
			scanf("%d",&clicks[i]);
		}
		else 
		{
			clicks[i]=0;
		}
		if(clicks[i]==0)
		{
			add=0;
			for(j=0;j<(n1+1);j++)
			{
				click[j]=0;
			}
			goto print;
		}
		else
		click[clicks[i]]++;
		if(click[clicks[i]]%2!=0)
		{
			add++;
		}
		else add--;
		print:
		printf("%d\n",add);
	}
	getch();
	return 0;
}