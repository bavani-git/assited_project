function startCar ( carId ) {
    let message  = 'Starting...';
    //nested fn
    let startFn = function turnKey() {
        console.log(message); // 'Starting...'
    };
    startFn();
}
startCar(123);