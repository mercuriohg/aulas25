$(document).ready(function(){
    $('#button').click(function(){
        textopeso = $("#texto-peso").val();
        textoalt = $("#texto-alt").val();

        calculo = textopeso / (textoalt*textoalt);
        if (calculo < 18.5){
            $("#msg").text("Você está abaixo do Peso: " + calculo.toFixed(2));
        } else if (calculo >= 18.5 && calculo <= 24.9){
            $("#msg").text("Seu Peso está normal: " + calculo.toFixed(2));
        } else if (calculo >= 25 && calculo <= 29.9){
            $("#msg").text("Você está com Sobrepeso: " + calculo.toFixed(2));
        }  else if (calculo >= 30 && calculo <= 34.9){
            $("#msg").text("Você está com Obesidade Grau I: " + calculo.toFixed(2));
        } else if (calculo >= 35 && calculo <= 39.9){
            $("#msg").text("Você está com Obesidade Grau II: " + calculo.toFixed(2));
        } else if (calculo >= 40){
            $("#msg").text("Você está com Obesidade Grau III: " + calculo.toFixed(2));
        }
    });

    
});