#include<iostream>
using namespace std;
int main(){

    int n , totalsum =0 ;
    int a[100];
    cin>>n;
    for(int i = 0 ; i<n ; i++){
        cin>>a[i];
        totalsum += a[i];
    }
        

        for( int i = 0 ; i<n-1;i++){

            for(int j =0 ; j<n-i-1 ; j++){

                if(a[j]<a[j+1]){
                    int temp  = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int i = 0 ; i<n ; i++){
        cout<<a[i]<<endl;
        
        }
        cout<<totalsum<<endl<<endl;



    
        int takensum  = 0 ;
        int count = 0 ;

        for(int i =0 ; i<n;i++){

            takensum += a[i];
            count++;
            if(takensum > totalsum-takensum){
                break;
            }
        }
        cout<<count;
}