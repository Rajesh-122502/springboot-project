function clicked(){
    console.log('clicked');
}

container.addEventListener('click', function(){console.log('clicked on container')});
// secondcontainer.addEventListener('mouseover', function(){console.log('mouse on container')});

doLog= ()=> {
    console.log('hi');
}

setTimeout(doLog, 3000);

// setInterval(doLog, 3000);