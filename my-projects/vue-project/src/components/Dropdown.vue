<!--
  Component filho que contem um tipo de filtro
-->

<template>
    <div>
    <select 
            v-model="selectedOption"
            v-on:input="event => { $emit('input', event.target.value) }">
       <option v-for="(option, name) in options" v-bind:value="option" v-bind:key="name" >{{ name }}</option>
    </select>
  </div>
</template>

<script>
export default {
    data () {
      return {
        selectedOption: null
      }
    },
    
    // we need to factor out the options into a prop. The available options will be provided to the Dropdown component by its parent component
    props: {
        // recebe the valeu when the evento change
        value: null,
        options: {
            type: Object,
            required: true      
        }
    },

    // Ensure that the controls in your component reflect this value when mounted and when the value of the prop changes

    mounted () {
        this.selectedOption = this.value
    },

    //  reagir a alterações de dados
    watch: {
        value: function (newValue) {
            this.selectedOption = newValue
        }
    }
}
</script>

<style>

</style>
