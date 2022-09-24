// let fn= function(){
//     console.log(this===window);
// }
// fn();

let o={
    id:123,
    getid:function(){
        return this.id;
    }
};
console.log(o.getid());