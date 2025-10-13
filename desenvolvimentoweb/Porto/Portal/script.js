// Aguarda todo o documento (HTML) ser carregado antes de executar o script
$(document).ready(function () {

    // Quando o botão com id "buttonins" for clicado...
    $("#buttonins").click(function () {

        // Captura o valor digitado na caixa de texto com id "caixadeform"
        item = $("#caixadeform").val()

        // Adiciona um novo <li> na lista <ul id="lista">,
        // contendo o texto digitado e um link "Remover"
        $("#lista").append("<li>" + item + "<a href=''> Remover </a></li>")

        // Conta quantos <li> existem dentro da lista (quantidade de itens)
        contador = $("#lista li").length

        // Atualiza o número dentro da tag <span id="quant"> com a quantidade atual de itens
        $("#quant").text(contador)
    })

    // -----------------------------------------------
    // Aqui vem a parte responsável por remover itens
    // -----------------------------------------------

    // Usa o método .on() para "escutar" cliques em links <a> dentro da lista (#lista)
    // Mesmo que esses links sejam adicionados dinamicamente
    $("#lista").on("click", "a", function(e){

        // Impede o comportamento padrão do link (recarregar a página)
        e.preventDefault();

        // Remove o elemento <li> pai do link clicado
        $(this).parent().remove()

        // Reconta quantos <li> ainda restam na lista
        quant = $("#lista li").length

        // Atualiza o contador novamente no <span id="quant">
        $("#quant").text(quant)
    })

    // Mostrar/esconder produtos
    $("#categ").change(function () {
        const categoria = $(this).val()

        if (categoria === "todos") {
            // Mostra todos os produtos
            $("[class^='produto-']").show()
        } else {
            // Esconde todos
            $("[class^='produto-']").hide()
            // Mostra apenas os da categoria selecionada
            $(".produto-" + categoria).show()
        }
    })
})
