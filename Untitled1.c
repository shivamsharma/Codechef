/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
#include <string.h>
int main()
{
    int i,j,p,r,N,K,flag=0;
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
    }int count;
    j=0,r=0;
    print:
    for(i=0;i<N;i++)
    {

                    for(p=0;p<K;p++)
                    { count=0,flag=0;
                                    if(lenB[i]>=47)
                                    {printf("Good\n");
                                     goto print;}
                                    else while(lenA[p]>0&&(B[i][j]==A[p][r])&&(j<lenB[i])&&(r<lenA[p]))
                                         {
                                                j++;
                                                r++;
                                                count++;
                                                flag=1;
                                         }if (flag==1&&count==lenA[p])
                                          {printf("Good\n");
                                          goto print;}
                    }if(flag==0)
                     printf("Bad\n");
    }scanf("%d",&i);
    return 0;
}                                  