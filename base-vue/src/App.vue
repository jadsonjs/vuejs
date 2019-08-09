<template>
  <div id="app">
    <div class="d-flex" v-bind:class="{ toggled: isToggled }" id="wrapper">
        
        <side-bar></side-bar> 

        <!-- Page Content -->
        <div id="page-content-wrapper">
          
          <app-header v-on:toggled="toggleSideBar()"> </app-header>  
              
          <!-- Include the Router component, by default Home.vue  -->
          <router-view/>
              
        </div>

    </div>

  </div>
</template>

<script>

  import AppHeader from  './layout/AppHeader.vue'
  import SideBar from './layout/SideBar.vue'

  export default {
    name: 'app',
    components: {
      AppHeader,
      SideBar,
    },
    data () {
      return {
        // if side bar is show or not
        isToggled: false
      }
    },
    methods:{
        toggleSideBar(){
            this.isToggled = ! this.isToggled;
        }
    }

  }
</script>

<style>
  /*
  #app {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
    margin-top: 60px;
  }
  */
</style>
