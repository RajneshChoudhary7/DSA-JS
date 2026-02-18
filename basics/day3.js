// var n = Number(prompt("enter the nth number to add = "))

// if(isNaN(n)){
//     console.log("invalid input")
// }

// else{
//     if(n>0){
//         var sum = 0 
//         for(var i =1 ; i<=n; i++){
//             sum = sum + i
//         }
//         console.log("you total sum is = " + sum)
//     }
//     else{
//         console.log("should be +ve and more than 0 ")
//     }
// }


// var n = Number(prompt("enter the nth number to fact = "))

// if(isNaN(n)){
//     console.log("invalid input")
// }

// else{
//     if(n>0){
//         var sum = 1 
//         for(var i =1 ; i<=n; i++){
//             sum = sum * i
//         }
//         console.log("you total fact is = " + sum)
//     }
//     else{
//         console.log("should be +ve and more than 0 ")
//     }
// }



// var pr = prompt("kaha tak add akrwwoge ? ");
// if(pr === null){
//     console.log("cancelled");
// }
// else{
//     var n = Number(pr)

//     if(isNaN(n)){
//         console.log("invalid NUmber ")
//     }
//     else{
//         var flag = 0
//         if(n>0){
//             for(var i=2 ;i<=n;i++){
//                 if(n%i == 0 ){
//                     flag = flag + 1
//                 }
//             }
            
//         }
//         if(flag === 1){
//             console.log("number is prime ")
//         }
//         else{
//             console.log("number is not prome ")
//         }
        
//     }
// }



var pr = prompt("kaha tak add akrwwoge ? ");
if(pr === null){
    console.log("cancelled");
}
else{
    var n = Number(pr)

    if(isNaN(n)){
        console.log("invalid NUmber ")
    }
    else{
        var flag = 0
        if(n>0){
            console.log(isPrime(n))
            
        }
        else{
            console.log("number should be +be and more than 0 ")
        }
        
    }
}

function isPrime(n){
    if(n<=1) return false;
    if(n==2) return true;
    if(n%2==0) return false;
    for(let i = 3 ; i<=Math.floor(Math.sqrt(n));i+=2){
        if(n%i==0) return false
    }
    return true
}

