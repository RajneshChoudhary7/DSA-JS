// let arr = new Array(5)
// let s = 0 

// for(let  i=0; i<5 ;i++){
//     arr[i] = Number(prompt("enter the element of array = "))
//     var max = arr[0]
//     s = s + arr[i]
//     if(max<arr[i+1]){
//         max = arr[i+1]
//     }
    
// }

// console.log(arr)
// console.log(s)
// console.log(max)



 

// for(let  i=0; i<5 ;i++){
   
    
// }




// let arr = new Array(5)
// let sum = 0;
// let max= -Infinity



// for(let i=0 ;i<5; i++){
//     arr[i] = Number(prompt("enter element : "))
//     sum += arr[i]
//     if(arr[i]>max) max = arr[i]
    
// }

// console.log(arr)
// console.log(sum)
// console.log(max)

// let arr = [23,34,23,5,6,34,234,56345,345]

// let max = Math.max(arr[0], arr[1])
// let smax = Math.max(arr[0], arr[1])

// for(let i = 2 ; i<arr.length;i++){
//     if(arr[i]>max){
//         smax = max
//         max = arr[i]
//     }
//     else if (arr[i]> smax){
//         smax = arr[i]
//     }
// }
// console.log(smax)

// let arr = [23,34,23,5,6,34,234,56345,345]

// let rev = []

// var j = 0 
// for(let i = arr.length -1 ; i>=0 ; i --)
// {
//     rev[j]= arr[i]
//     j++
// }

// console.log(arr)
// console.log(rev)

//  let arr = [23,34,23,5,6,34,234,56345,345]
//  console.log(arr)

//  var temp = 0 
//  for( let i =0 , j = arr.length-1; i <= j ; i++, j--){
//     temp = arr[i];
//     arr[i]= arr[j]
//     arr[j] = temp
//  }

//  console.log(arr)



// let arr = [ 1,0,1,0,1,0,1,0,1,0,1]

// console.log(arr)

// var temp = 0
// for(let i=0,j=0 ; i <arr.length ; ){
//     if(arr[i] === 0 ){
//      temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp
//         j++
//     }
//     i++
    
// }

// console.log(arr)


// let arr = [23,45,562,3,5,67,7]
// console.log(arr)

// let copy  = arr[0]

// for( let i  = 0 ; i < arr.length-1 ; i++){
//     arr[i] = arr[i+1]
// }

// arr[arr.length-1] = copy


// console.log(arr)



// let arr = [23,45,562,3,5,67,7]
// console.log(arr)

// let copy  = arr[arr.length-1]


// for( let i   = arr.length-1 ; i>0 ; i--){
//     arr[i] = arr[i-1]
// }

// arr[0] = copy


// console.log(arr)


// let arr = [1,2,3,4,5]
// console.log(arr)

// let k = Number(prompt("Enter k value = "))
// let r  = k % arr.length 

// // if(k % 5 == 0 )
// var num = 1 
// for( let i = 0 ; i<r ; i++){
//     console.log(num++)

//     let copy = arr[0]
//     for( let i = 0; i< arr.length-1 ; i++){
//         arr[i]= arr[i+1]
//     }

//     arr[arr.length-1] = copy
// }

// console.log(arr)


// left rotation 


// let arr = [1,2,3,4,5]
// let temp = new Array(arr.length)

// let k = Number(prompt("Enter k value "))
// k = k % arr.length

// for(let i =0 ; i<arr.length; i++){
//     temp[i] = arr[(i+k)%arr.length]
// }
// console.log(temp)

// right rotation 

// let arr = [1,2,3,4,5]
// let temp = new Array(arr.length)

// let k = Number(prompt("Enter k value "))
// k = k % arr.length

// for(let i =0 ; i<arr.length; i++){
//     temp[(i+k)%arr.length] = arr[i] 
// }
// console.log(temp)


/// second algo of left rotation 

let arr = [1,2,3,4,5]
let k = Number(prompt("Enter value of k = "))
 k = k % arr.length

 reverse(0 , k-1)
 reverse(k, arr.length-1)
 reverse(0 , arr.length-1)

 console.log(arr)

 function reverse( i , j ){
    while(i<j){
        let temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
        i++
        j--
    }
 }