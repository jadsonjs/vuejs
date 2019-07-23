
<template>
    <div class="container">
        <section>Adm Page</section>

        <ul>
            <li v-for="user in users" v-bind:key="user.id">
                <input type="checkbox" :checked="user.done" @change="toggle(user)">
                <span :class="{ done: ! user.active }">{{ user.name }}</span>
            </li>
            <li> <input placeholder="User name?" @keyup.enter="addUser"> </li>
        </ul>

    </div>    
</template>

<script>

import { mapMutations } from 'vuex'

export default {
    layout: 'blog',

    computed: {
        users () {
            return this.$store.state.users.users
        }
    },
    methods: {
        addUser (e) {
            this.$store.commit('users/add', e.target.value)
            e.target.value = ''
        },
        ...mapMutations({
            toggle: 'users/toggle'
        })
    }

}
</script>

<style>
    .done {
        text-decoration: line-through;
    }
</style>
      