import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/pages/Home'
import WikiList from '@/pages/WikiList'
import WikiEdit from '@/pages/WikiEdit'
import Preview from '@/pages/Preview'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home,
      meta: {title: '问渠百科-首页'}
    },
    {
      path: '/list',
      name: 'WikiList',
      component: WikiList,
      meta: {title: '我的列表'}
    },
    {
      path: '/edit',
      name: 'WikiEdit',
      component: WikiEdit,
      meta: {title: '编辑词条'}
    },
    {
      path: '/detail',
      name: 'Preview',
      component: Preview,
      meta: {title: '问渠百科-详情'}
    }
  ]
})
