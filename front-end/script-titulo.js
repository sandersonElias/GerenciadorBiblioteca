const form = document.querySelector(".form");
const input = form.querySelector(".input");
const resultadosDiv = document.querySelector(".result");

form.addEventListener("submit", function (event) {
  event.preventDefault();

  const titulo = input.value.trim();

  if (titulo !== "") {
    buscarLivroPorTitulo(titulo);
  }
});

function buscarLivroPorTitulo(titulo) {
  fetch(
    `http://localhost:8080/livro/buscar/titulo?titulo=${encodeURIComponent(
      titulo
    )}`,
    {
      method: "GET",
      headers: {
        Accept: "application/json",
      },
    }
  )
    .then((response) => {
      if (!response.ok) {
        throw new Error("Erro ao buscar livro por título");
      }
      return response.json();
    })
    .then((data) => {
      resultadosDiv.innerHTML = "";

      if (Array.isArray(data) && data.length > 0) {
        data.forEach((livro) => {
          const div = document.createElement("div");
          div.innerHTML = `
          <strong>Título:</strong> ${livro.titulo}<br>
          <strong>Editora:</strong> ${livro.editora}<br>
          <strong>Localização:</strong> ${livro.localizacao}<br>
          <strong>Quantidade:</strong> ${livro.quantidadeDisponivel} de ${livro.quantidadeTotal}<br>
          <hr>
        `;
          resultadosDiv.appendChild(div);
        });
      } else {
        resultadosDiv.textContent = "Nenhum livro encontrado.";
      }
    })
    .catch((error) => {
      resultadosDiv.textContent = "Erro ao buscar livro.";
      console.error(error);
    });
}
