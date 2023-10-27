#include <stdio.h>
#include <string.h>

int main() {
   char name1[100];
   char name2[100];
   int age1; 
   int age2;
   
   
   printf("Enter the first persons name: ");
   fgets(name1, sizeof(name1), stdin);
   printf("Enter the second persons name: ");
   fgets(name2, sizeof(name2), stdin);


   printf("Enter the first persons age: ");
   scanf("%d",&age1);
   printf("Enter the second persons age: ");
   scanf("%d",&age2);
   
   
   if(age1 > age2){
    printf("The first person is older their age is %d and their name is %s", age1, name1);
   }
   else if(age2 > age1){
    printf("The second person is older their age is %d and their name is %s", age2, name2);
   }else
   printf("The ages are the same");
   
   
   return 0;
}