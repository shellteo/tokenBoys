<template>
  <div class="Header">
    <div class="logoTitleContainer" @click="toHome" style="cursor: pointer;">
      <img src="@/assets/logo.png" alt="" class="logoImg">
      <span>问渠百科</span>
    </div>
    <div class="avatarBox">
      <!--<img src="@/assets/avatar.jpg" alt="" class="avatarImg">
      <i class="el-icon-arrow-down"></i>-->
      <span style="margin-right: 40px;">shellteo</span>
      <el-button type="text" @click="toMyList">我的词条</el-button>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Header',
  data () {
    return {
    }
  },
  methods: {
    toMyList() {
      this.$router.push({
        path: '/list'
      })
    },
    toHome() {
      this.$router.push({
        path: '/'
      })
    }
  }
}
</script>

<style scoped>
  .Header {
    height: 100%;
    display: flex;
    flex-direction: row;
    align-items: center;
    justify-content: space-between;
  }
  .avatarBox {
    display: flex;
    flex-direction: row;
    align-items: center;
    justify-content: center;
  }
  .logoImg {
    width: 40px;
    padding-right: 5px;
  }
  .logoTitleContainer {
    display: flex;
    flex-direction: row;
    align-items: center;
  }
</style>
