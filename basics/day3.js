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


var n = Number(prompt("enter the nth number to fact = "))

if(isNaN(n)){
    console.log("invalid input")
}

else{
    if(n>0){
        var sum = 1 
        for(var i =1 ; i<=n; i++){
            sum = sum * i
        }
        console.log("you total fact is = " + sum)
    }
    else{
        console.log("should be +ve and more than 0 ")
    }
}