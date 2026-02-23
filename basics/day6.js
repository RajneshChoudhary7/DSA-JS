// class Person {
//     constructor(fn,ln,email){
//         this.fn = fn
//         this.ln = ln
//         this.email = email
//     }

const { use } = require("react");

//     getfullname(){
//         return `${this.fn} ${this.ln}`
//     }
// }

// class Student extends Person {

// }



// const person1 = new Person("rajnesh","king","rajnesh@gmailcom")
// console.log(person1)
// console.log(person1.getfullname())


// const student1 = new Student("nabeel","roza","nabeel@gmailcom")

// console.log(student1.getfullname())


// console.log(++)

// function outer(){
//     let money = 100

//     function inner(){
//         console.log("money is ", money)
//     }
//     return inner
// }


// let mufun = outer()
// mufun();

// hello();
// console.log(cin)

// function hello() {
//   console.log("Hello!");
// }

// var cin = "hello"

// console.log("start")


// setTimeout(()=>{
//     console.log("timeout")
// },0)

// console.log("end ")


// console.log(func1());
// // console.log(func2());

// function func1() {
//     return "Function declaration";
// }

// var func2 = function() {
//     return "Function expression";
// };

// var x = 10;

// function test() {
//     if (true) {
//         var x = 20;
//     }
//     console.log(x);
// }

// test();
// console.log(x);


// console.log("1")


// setTimeout(() => {
//     console.log("2")

// }, 0);

// Promise.resolve().then(()=>console.log("3")).then(()=>console.log("4"))

// console.log("5")

// var x = 100

// {
//     var x = 500
// }

// let a = x
// {
//     let a = 1000
// }

// console.log(a)

// console.log(+"1" + +"1" + "2")


// obj = {
//     a:"rajnesh",
//     b:23
// }

// let shallowcpy = {...obj}
 
// console.log(obj)
// console.log(shallowcpy)
// let str = JSON.stringify(obj)
// console.log(str)


const user = {
  name: "Rajnweresh",
    city: "sdf",
    skills: ["Reacsdfsdft", "Nosdfde"]

};
const user1 = {
  name: "Rajnesh",
    city: "Betul",
    skills: ["React", "Node"]
  
};

let result  = {...user , ...user1}
console.log(result)

// // Shallow copy using spread operator
// const copyUser = { ...user };

// copyUser.name = "Raju"; 
// console.log(user.name); // "Rajnesh" (safe change)

// // But if we change nested object
// copyUser.details.city = "Bhopal";
// console.log(user.details.city); // "Bhopal" (nested object also changed!)


function createUser() {
  let user = { name: "Raj" };

  return function() {
    user.name = "Aman";
    return user;
  };
}

const update = createUser();
console.log(update());
