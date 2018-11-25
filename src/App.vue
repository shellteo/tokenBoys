<template>
  <div id="app">
    <el-container style="height: 100%">
      <el-header style="background-color: #24292e;height: 40px;color: #fff;">
        <Header></Header>
      </el-header>
      <el-container style="background-color: #f5f5f7;">
        <!--<el-aside width="250px">
          <SideBar></SideBar>
        </el-aside>-->
        <el-container>
          <el-main style="background-color: #fff;padding: 0;">
            <router-view/>
          </el-main>
        </el-container>
      </el-container>
    </el-container>
  </div>
</template>

<script>
import Header from '@/components/layout/Header'
import SideBar from '@/components/layout/SideBar'
import Footer from '@/components/layout/Footer'
export default {
  name: 'App',
  components: {
    Header,
    Footer,
    SideBar
  }
}
</script>

<style>
  html, body {
    padding: 0;
    margin: 0;
    height: 100%;
  }
  #app {
    height: 100%;
  }
</style>
