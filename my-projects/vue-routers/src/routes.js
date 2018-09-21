

import Bar from './components/Bar'
import Foo from './components/Foo'

import User from './components/Users/User'
import UserProfile from './components/Users/Profile'
import UserPosts from './components/Users/Posts'


// 2. Define some routes
// Each route should map to a component. The "component" can
// either be an actual component constructor created via
// `Vue.extend()`, or just a component options object.
// We'll talk about nested routes later.
const routes = [
	{ path: '/foo', component: Foo },
	{ path: '/bar', component: Bar },
	{ path: '/user/:id', component: User,
	  children: [
	    {
	      // UserProfile will be rendered inside User's <router-view>
	      // when /user/:id/profile is matched
	      path: 'profile',
	      component: UserProfile
	    },
	    {
	      // UserPosts will be rendered inside User's <router-view>
	      // when /user/:id/posts is matched
	      path: 'posts',
	      component: UserPosts
	    }
	  ]
	} 
]


export default routes