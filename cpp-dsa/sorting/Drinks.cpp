#include<iostream>
using namespace std;
int main(){
    int n ,total=0;
    double ans;
    cin>>n;
    for(int i=0 ; i<=n-1; i++){
        cin>>i;
        total = total +  i;
    }
    ans = total/n;
    cout<<total;
    cout<<ans<<endl;

}