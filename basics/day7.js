// let arr = [1,2,3,4]
// let arr1 = [5,6,7]

// let merge = new Array(arr.length + arr1.length)

// let i =0 , j =0 , k=0;

// while(i<arr.length && j<arr1.length){
//     if(arr[i]<arr1[j]){
//         merge[k++]=arr[i++]
//     }
//     else{
//         merge[k++]=arr1[j++]
//     }
// }

// while(i<arr.length){
//     merge[k++] = arr[i++]
// }

// while(j<arr1.length){
//     merge[k++] = arr1[j++]
// }

// console.log(merge)

let arr = [1,2,3,4];
let arr1 = [5,6,7];

let merge = [];

let i = 0, j = 0;

while (i < arr.length && j < arr1.length) {
    merge.push(arr[i] < arr1[j] ? arr[i++] : arr1[j++]);
}

while (i < arr.length) merge.push(arr[i++]);
while (j < arr1.length) merge.push(arr1[j++]);
