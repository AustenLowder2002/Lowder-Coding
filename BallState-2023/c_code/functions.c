#include <stdio.h>
void sortNum(int x,int y, int z);

int main() {
    int num1,num2,num3;

    printf("Please input your three whole numbers: ");
    scanf("%d %d %d", &num1,&num2,&num3);
    
    sortNum(num1,num2,num3);

    return 0;
}

void sortNum(int x, int y, int z){
    if(x > y && x > z){
        if( y > z){
            printf("Order is: %d %d %d", x,y,z);
        }else{
             printf("Order is: %d %d %d", x,z,y);
        }   
    }else if(y > x && y > z){
        if(x > z){
            printf("Order is: %d %d %d", y,x,z);
        }else{
            printf("Order is: %d %d %d", y,z,x);
        }
    }else{
        if(x > y){
            printf("Order is: %d %d %d", z,x,y);
            
        }else{
            printf("Order is: %d %d %d", z,y,x);
        }
    }
}