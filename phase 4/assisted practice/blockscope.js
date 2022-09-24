let message1='the value is';
if(1==1){
    var message='true';//global scope..
}
console.log(message1);
console.log(message);

// let message='outside';
// if(1==1){
//     let message='true';//global scope..
//     console.log(message);
// }
// console.log(message); ------true outside


// let message='outside';
// if(1==1){
//     var message='true';//global scope..
//     console.log(message);
// }
// console.log(message);----true true