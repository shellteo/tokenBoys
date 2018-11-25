<template>
  <div class="SideBar">
    <div class="side">
      <div class="sideItem" :class="{'ck': current===0}" @click="navigatorTo(0, '/')">首页</div>
      <div class="sideItem" :class="{'ck': current===1}" @click="navigatorTo(1, '/list')">词条列表</div>
      <div class="sideItem" :class="{'ck': current===2}" @click="navigatorTo(2, '/edit')">创建词条</div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'SideBar',
  data () {
    return {
      current: 0,
      obj: {
        '/': 0,
        '/list': 1,
        '/edit': 2
      }
    }
  },
  methods: {
    navigatorTo(i, path) {
      this.current = i;
      this.$router.push({
        path: path
      })
    }
  },
  mounted() {
    let path = this.$route.path;
    this.current = this.obj[path];
  }
}
</script>

<style scoped>
  .SideBar {
    padding: 20px 20px 0 20px;
  }
  .side {
    background-color: #fff;
    box-shadow: 0 1px 4px 0 rgba(0,0,0,.1);
  }
  .sideItem {
    height: 50px;
    line-height: 50px;
    padding: 0 20px;
    color: #6b737b;
    font-size: 15px;
    cursor: pointer;
  }
  .sideItem:hover,
  .ck {
    color: #2b3441;
    background-color: #fafafb;
    font-weight: 500;
  }
</style>
