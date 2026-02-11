#include<iostream>
using namespace std;
int main(){

    string s , t ;
    cin>>s;
    cin>>t;

    int sh = (s[0] - '0'*10 + s[1] - '0');
    int sm = (s[3] - '0'*10 + s[4] - '0');


    int th = (t[0] - '0'*10 + t[1] - '0');
    int tm = (t[3] - '0'*10 + t[4] - '0');

    int wakeupmin = sh*60+sm;
    int sleepmin = th*60+tm;

    int result = wakeupmin - sleepmin;

    if(result<0){
        result += 1440;
    }

    int ph = result/60;
    int pm = result%60;

    if(ph<10) cout<<"0";
    cout<<ph<<":";

    if(pm<10) cout<<"0";
    cout<<pm;
    

    
    cout<<sh<<":"<<sm<<endl;
    cout<<th<<":"<<tm;
}