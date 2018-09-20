<template>
  <div class="card">
    <header class="card-header">
      <p class="card-header-title has-text-left">
       {{hoje}}
      </p>
      <div class="has-text-right">
        <p class="card-header-title">  {{tarefas.length}} tarefas </p>
      </div>
    </header>
    <div class="card-content">
      <div class="content">
        
           <!-- we listen to the event and call the function to add a new task -->
           <novo-todo v-on:novaTarefa="adicionarTarefa"></novo-todo>

      </div>
      <div class="content">
        
          <!--
          you must have access to the todo array of the parent component (TodoCard). For this we can use properties (props) that are custom attributes and serve to pass data between parent and child components.

          -->
          
          <todo-list v-bind:tarefas="tarefas" v-on:check="checkTarefa" v-on:remover="removerTarefa"></todo-list>

      </div>
    </div>
  </div>
</template>

<script>

  import NovoTodo from './NovoTodo'
  import TodoList from './TodoList'

  // the name of component, use as <todo-card> </todo-card>
  export default {
    name: 'todo-card',

    components: {
      NovoTodo,
      TodoList
    },

    data () {
      return {
        dias: ['Domingo', 'Segunda', 'Terça', 'Quarta', 'Quinta', 'Sexta', 'Sábado'],
        meses: ['Janeiro', 'Fevereiro', 'Março', 'Abril', 'Maio', 'Junho', 'Julho', 'Agosto', 'Setembro', 'Outubro', 'Novembro', 'Dezembro'],
        tarefas: []
      }
    },

    computed: {
      hoje: function() {
        let novaData = new Date()
        return `${this.dias[novaData.getDay()]}, ${novaData.getDate()} de ${this.meses[novaData.getMonth()]}`
      }
    },

     methods: {
        adicionarTarefa(tarefa) {
          let nova_tarefa = {'description': tarefa, 'checked': false}
          this.tarefas.push(nova_tarefa)
        },

        // we used the index received in the event to identify the task in our array and then we changed the 
        // checked value to the inverse of what it was.
        checkTarefa(index) {
          this.tarefas[index]['checked'] = !this.tarefas[index]['checked']
        },

        removerTarefa(index){
            this.tarefas.splice(index, 1)
        }
      }

  }
</script>

<style>
.card {
  border-radius: 10px;
}
.card-header-title {
  color: #636368;
}
</style>