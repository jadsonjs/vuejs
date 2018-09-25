<template>
  <div id="app">
  <p> {{ $store.state.a.count }} {{ evenOrOdd }} </p>
  <p>
    <button v-on:click="increment">+</button>
    <button v-on:click="decrement">-</button>
  </p>
</div>
</template>

<script>

import { mapGetters } from 'vuex'

export default {
  name: 'app',

  methods: {
    increment () {
        this.$store.commit('increment')
    },
    decrement () {
        this.$store.commit('decrement')
    }
  },
 
  computed: mapGetters(['evenOrOdd']) 

  
}
</script>

<style>

</style>
