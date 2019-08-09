# base vue
     A simple vue.js project with router, vuex and boostrap-vue.
     This Application is based on Simple Sidebar Bootstrap Template (https://startbootstrap.com/template-overviews/simple-sidebar)

    ![Screenshot](https://github.com/jadsonjs/vuejs/blob/master/base-vue/src/assets/img/home.png)


This project has no communication with back-end, it is just a generic font-end project to be adapted to a full project.

**Version 1.0.0**

	The project structure:
	
```
├── src/                                      # root folder of the projects
|   ├── assets/                               # third-party static imagens and css files                       
|   ├── components/                           # Vue.js components
|   |   └── ...       
|   ├── layout/                               # Vue.js components that define the application layout
|   |   └── ... 
|   ├── router/                               
|   |   └── index.js /                        # Vue.js router file
|   ├── store/                               
|   |   └── index.js /                        # VUEX store data
|   └── main.js                               
|   └── App.vue                               # Vue main component 
```


## 1.Introduction

This project was generated with [Vue CLI](https://cli.vuejs.org/) version 3.10.0.

### Project Plugins

This project contains the flows plugins:

```
npm install vue bootstrap-vue bootstrap --sabe

npm install vue-router --save

npm install vuex --save

npm install es6-promise --save
```

## 2. Install Node.js and Vue-CLI

You first need to install [NodeJs](https://nodejs.org/en/) thats include npm. 

After install node.js, you need to install Vue CLI:

```
npm install -g @vue/cli (vue cli 3)
```

## 3.Clone de Project

Clone the main repository.

```
git clone https://github.com/jadsonjs/vuejs.git
```


## Project setup
```
cd base-vue
npm install
```

### Compiles and hot-reloads for development
```
npm run serve
```

### Compiles and minifies for production
```
npm run build
```

### Run your tests
```
npm run test
```

### Lints and fixes files
```
npm run lint
```

### Customize configuration
See [Configuration Reference](https://cli.vuejs.org/config/).
