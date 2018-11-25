<template>
  <div class="Home">
    <div class="Top">
      <el-row :gutter="20">
        <el-col :span="16">
          <el-carousel height="350px" indicator-position="outside" arrow="always" type="card">
            <el-carousel-item v-for="item in 4" :key="item">
              <el-card :body-style="{ padding: '0px' }">
                <img src="http://pic.52112.com/180205/18020526/a9yPQozt0g.jpg" class="image">
                <div style="padding: 14px;">
                  <span>好吃的汉堡</span>
                </div>
              </el-card>
            </el-carousel-item>
          </el-carousel>
        </el-col>
        <el-col :span="8">
          <div class="topRightBox">
            <div>
              <span class="myTitle">问渠百科</span>
              <span class="myDesc">客观 准确 专业</span>
            </div>
            <div style="margin-bottom: 40px;">
              <p>用户数量： <span class="num">23</span></p>
              <p>链上已有<span class="num">2000</span>个词条</p>
            </div>
            <el-button icon="el-icon-edit" type="primary" @click="createWord">
              &nbsp;&nbsp;&nbsp;创建词条&nbsp;&nbsp;&nbsp;
            </el-button>
          </div>
        </el-col>
      </el-row>
    </div>
    <!--<div class="Bottom">
      <el-row :gutter="20">
        <el-col :span="8">
          <el-card class="box-card">
            <div slot="header" class="clearfix">
              <span>热门词条</span>
              <el-button style="float: right; padding: 3px 0" type="text">今天</el-button>
            </div>
            <div v-for="o in 4" :key="o" class="text item">
              {{'列表内容 ' + o }}
            </div>
          </el-card>
        </el-col>
        <el-col :span="16">
        </el-col>
      </el-row>
    </div>-->
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  components: {
  },
  data () {
    return {
    }
  },
  methods: {
    createWord() {
      this.$router.push({
        path: '/edit'
      })
    }
  }
}
</script>

<style scoped>
  .Home {
    height: 100%;
    background: #d8e5f2 url(https://bkssl.bdimg.com/static/wiki-home/home/resource/img/publicizing_bg_ad17fbe.png) center center no-repeat;
  }
  .Top {
    padding: 10px;
  }
  .Bottom {
    padding: 20px;
  }
  .image {
    height: 300px;
  }
  .topRightBox {
    height: 300px;
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
  }
  .myTitle {
    margin-right: 20px;
    font-size: 22px;
    font-weight: bolder;
  }
  .myDesc {
    font-weight: bolder;
    font-size: 20px;
  }
  .num {
    font-size: 20px;
    font-weight: bolder;
    color: #3392d6;
  }
</style>
