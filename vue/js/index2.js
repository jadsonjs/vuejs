

/**
 *  O primeiro trecho de código cria os valores em JSON que usaremos para
 *  substituir as marcações em chaves duplas {{}} no HTML.
 *
 */

var data = {
   livros: ['Orange is The New Black - Piper Kerman', 'A Origem das Espécies - Charles Darwin'],
   titulo: 'Livros 2'
 };


/**
 * Agora, em vez de um vetor de strings, temos um vetor
 * de objetos {}, os quais têm propriedades ( titulo,  autor e  checked)
 */
var data2 = {
 livros: [{ titulo: 'Orange is The New Black', autor: 'Piper Kerman', checked: true },
        { titulo: 'A Origem das Espécies', autor: 'Charles Darwin', checked: false }],
 cabecalho: 'Livros Preferidos',
 novoLivro: '',
 novoAutor: ''
};


/**
 *  O segundo,  new Vue(), instancia um objeto simples do Vue.js através de um seletor (o  id da  div que servirá
 *  como container para os elementos Vue) e dos dados propriamente ditos.
 */
new Vue({
   el: '#app',
   data: data
 });


 new Vue({
    el: '#app2',
    data: data2,

   // Dando continuidade, precisamos adaptar a estrutura do nosso objeto  Vue
   // para se adequar ao novo jeito de adicionar livros na listagem HTML

    methods: {
           addLivro: function () {
             var titulo = this.novoLivro.trim();
             var autor = this.novoAutor.trim();
             if (titulo && autor) {
               this.livros.push({
                 titulo: titulo,
                 autor: autor,
                 checked: false
               });
               this.novoLivro = '';
               this.novoAutor = '';
             }
           }
         }

  });
