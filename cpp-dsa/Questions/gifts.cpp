#include<iostream>
using namespace std;
int main(){
    int n ;
    int arr1[101];
    int ans[101];
    cin>>n;
    for(int i = 1 ; i<=n ; i++ ){
        cin>>arr1[i];
    }

    for(int i = 1 ; i<=n ; i++ ){
        ans[arr1[i]] = i; 
    }
    for(int i = 1 ; i<=n ; i++ ){
        cout<<ans[i]<<" ";
    }

}


// #include<iostream>
// using namespace std;
// int main(){
//     int n ;
//     int arr1[100];
//     int ans[100];
//     cin>>n;
//     for(int i = 1 ; i<=n ; i++ ){
//         cin>>arr1[i];
//     }
    
//     int j = 1 ;
//     for(int i = 1 ; i<=n ; i++ ){
//         while(arr1[j] == i){
//             ans[i] = arr1[j];
//         }
//         j++;
//     }
    
    
//     for(int i = 1 ; i<=n ; i++ ){
//         cout<<ans[i];
//     }

// }