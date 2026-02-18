// let abc = "asdfs"
// abc[2] = "r"
// console.log(abc)


// let a = 100
// let z= ++a 
// console.log(a+z) 
// console.log(a,z)

// let str = "my name is rajnesh";
// let str2 = ""
// // Fixed loop (starts at length-1)
// for(let i = str.length - 1; i >= 0; i--){
//     str2+=(str[i] + " ");
// }
// console.log(str2)

// function abc(b,...a){
//     console.log('====================================');
//     console.log(a);
//     console.log('====================================');
// }

// abc(32,23,23,23,32,324,324)


// let str = "my name is rajnesh";

// const obj = {}

// for(let x of str ){
//     if(obj[x]){
//         obj[x] += 1
//     }
//     else{
//         obj[x] = 1
//     }
// }

// console.log('====================================');
// console.log(obj);
// console.log('====================================');


// let x = [1,2,3,4]

// let [a, ...b] = x.reverse()

// console.log(b)

// const obj ={
//     a:1,
//     c:()=>{
//         return this.a;
//     }

// }
// console.log(obj.c.call({a:1}))

// function showMessage(marks) {
//     const message  = marks ?? "Absent"
//     console.log(`marks : ${message}`)
// }

// showMessage(23)
// showMessage(0)
// showMessage(3)



// function showMessage(marks) {
//     const message  = marks || "Absent"
//     console.log(`marks : ${message}`)
// }

// showMessage(23)
// showMessage(0)
// showMessage(3)


//iifi concept

// function show(){
//     (function(){
//         var x = 9;
//         var y = 0
//     })();
//     console.log(x,y)
// }


// show()



// const str = "hey JS? you R AMAzing"

// const vowels = ['a','e','i','o','u']

// function countVowels(data){
//      let count =0;
      
//      data.toLowerCase().split("").forEach((ch)=>{
//         vowels.includes(ch) && count ++;
//      })
//      return count
// }

// console.log(countVowels(str))

// const str = "a,b,c,d,e"

// const strArr = str.split(".")

// const obj = strArr.reduceRight(cb)

// function cb(acc, next){
//     return {[next]:acc}
// }

// console.log(obj)

// function human(fname , lname){
//     this.firstname = fname
//     this.lastname = lname
// }

// const mrx = new human("mr","x")
// const rock = human("the","Rock")

// console.log(mrx)
// console.log(rock)

// let num = 20 + 3 * 4;
// console.log(num); // 32


// let score = 100;
// let to = score === 100; // true
// console.log(to);


// let score = 50 ;
// if(score > 30 || firstname){
//     console.log("pass!!")
// }

// let e = 50 ;
// if(score > 30 ?? firstname){
//     console.log("pass!!")
// }

// let firstname = "kk"
// let sscore = 50 ;
// if(score > 30 && firstname){
//     console.log("pass!!")
// }

// let score = 50;
// if(true && score) {
// console.log('Pass!!');
// } else {
// console.log('Fail!!');
// }

// function sum(num1) {
// console.log(num1);
// }
// let result = sum();
// console.log(result); 

// let marks = {
// pa: 90,
// fnd: 100,
// nalr: 0,
// totalMarks: (fine)=> {
// console.log();
// return 90 + 100 + 0 - fine;
// }
// }
// console.log(marks.totalMarks(50)); // 140



// let obj ={
//     en:30,
//     ma:34,
//     hin:3


// }

// for(let key in obj){
//     console.log(key)
//     console.log(obj[key])
// }

// let arr = [90, 80, 30, 60, 10];
// for (let i = 0; i < arr.length; i++) {
// if (arr[i] < 33) {
// continue;
// }
// console.log(arr[i]);
// }


// {
//     console.log("hello")
// }

// let arr = [120, 'Hello', 90, false, 'World', true, 20, 80, 'Messi'];

// function getNumber(arr){
//     let result  = []

//     for(let item of arr){
//         if(typeof item === 'number'){
//             result.push(item)

//         }
//     }
//     return result
// }
// function getString(arr){
//     let result  = []

//     for(let item of arr){
//         if(typeof item === 'string'){
//             result.push(item)

//         }
//     }
//     return result
// }
// function getBoolean(arr){
//     let result  = []

//     for(let item of arr){
//         if(typeof item === 'boolean'){
//             result.push(item)

//         }
//     }
//     return result
// }




// let newarr = (getString(arr), getNumber(arr), getBoolean(arr),}


// arr = [120, 'Hello', 90, false, 'World', true, 20, 80, 'Messi'];

// function seprateTypes(arr){
//     let numbers = []
//     let string = []
//     let booleans = []


//     for(let item of arr){
//         if(typeof item === "number") numbers.push(item)
//         else if(typeof item === "string") string.push(item)
//         else if(typeof item === "boolean") booleans.push(item)
//     }

//     return {numbers , string , booleans}
// }

// console.log(seprateTypes(arr))


// arr = [120, 'Hello', 90, false, 'World', true, 20, 80, 'Messi'];

// function getString(item){
//     return typeof item === "string"
// }

// function getBoolean(item){
//     return typeof item === "number"
// }

// function getNumber(item){
//     return typeof item === "boolean"
// }

// function get(arr,fn){
//     let result  = []

//     for(let item of arr){
//         if(fn(item)){
//             result.push(item)
//         }
//     }
//     return result
// }

// console.log(get(arr,getNumber))
// console.log(get(arr,getBoolean))
// console.log(get(arr,getString))


// let players = ['Messi', 'Ronaldo','zlatan']

// players.forEach(function (element ,index)  {
//     console.log(`${element} at index ${index}`)
// });


// let marks = [1, 2, 3, 4, 5, 6, 7, 8];

// console.log(marks.map((item)=>{
//      if(item % 2 === 0) return true;
//       else return false}
//     ))

// // let marks = [1, 2, 3, 4, 5, 6, 7, 8];

// console.log(marks.filter((item)=>{
//      if(item % 2 === 0) return true;
//       else return false}
//     ))


// console.log(marks.reduce((item)=>{
//      if(item % 2 === 0) return true;
//       else return false}
//     ))


function counter(){
    let count =0;

    return {
        getCount: function(){
            return count;
        },


        increment:function(){
            count+=1
        },

        decrement: function(){
            count-=1
        },

        reset: function(){
            count =0 
        }
    }
}

let counter1 = counter()
console.log(counter().getCount())
counter().increment()
counter().increment()
counter().increment()
counter().increment()
// counter.decrement()
// counter.decrement()
// counter.decrement()
console.log(counter().getCount())