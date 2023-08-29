//POSIÇÃO DO MASCOTE
let xMascote = 70;
let yMascote = 360;
let meusPontos = 0; 
let colisao = false; 



function verificaColisao() {

    for (let i = 0; i < imagensCarros.length; i++) {

    colisao = collideRectCircle(xCarros[i], yCarros[i], comprimentoCarros, alturaCarros, xMascote, yMascote, 50); 

    }

    print('Colisão acontecendo', colisao); 
}

function mostrarMascotes() {
    image(imagemDoMascote, xMascote, yMascote, 40, 40); //O IMAGE PERMITE MANIPULAR O OBJETO NO EIXO X E Y COMO TAMBEM W e H 

    
}

function incluirPontos() {
    text(meusPontos, 20, 25)
    fill(color(255, 0 ,0))
    textSize(21)

    if (yMascote < 0) {
        yMascote = 360; 
        meusPontos ++
    }
}

function excluirPontos() {
   if (colisao) {
    yMascote = 360; 
    if (meusPontos > 0) {
        meusPontos -= 1;
    }
   }
}


//MOVIMENTAÇÃO
function movimentoMascote() {
    
    if (keyIsDown(UP_ARROW)){ /*DEU UMA CONDIÇÃO QUE SE VC FOR APERTA ULGUMA TECLA VAI ACONTECER ALGUMA ENT VC TEM QUE DECLARAR QUAL É A TECLA DELA*/
        yMascote -=3;
    } 

    if (keyIsDown(DOWN_ARROW)) {
        yMascote +=3; 
    }
 
}

