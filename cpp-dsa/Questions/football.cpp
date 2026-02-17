#include<iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    string team1 , team2;
    int count1 = 0;
    int count2 = 0;


    for(int i = 0 ; i<n ; i++){
        string s;
        cin>>s;

        if(i == 0){
            team1 = s;
            count1++;
        }
        else if(s == team1){
            count1++;
        }

        else{
            team2 = s;
            count2++;
        }
    }
    if(count1 > count2){
        cout<<team1;
    }
    else{
        cout<<team2;
    }
}