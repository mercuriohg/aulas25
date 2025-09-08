$(document).ready(function(){
    $("#box-input").click(function(){
        // Função val: Pega o valor de um campo de Formulário;
        // Val também pode alterar o valor.
        textouser = $("#box-text").val();
        textosenha = $("#box-password").val();
        window. alert("Sua senha é: " + textosenha)
 
    });

});