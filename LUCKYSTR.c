/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
#include <string.h>
int main()
{
    int i,j,N,K,flag=0;
    char *ptr;
    scanf("%d%d",&K,&N);
    char A[K][50],B[N][50];
    int lenA[K],lenB[N];
    for(i=0;i<K;i++)
    {
                    scanf("%s",A[i]);
                    lenA[i]=strlen(A[i]);
    }
    
    for(i=0;i<N;i++)
    {
                    scanf("%s",B[i]);
                    lenB[i]=strlen(B[i]);
    }
    
    for (i=0;i<N;i++)
         {
                     flag=0;
                     if (lenB[i]>=47)
                     printf("Good\n");
                     else {
                     for (j=0;j<K;j++)
                    {
                                      ptr=strstr(B[i],A[j]);
                                    if (ptr!=NULL)
                                    { flag=1;
                                    break;
                                    }
                    }if(flag==1)
                    printf("Good\n");
                    else printf("Bad\n");
                    }
    }scanf("%d",&i);
    return 0;
}