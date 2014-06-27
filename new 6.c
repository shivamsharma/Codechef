/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include<stdio.h> // dynamic- down-up approach
int main()
{ int a[100][100],i,j,t,n;
scanf("%d",&t);
while(t--)
{ scanf("%d",&n);
for(i=0;i<n;i++)
for(j=0;j<=i;j++)
scanf("%d",&a[i][j]);
for(i=n-2;i>=0;i--)
{ for(j=0;j<=i;j++)
{ int t= a[i+1][j]>a[i+1][j+1] ? a[i+1][j] : a[i+1][j+1];
a[i][j]+=t;
}
}
printf("%d\n",a[0][0]);
}getch();
return 0;
}