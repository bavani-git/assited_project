let o={
    id:123,
    getid:function(){
        return this.id;
    }
};
 let newcar={id:456};

 console.log(o.getid.call(newcar));

 console.log(o.getid.apply(newcar,['id: ']));