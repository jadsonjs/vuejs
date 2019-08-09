<template>
    <nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom">
        <button class="btn btn-primary" id="menu-toggle" v-on:click="toggleSideBar()">Toggle Menu</button>

        <!-- Button that is show when navbar is colapsed -->
        <button class="navbar-toggler" v-on:click="showNavBar()" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="navbar-collapse collapse" v-bind:class="{show : isShowNavBar}" id="navbarSupportedContent">

          <b-button-group class="navbar-nav ml-auto mt-2 mt-lg-0">

            <b-button variant="light" class="nav-item">Home</b-button>

            <b-button variant="light" class="nav-item">Link</b-button>

            <b-dropdown id="dropdown-right" right text="Dropdown" variant="light" size="sm" class="nav-item">
                <b-dropdown-item href="#">Action</b-dropdown-item>
                <b-dropdown-item href="#">Another action</b-dropdown-item>
                <b-dropdown-divider></b-dropdown-divider>
                <b-dropdown-item href="#">Something else here</b-dropdown-item>
            </b-dropdown>
            
         </b-button-group>  

        </div>
      </nav>
</template>

<script>
export default {
    name: 'app-header',
    props: ['isToggle'],  // receibe toggle value of father
     data () {
      return {
        // if side bar is show or not when is colalsed
        isShowNavBar: false
      }
    },
    methods:{
        toggleSideBar(){
            this.$emit('toggled', this.isToggle); // emit toggle change to the father
        },

        showNavBar(){
            this.isShowNavBar = ! this.isShowNavBar
        }
    }

}
</script>

<style>

</style>