
<template>
    <div class="container">
        Users Page 

        <ul>
            <li v-for="user in users" v-bind:key="user.id">
                <span>{{ user.pessoa.nome }}</span>
            </li>
        </ul>
    </div>    
</template>

<script>
    

    export default {

        data: function () {
            return {
                users: []
            }
        },

        methods:{
            getUsers() {
                const {data} = axios.get('http://localhost:8080/acervus-services/public/users/')
                return {users:data}
            }
        },

        beforeCreate(){
            this.getUsers()
        }
    }
</script>

<style>

</style>
      