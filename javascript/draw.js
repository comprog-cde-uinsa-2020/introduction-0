alert("holla");

function drawrect(s) {
    
    var canvas = document.getElementById('can_circle');
    var size = s;
    
    if (canvas.getContext) {
    
        var context = canvas.getContext('2d');
        context.beginPath();
        context.fillRect(100, 100,size,size);
        context.stroke();
    }
}

function drawcircle(r) {
    var canvas = document.getElementById('can_circle');
    var size = r;
    
    if (canvas.getContext) {
    
        var context = canvas.getContext('2d');

        context.beginPath();
        context.arc(100, 100, 20, 0*Math.PI, size*Math.PI);
        context.stroke(); 
    }
}

function getsize(id){
    return parseFloat(document.getElementById(id).value);
}

function drawall() {
    let srec = getsize("rect");
    let scir = getsize("circle");
    
    // console.log(srec, scir);

    drawrect(srec);
    drawcircle(scir);
}