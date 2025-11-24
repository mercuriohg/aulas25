$(document).ready(function () {
  $("#addprod").click(function () {
    // pega os valores
    let nome = $("#nome-produto").val();
    let preco = $("#botao").val();
    let fileInput = $("#arquivo")[0];

    // Valida imagem
    if (fileInput.files.length === 0) {
      alert("Selecione uma imagem!");
      return;
    }

    // Valida o campo de preço
    if (isNaN(preco) || preco.trim() === "") {
      alert("O preço deve ser um número válido!");
      return;
    }

    let file = fileInput.files[0];
    let reader = new FileReader();

    reader.onload = function (e) {
      let imgURL = e.target.result; // base64 da imagem
      let categoria = $("#categs").val();

      // Adiciona o item no UL
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

      // Limpa os campos
      $("#nome-produto").val("");
      $("#botao").val("");
      $("#arquivo").val("");
    };

    reader.readAsDataURL(file);
  });

  // Remover item com confirmação
  $("#lista-itens").on("click", ".remover", function (e) {
    e.preventDefault();

    // Confirmar remoção
    if (window.confirm("Tem certeza de que deseja remover este item?")) {
      $(this).closest("li").remove();
    }
  });

  // Filtro por categoria
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
