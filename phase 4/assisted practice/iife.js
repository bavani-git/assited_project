// IIFE--------Immediately invoked fuction expression
// (function(){
//     console.log('in Fuction')
// })();

let app=(function (){

    let id=123;
    console.log('inline .....'+id);
    return {};
})();
console.log(app);