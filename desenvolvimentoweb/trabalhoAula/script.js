$(document).ready(function () {
  $("#addprod").click(function () {
    // pega os valores
    let nome = $("#nome-produto").val();
    let preco = $("#botao").val();
    let fileInput = $("#arquivo")[0];

    // valida imagem
    if (fileInput.files.length === 0) {
      alert("Selecione uma imagem!");
      return;
    }

    let file = fileInput.files[0];
    let reader = new FileReader();

    reader.onload = function (e) {
      let imgURL = e.target.result; // base64 da imagem
      
      let categoria = $("#categs").val()
      // adiciona o item no UL
      $("#lista-itens").append(`
            <li class="produto-${categoria}">
                <p>
                    <img src="${imgURL}" width="100"><br>
                    Nome: ${nome}<br>
                    Preço: R$ ${preco}<br>
                    <a href="#" class="remover">Remover</a>
                </p>
            </li>
            `);
      $("#nome-produto").val("");
      $("#botao").val("");
      $("#arquivo").val("");
    };

    reader.readAsDataURL(file);
  });

  // Remover item
  $("#lista-itens").on("click", ".remover", function (e) {
    e.preventDefault();
    $(this).closest("li").remove()
  })

  $("#categoria").change(function () {
    const categoria = $(this).val();

    if (categoria === "todos") {
      // Mostra todos os produtos
      $("[class^='produto-']").show();
    } else {
      // Esconde todos
      $("[class^='produto-']").hide();
      // Mostra apenas os da categoria selecionada
      $(".produto-" + categoria).show();
    }
  });
});
