//POSIÇÕES DOS CARROS
// let xCarros = 580;
// let xCarros2 = 580; 
// let xCarros3 = 580; 
let xCarros = [700, 700, 700, 700, 700, 700]
let comprimentoCarros = 40; 
let alturaCarros = 30;
let yCarros = [50, 100, 150, 210, 270, 320]
let velocidadeCarros = [6, 5, 4, 6, 4, 7]


function mostrarCarros() {

    for (let i = 0; i < imagensCarros.length; i++) {
        
        image(imagensCarros[i], xCarros[i], yCarros[i], comprimentoCarros, alturaCarros);
    }
}
    /*
    image(imagemDoCarro01, xCarros, 40, comprimentoCarros, alturaCarros);
    image(imagemDoCarro02, xCarros2, 100, 100, 40);
    image(imagemDoCarro03, xCarros3, 150, 100, 40)
}*/

//MOVIMENTAÇÃO
function movimentoCarro() {
   for (let i = 0; i < imagensCarros.length; i++) {
    xCarros[i] -= velocidadeCarros[i];

    if (xCarros[i] < -50) {
        xCarros[i] = 700
    }
   }

}

