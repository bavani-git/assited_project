let o={
    id:123,
    getid:function(){
        return this.id;
    }
};
let newcar={id:456};

let newfn=o.getid.bind(newcar);

console.log(newfn());