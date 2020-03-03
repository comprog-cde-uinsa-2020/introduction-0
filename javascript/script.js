console.log("test");
alert("test");
function Hitung(dat1,dat2,dat3,dat4){
   var total = dat1 + dat2 + dat3 + dat4;

   var totalrat = total / 4;

   return totalrat;
}


function InputData(Bilangan){
   var data = parseFloat(document.getElementById(Bilangan).value);

   return data;
}

function Output(data){
   document.getElementById("rata_rata").innerHTML = data;
}

function Ratarata(){

   //Input
   var dat1 = InputData("indo");
   var dat2 = InputData("ing");
   var dat3 = InputData("mat");
   var dat4 = InputData("ipa");

   //Proses
   var ratarata = Hitung(dat1,dat2,dat3,dat4);

   console.log(ratarata);

   //OutPut
   Output(ratarata);
   alert(document.getElementById(nama));
}