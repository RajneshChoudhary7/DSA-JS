#include<iostream>
using namespace std;

void selection_sort(int arr[], int n){
    for(int i = 0 ; i<=n-1 ; i++){
        int j = i;
        while (j>0 && arr[j-1]>arr[j])
        {
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
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

    


    selection_sort(arr,n);


    cout<<"after sort Bubble sort = "<<endl;
    for(int i =0 ; i<n ;i++){
        cout<<arr[i]<<",";
    }
    cout<<endl;

}