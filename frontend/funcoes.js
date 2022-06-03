async function cadastrar() {
    const id = document.getElementById("id").value;
    const nome = document.getElementById("nome").value;
    const tipo = document.getElementById("tipo").value;
    const poder = document.getElementById("poder").value;
    const nota = Number(document.getElementById("nota").value);
    let dado;
    let metodo;

    if (id) {
        metodo = 'PUT';
        dado = {
            id, nome, tipo, poder, nota
        };
    } else {
        metodo = 'POST';
        dado = {
            nome, tipo, poder, nota
        };
    }

    await fetch('http://localhost:8080/pokemon', {
        method: metodo,
        body: JSON.stringify(dado),
        headers: { "Content-Type": "application/json; charset=UTF-8" }
    })
        .then(resposta => alert('Cadastro foi realizado com sucesso!'))
        .catch(error => alert(error))

    consultar();
}

async function consultar() {
    let dados = await fetch('http://localhost:8080/pokemon')
        .then(response => response.json())
        .catch(error => alert(error));

    let resposta = '';
    dados.map(dado => {
        resposta += `<tr>
                        <td>${dado.nome}</td>
                        <td>${dado.tipo}</td>
                        <td>${dado.poder}</td>
                        <td>${dado.nota}</td> 
                        <td> <i onClick='remove(${dado.id})' class='bi bi-trash'></i> </td> 
                        <td> <i onClick='atualiza(${dado.id},"${dado.nome}", "${dado.tipo}", "${dado.poder}", ${dado.nota})' class='bi bi-pencil'></i> </td> 
                    </tr>`;
    });

    document.getElementById("conteudoTabela").innerHTML = resposta;
}

async function remove(id) {
    let confirma = confirm('Confirmar exclusão do pokemon?');
    if (confirma) {
        await fetch(`http://localhost:8080/pokemon/${id}`, {
            method: 'DELETE'
        })
            .then(resposta => {
                alert('Pokemon excluido com sucesso');
                consultar();
            })
            .catch(error => alert(`Problema de remoção`));
        ;
    }
}

function atualiza(id, nome, tipo, poder, nota) {
    document.getElementById("id").value = id;
    document.getElementById("nome").value = nome;
    document.getElementById("tipo").value = tipo;
    document.getElementById("poder").value = poder;
    document.getElementById("nota").value = nota;
}

const botaoConsultar = document.getElementById("consultar");
botaoConsultar.addEventListener("click", consultar);
const botaoCadastrar = document.getElementById("cadastrar");
botaoCadastrar.addEventListener("click", cadastrar);
