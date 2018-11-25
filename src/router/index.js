import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/pages/Home'
import WikiList from '@/pages/WikiList'
import WikiEdit from '@/pages/WikiEdit'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home
    },
    {
      path: '/list',
      name: 'WikiList',
      component: WikiList
    },
    {
      path: '/edit',
      name: 'WikiEdit',
      component: WikiEdit
    }
  ]
})
