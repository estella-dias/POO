
//NA FUNÇÃO SETUP DEFINIMOS AS CONFIGURAÇÕES DE LARRGURA E ALTURA
function setup() {
    
    createCanvas(700, 400);
    
}

//NA FUNÇÃO DRAW DEFINIMOS O QUE SERA EXIBIDO
function draw() {
    
    background(imagemDaEstrada);
    movimentoCarro(); 
    movimentoMascote();
    mostrarCarros();
    mostrarMascotes();
    incluirPontos();
    verificaColisao();
    excluirPontos(); 
}


