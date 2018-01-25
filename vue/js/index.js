

/**
 * essa é a função do jQuery responsável por executar o código interno a ela sempre
 * que toda a página tiver terminado de carregar, em alusão ao já conhecido evento
 * onLoad da tag <body>
 *
 *  essa função será responsável por lidar com a adição de novos livros à lista diretamente no
 *  HTML, usando, para isso, o jQuery e suas funções de manipulação do DOM.
 *
 */
$(document).ready(function() {
       /**
        * Add evento de click
        */
       function onAdd() {
             var $ul, li, $li, $label, $div, livro;

             // recuperamos o valor digitado no campo de texto de classe CSS js-novo-livro;
             livro = $('.js-novo-livro').val();

             // valida se “livro” está vazio
             if (livro === '') {
                    return;
             }

			      /*
			       * reproduzimos os mesmos elementos de lista HTML que temos nos livros
			       * já adicionados, apenas usando seletores e funções do jQuery
			       */
             $ul = $('ul');
             $li = $('<li>').appendTo($ul);
             $div = $('<div>')
                    .addClass('checkbox')
                    .appendTo($li);

             $label = $('<label>').appendTo($div);
             $('<input>')
                    .attr('type', 'checkbox')
                    .addClass('js-livro')
                    .attr('name', 'list')
                    .click(toggleRemovido)
                    .appendTo($label);

             $label.append(livro);

             // limpamos o campo de texto para futura digitação
             $('.js-novo-livro').val('');
       }

       /**
        * Evento de click do checkbox
        */
       function toggleRemovido(ev) {
             var $el;
             $el = $(ev.currentTarget);
             $el.closest('li').toggleClass('removido');
       }

       $('.js-add').click(onAdd);
       $('.js-livro').click(toggleRemovido);
   });
