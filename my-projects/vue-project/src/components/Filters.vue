<!--
    Teste reuso de components vue
    A parent component, Filters.vue
-->
<template>
    <div class="filters">

    <!-- Our various filter implementations will go here -->

     <!-- The simplest approach  with v-model atribute
    <div class="filter">
    <label for="basic-dropdown">Basic dropdown: </label>
    <select name="basic-dropdown" v-model="selectedFruit">
        <option>Apple</option>
        <option>Banana</option>
        <option>Blueberry</option>
        <option>Kiwi</option>
        <option>Pear</option>
        <option>Pineapple</option>
        <option>Watermelon</option>
    </select>
    </div>
    -->

    <!-- Include de children component -->
    <dropdown id="component-dropdown" v-bind:options="fruitOptions" v-model="selectedFruit"></dropdown>


    <div class="result">
      Selected: <strong>{{ selectedFruit }}</strong>
    </div>


    <!-- Include auto complete component -->
    <autocomplete-dropdown id="autocomplete-dropdown" 
            v-bind:options="fruitOptions" 
            v-model="selectedFruit" 
            placeholder="Enter a fruit name" />
  

  </div>
</template>

<script>

import Dropdown from '@/components/comum/Dropdown'
import AutocompleteDropdown from '@/components/comum/AutocompleteDropdown.vue'

export default {

    components: {
        'dropdown': Dropdown,
        'autocomplete-dropdown': AutocompleteDropdown
    },

    data () {
        return {
            selectedFruit: 'Apple',
            
            // define the 'options' of children component
            fruitOptions: {
                'Apple': 'Apple',
                'Banana': 'Banana',
                'Blueberry': 'Blueberry',
                'Kiwi': 'Kiwi',
                'Pear': 'Pear',
                'Pineapple': 'Pineapple',
                'Watermelon': 'Watermelon'
            }
        }
    }
}
</script>

<style>
.filters {
  width: 800px;
  margin: 0 auto;
}

.filter {
  text-align: left;
}

.result {
  margin-top: 30px;
  text-align: left;
}

label {
  display: block;
}
</style>
