/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
int main()
{
	int A,B,C;
	scanf("%d%d",&A,&B);
	C=A-B;
	int last;
	last=C%10;
	if(last!=9)
	printf("%d",C+1);
	else printf("%d",C-1);
	return 0;
}