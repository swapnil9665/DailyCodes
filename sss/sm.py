#include<iostream>
    using namespace std;
    
    int main(){
        int arrlen;
        int arr[20];
        int total = 0;
        int final;
        int sum=0;
        int x;
        cout<<"Enter the Number of Elements In Array:"<<endl;
        cin>>arrlen;
    
        for(int i=0;i<arrlen;i++){
            cout<<"Enter Numbers in Array:";
            cin>>arr[i];
        }

        for(int i=0;i<arrlen;i++){
            total = total+arr[i];
        }
        if(total%10!=0){

            for(total;total!=0;total=total/10){
                x = total%10;
                sum = sum + x;
            }
            cout<< sum;
            
            if(sum!=0){
                final=sum%10;
                return 0;
            }
        }


    }

    /*Name: Rohit Balbhim Garje
    Div:-4
    Contact:8983531363
    Another Contact:8975462970*/