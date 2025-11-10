$(document).ready(function(){
    $('#addprod').click(function(){
        arq = $('#arquivo').val()
        item1 = $('#nome-produto').val()
        item2 = $('#botao').val()

        $("#lista-itens").append(`<li> <img src='${arq}'>` +  item1 + item2  + `<a href=''> Remover </a></li>`)
    })
})