/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
int main()
{
	int i,j,A,N,K;
	scanf("%d%d%d",&A,&N,&K);
	int reactor[K];
	for(i=0;i<K;i++)
	{
		int rem=A%(N+1);
		A=A/(N+1);
		printf("%d ",rem);
	}
	printf("\n");
	return 0;
}