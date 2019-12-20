


Vue.component('button-counter', {
  data: function () {
    return {
      count: 0
    }
  },
  methods:{
    increment() {
        this.count++
    }
  },

  template: '<button v-on:click="increment()">You click me {{ count }} times.</button>'
})
