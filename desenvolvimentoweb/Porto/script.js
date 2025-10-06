$(document).ready(function () {
    $("#buttonins").click(function () {
        item = $("#caixadeform").val()
        $("#lista").append("<li>" +item+ "<a href=''> Remover </a></li>")
        contador = $("#lista li").length
        $("#quant").text(contador)
        
        
    })
    //Seletor descendente para pegar a tag de link "a" no id de lista.
    //ON funciona como onclick
    $("#lista").on("click", "a", function(e){
      e.preventDefault();   
      $(this).parent().remove()
      quant = $("#lista li").length
      $("#quant").text(quant    )
    })
})