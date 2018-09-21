<template>
  <div id="app">
    <h1> REST with Vue.js </h1>

    <!-- <input type="button" value="Get Users" v-on:click="getUsers"/> -->


    

    <div>
        <h1>Create a new User</h1>
        <input type="text" v-model="user.name" placeholder="Name" />
        <input type="text" v-model="user.email" placeholder="Email" />
        <button v-on:click="createUser2()">Send</button>
        <br />
        <br />
    </div>

    
    <button v-on:click="getUsers()">Get All Users</button>
    
    <div>
        <h1>Get User:</h1>
        <input type="text" v-model="user.id" placeholder="Name" />
        <button v-on:click="getUser2()">Send</button>
        <br />
        <br />
    </div>


    <div>
        <ul>
          <li v-for="user of users">
            {{user.name}} - {{user.email}}
          </li>
        </ul>

        <ul v-if="errors && errors.length">
          <li v-for="error of errors">
              <span style="color:red;">{{error.message}} </span>
          </li>
        </ul>
    </div>

  </div>
</template>

<script>

import {HTTP} from './http-common.js'

import axios from 'axios';

export default {
  name: 'app',
  data () {
    return {
      user: {
              id: 0,
              name: "",
              email: "",
              createAt: ""
            },
      users: [],
      errors: []
    }
  },

  methods: {
      getUser() {
          axios({ method: "GET", "url": "http://localhost:8180/user/"+this.user.id }).then(result => {
                console.log(result.data);
                this.users = [];
                this.users.push(result.data);
          }, error => {
                console.error(error);
          });
      },
      getUser2() {
        HTTP.get("/user/"+this.user.id)
          .then( 
            result => { console.log(result.data); this.users = []; this.users.push(result.data)}
          )
        .catch(
          e => { this.errors.push(e) }
        )
      },
      getUsers() {
          axios({ method: "GET", "url": "http://localhost:8180/users" }).then(result => {
                console.log(result.data);
                this.users = result.data;
          }, error => {
                console.error(error);
          });
      },
      createUser() {
          axios({ method: "POST", "url": "http://localhost:8180/user", "data": this.user, "headers": { "content-type": "application/json" } }).then(result => {
              console.log(result.data);
          }, error => {
              console.error(error);
          });
      },
      createUser2() {
          HTTP.post("http://localhost:8180/user", this.user)
          .then( 
            result => { console.log(result.data);}
          )
         .catch(
           e => { this.errors.push(e) }
         )
      }
  }

  // // a method to get the back-end
  // getUsers() {
  //   alert('aqui')
  //   HTTP.get('/users')
  //       .then( 
  //           response => {this.users = response.data}
  //         )
  //       .catch(
  //         e => { this.errors.push(e) }
  //       )
  // }

}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

h1, h2 {
  font-weight: normal;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}

a {
  color: #42b983;
}
</style>
