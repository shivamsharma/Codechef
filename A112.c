/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
#include <math.h>

int revint(int i,int len)
{
	int rev=0,temp=i,a;
	while(len>0)
	{
		a=temp%10;
		rev+=pow(10,len-1)*a;
		temp=temp/10;
		len--;
	}
	return rev;
}

int length(int i)
{
	int count=1;
	while(i/10>0)
	{
		count++;
		i=i/10;
	}
	return count;
}

int main()
{
    int n,i,j,k,len,rev;
    scanf("%d",&n);
    int array[n][2];
	int add[n];
	for(i=0;i<n;i++)
	{
                    for(j=0;j<2;j++)
                    {
                                    scanf("%d",&array[i][j]);
                                    len=length(array[i][j]);
                                    array[i][j]=revint(array[i][j],len);
                    }
                    add[i]=array[i][0]+array[i][1];
                    len=length(add[i]);
                    printf("%d\n",revint(add[i],len));
    }scanf("%d",&i);
    return 0;
}