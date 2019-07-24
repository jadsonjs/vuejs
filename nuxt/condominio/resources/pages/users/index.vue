<template>
    <div class="container">
        Users Page 

        <ul>
            <li v-for="user in users" v-bind:key="user.id">
                <span>{{ user.pessoa.nome }}</span>
            </li>
        </ul>
        
        <input type="button" class="primary" value="Salvar Usuario" v-on:click="saveUser()"> 

    </div>    
</template>

<script>
    
    import axios from 'axios'

    export default {

        data: function () {
            return {
                users: [],
                user: { "id": 3, "pessoa": { "id": 3, "nome": "Joao"} }
            }
        },

        methods:{
            saveUser(){
               axios.post('http://localhost:8080/acervus-services/public/users/', this.user )
            }
        },

        //  asyncData is called every time before loading the page component. It will be called server-side once
        // (on the first request to the Nuxt app) and client-side when navigating to further routes. 
        async asyncData ({ params }) {
            let { data } = await axios.get('http://localhost:8080/acervus-services/public/users/')
            return { users: data }
        },


    }
</script>

<style>

</style>
      