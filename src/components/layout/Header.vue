<template>
  <div class="Header">
    <span @click="toHome" style="cursor: pointer;">问渠百科</span>
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
  .avatarImg {
    width: 25px;
    padding-right: 5px;
  }
</style>
