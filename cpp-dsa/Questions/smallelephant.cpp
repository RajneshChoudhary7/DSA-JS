#include<iostream>
using namespace std;
int main(){

    int n;
    cin>>n;
    long long arr[100005];

    for(int i = 0;i<=n-1 ;i++ ){
        cin>>arr[i];

    }

    int min = arr[0];
    int index = 0;
    int count = 1;

    for(int i = 1;i<n ;i++ )
    {
        if(arr[i]<min)
        {
            min = arr[i];
            index = i;
            count = 1;
        }  

        else if(min == arr[i])
        {
           count++;
        } 
    }

    if(count>1){
        cout<<"Still Rozdil";
    }
    else{
        cout<<index+1;
    }
    
}