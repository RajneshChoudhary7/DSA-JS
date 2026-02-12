#include<iostream>
using namespace std;

void bubble_sort(int arr[],int n){
        for(int i = n-1 ; i>=1;i--){

            for(int j=0 ; j<i;j++){
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

int main(){
    
    int n , arr[50]; 
    cout<<"enter the size of arr = ";
    cin>>n;
    cout<<" Now enter the element of array = ";
    for(int i =0 ; i<n ;i++){
        cin>>arr[i];

    }

    cout<<"Before sort Bubble sort"<<endl;
    for(int i =0 ; i<n ;i++){
        cout<<arr[i]<<",";
    }
    cout<<endl;

    


    bubble_sort(arr,n);


    cout<<"after sort Bubble sort = "<<endl;
    for(int i =0 ; i<n ;i++){
        cout<<arr[i]<<",";
    }
    cout<<endl;

}