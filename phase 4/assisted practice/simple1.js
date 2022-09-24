function Car(id){
    let message='starting....';
    let StratFn= function turnKy()
    {
       
        let message='override';
        console.log(message);
    };
    StratFn();
    console.log(message);
}Car(123);
