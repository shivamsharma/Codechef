/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
#include <string.h>
int main()
{
	int i,j,count,len;
	char string[1000];
	scanf("%s",string);
	len=strlen(string);
	for(i=0;i<len;i++)
	{
		if(string[i]!=0)
		printf("%c",string[i]);
		count=1;
		for(j=1;j<len;j++)
		{
			if(string[i]==string[i+j])
			{
				count++;
				string[i+j]=0;
			}
		}
		if(string[i]!=0)
		printf("%d",count);
	}
	//getch();
	return 0;
}