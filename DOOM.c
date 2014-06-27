/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
#include <string.h>
void replace(char *str,char *orig,char *rep,int length)
{
     int i;
     for(i=0;i<length;i++)
     {
                          if(str[i]==orig[0]&&str[i+1]==orig[1]&&str[i+2]==orig[2]&&str[i+3]==orig[3])
                          {
                                       str[i]=rep[0];
                                       str[i+1]=rep[1];
                                       str[i+2]=rep[2];
                                       str[i+3]=rep[3];
                          }
     }
}
int main()
{
	int i,j,k,l,m,t,len;
	char *ptr1,*ptr2;
	scanf("%d",&t);
	int array[t];
	char string[t][101],ch;
	for(i=0;i<t;i++)
	{
		scanf("%d",&array[i]);
		scanf("%s",string[i]);
	}
	int pos,flag;
	for(i=0;i<t;i++)
	{
		flag=0;
		len=strlen(string[i]);
		for(j=0;j<len;j++)
		{
			flag=0;
            ptr1=strstr(string[i],"??1?");
			ptr2=strstr(string[i],"???0");
			if(ptr1!=NULL&&array[i]==2)
				{
                               //printf("hello");
                               replace(string[i],"??1?","1010",len);
                               }
                               if(ptr2!=NULL&&array[i]==2)
                               {
                                            replace(string[i],"???0","1010",len);
                               }	
    
			if(string[i][0]==string[i][len-1]&&len>1&&string[i][0]!='?')
                        {
				                flag=2;
				                string[i][0]='\0';
                                printf("NO");
                                break;
                        }
			else if(string[i][j]==string[i][j+1]&&string[i][j]!='?')
			{
				flag=2;
				string[i][0]='\0';
				printf("NO");
				break;
			}
			
			else if(string[i][j]=='?')
			{
				pos=j;
				for(k=0,ch='0';k<array[i]&&ch<='array[i]';k++,ch++)
				{
					if(pos==0&&string[i][pos+1]!=ch&&len>1&&string[i][len-1]!=ch)
					{
						flag=1;
						string[i][pos]=ch;
						break;
					}
					else if(pos==(len-1)&&string[i][pos-1]!=ch&&string[i][0]!=ch)
					{
						flag=1;
						string[i][pos]=ch;
						break;
					}
					else if(string[i][pos-1]!=ch&&string[i][pos+1]!=ch&&pos!=0&&pos!=(len-1))
					{
						flag=1;
						string[i][pos]=ch;
						break;
					}
				}
			}
		}if(string[i][0]!='\0')
		for(l=0;l<len;l++)
		{
			if(string[i][l]=='?')
			{
				printf("NO");
				flag=4;
				break;
			}
		}
			if(flag==1)
			{
				for(l=0;l<len;l++)
				printf("%c",string[i][l]);
			}
			if(flag==0)
			{
				 for(l=0;l<len;l++)
                                 printf("%c",string[i][l]);
			}
		printf("\n");
	}scanf("%d",&i);
	return 0;
}