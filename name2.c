/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
#define SIZE 25001

int main()
{
	int t,i,j;
	scanf("%d",&t);
	char str1[SIZE],str2[SIZE];
	while(t--)
	{
		i=j=0;
		scanf("%s%s",str1,str2);
		if(strlen(str1)<strlen(str2))
		{
			while(str1[i]!='\0'&&str2[j]!='\0')
			{
				if(str1[i]==str2[j])
				{
					i++;
					j++;
				}
				else j++;
			}
			if(str1[i]=='\0')
			printf("YES\n");
			else printf("NO\n");
		}
		else
		{
			while(str1[i]!='\0'&&str2[j]!='\0')
			{
				if(str1[i]==str2[j])
				{
					i++;
					j++;
				}
				else i++;
			}
			if(str2[j]=='\0')
			printf("YES\n");
			else printf("NO\n");
		}
	}
	return 0;
}