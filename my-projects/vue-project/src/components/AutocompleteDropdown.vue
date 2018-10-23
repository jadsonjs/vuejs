<!--
  Component filho que contem filtro autocomplete
-->

<template>
    <div class="dropdown" v-bind:class="{'open' : open}">

        <input type="text" 
            v-bind:placeholder="placeholder"
            v-model="searchText" 
            v-on:input="searchChanged"
            v-on:keydown.enter="suggestionSelected(matches[highlightIndex])"
            v-on:keydown.down="down"
            v-on:keydown.up="up"
            v-on:keydown.esc="setOpen(false)"
            v-on:blur="setOpen(false)"
        />

        <a class="toggle" v-on:mousedown.prevent v-on:click="setOpen(!open)">
            <span class="arrow-up">▲</span>
            <span class="arrow-down">▼</span>
        </a>
        
        <ul class="suggestion-list">
            <li v-for="(suggestion) in matches" v-on:click="suggestionSelected(suggestion)" v-bind:key="suggestion.value">
                {{ suggestion[0] }}
            </li>
        </ul>

    </div>
</template>

<script>
export default {
    data () {
      return {
        searchText: '',
        selectedOption: null,
        open: false,
        highlightIndex: 0
      }
    },

    props: {
        value: null,
        options: {
            type: Object,
            required: true      
        },
        placeholder: {
            type: String,
            default: 'Enter'
        }
    },

    computed: {
        // Next, we need a way for the component to determine which, if any, of the available options match the supplied search text.
        // We can do this with a computed property that filters an array of options based on some criteria. 
        matches () {
            // percorre a lista e se der match, adiconar a lista retornado
            return Object.entries(this.options).filter((option) => {
                var optionText = option[0].toUpperCase()
                return optionText.match(this.searchText.toUpperCase())
            })

            /*
            var optionArray = []
                
            
            for (var key in this.options) {
                if (has(this.options, key) && isEnumerable(this.options, key)) {
                    optionArray.push([key, this.options[key]]);
                }
            }

            return optionArray.filter((option) => {
                var optionText = option[0].toUpperCase()
                return optionText.match(this.searchText.toUpperCase())
            })
            */

        }
    },
    
    methods:{
        
        setOpen (isOpen) {
            this.open = isOpen

            if (this.open) {
                this.$refs.searchText.focus()
            }
        },

        searchChanged () {
            if (!this.open) {
                this.open = true
            }
            this.highlightIndex = 0
        },

        // Close the suggestion list
        // Set the text in the search box to match the selected value’s text label
        // Emit an input event from our component with the selected value
        suggestionSelected (suggestion) {
            this.open = false
            this.searchText = suggestion[0]
            this.$emit('input', suggestion[1])
        },

        up () {
            if (this.open) {
                if (this.highlightIndex > 0) {
                this.highlightIndex--
                }
            } else {
                this.setOpen(true)
            }
        },

        down () {
            if (this.open) {
                if (this.highlightIndex < this.matches.length - 1) {
                this.highlightIndex++
                }
            } else {
                this.setOpen(true)
            }
        }
    }
    
}
</script>

<style>

.dropdown {
  display: inline-block;
  position: relative;
}

.suggestion-list {
  background-color: rgba(255, 255, 255, 0.95);
  border: 1px solid #ddd;
  list-style: none;
  display: block;
  margin: 0;
  padding: 0;
  width: 100%;
  overflow: hidden;
  position: absolute;
  top: 20px;
  left: 0;
  z-index: 2;
}

.dropdown.open .suggestion-list {
  display: block;
}

.dropdown .suggestion-list {
  display: none;
}

.toggle .arrow-up {
  display: none;
}

.open .toggle .arrow-up {
  display: inline-block;
}

.open .toggle .arrow-down {
  display: none;
}

.suggestion-list li {
  cursor: pointer;
}

.suggestion-list li:hover {
  color: #fff;
  background-color: #ccc;
}

.active  {
  color: #fff;
  background-color: #42b983;
}

</style>
