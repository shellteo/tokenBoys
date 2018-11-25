<template>
  <div class="Home">
    <div class="Top">
      <el-row :gutter="20">
        <el-col :span="16">
          <el-carousel height="350px" indicator-position="outside" arrow="always" type="card">
            <el-carousel-item v-for="(item, key) in homeCarousel" :key="key">
              <el-card :body-style="{ padding: '0px' }" >
                <img :src="item.imgUrl" class="image" @click="toDetail(key)">
                <div style="padding: 14px;" @click="toDetail(key)">
                  <span>{{item.title}}</span>
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
    <el-dialog title="新增词条" :visible.sync="dialogFormVisible">
      <div style="display: flex;align-items: center;margin-bottom: 40px;">
        <span style="white-space: nowrap;font-size: 20px;">词条名：</span>
        <el-input v-model="wordName" placeholder="请输入词条名称"></el-input>
      </div>
      <div style="color: #999;font-size: 12px;">
        <p><i class="el-icon-question"></i> 问渠百科规范的词条名应该是一个专有名词，使用正式的全称或最常用的名称。</p>
        <p>如果一个词条拥有两个或更多的称呼（如“北京大学”和“北大”），问渠百科只收录一个标准名称的词条（北京大学），请不要创建一个内容相同的新词条（北大），而是报告同义词。</p>
      </div>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false;wordName='';">取 消</el-button>
        <el-button type="primary" @click="confirmCreate">创建词条</el-button>
      </div>
    </el-dialog>
    <!--<div>
      <div style="align-self: flex-end">
        <span class="myDesc">问渠哪得清如许</span>
        <span class="myDesc">唯有源头活水来</span>
      </div>
    </div>-->
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
  name: 'Home',
  components: {
  },
  data () {
    return {
      homeCarousel: [
        {
          imgUrl: 'https://blog.equinix.com/wp-content/uploads/2017/10/blockchain.jpg',
          title: '问渠百科',
          content: `
    <img style="width: 400px;" src="https://myblog-images1.oss-cn-beijing.aliyuncs.com/tokenboys/logo2.png" alt="">
<p>问渠百科，取名于明代朱熹的“问渠哪得清如许，为有源头活水来。”问渠百科是一个基于 Elastos 的去中心化知识百科分享平台，问渠百科基于DID的身份认证能力，实现用户编辑百科的知识产权确权，设计代币激励系统，奖励编辑百科并提供优质内容的用户，惩罚作恶的用户（如故意编辑错误的百科）。</p>`
        },{
          imgUrl: 'https://i1.7234.cn/system/redactor_assets/pictures_3/000/051/076/51076/2017/867fc68a28c42ac591b6286bdaaaa539.jpeg',
          title: '亦来云',
          content: `<p><strong>亦来云（Elastos）</strong>是全球第一个让区块链的可信能够传递到用户日常场 景的操作系统。以区块链为可信基础，结合Elastos的沙箱隔离机制和网 络隔离机制，让数字资产可以被确权、数量有限（稀缺）、可交易和可消费。 让人人都能拥有数字资产，变现未来财富。从而将互联网打造为智能经 济生态圈。 </p><p><br></p><p>亦来云（Elastos）是开源的软件系统，其研发过程中受到了富士康等产 业巨头超过两个亿人民币的赞助支持，已开源了上千万行源代码，包括 超过四百万行原创开发的源代码。亦来云项目在陈榕的带领下，几百人 团队开发多年，苦于一直没遇到合适的市场窗口期（像当年微软的DOS 和WINDOWS），直到遇上了区块链以及韩锋等业界代表人物。</p><p><br></p><p> Elastos可以很好地保护数字内容、隐私不被泄露、不被窃取；而区块链 可以为数字内容颁发ID（权证），确认数字内容产权和可交易。两者结 合为信息时代的互联网提供“私有产权”的经济基础。只有在产权明晰 的基础之上才能产生经济、发展生产力。 </p><p><br></p><p>陈榕和韩锋等人经过数十次讨论，对一个去中心化的全自动智能经济需 要一个安全并且可用的操作系统达成共识。亦来云实现了“信任和计算 分离”，使得大型去中心化应用（DApp）兼具“可用性”和“可信度”。 解决了以太坊为代表的、智能合约虚拟机功能高度耦合的现有区块链系 统的局限性。保证去中心化的应用完全跑在一个高性能的、可信安全的“财 富互联网”上。</p><p><br></p><p> 亦来云致力于在传统互联网上打造全新智能经济特区，亦来币是该经济 特区内流通的基础代币。 亦来云创造者们期望把互联网智能经济推进到 一个全新的高度。</p><p>&nbsp;</p>`
        },{
          imgUrl: 'http://5b0988e595225.cdn.sohucs.com/images/20180127/c9a8c2f9a1de463ab72b45b94d42a7ab.jpeg',
          title: '铂链',
          content: `<p><strong>简介铂链（Bottos）</strong>是基于区块链技术，实现将人工智能的数据和模型通过点对点网络进行登记发行、转让交易的去中心化网络协议，并和通过智能合约帮助人工智能项目简单、快速获取训练数据，通过数据挖矿使得个人数据产生财富价值的基于共识的、可扩展的、标准化的、特性完备、易于开发的和协同的一站式应用平台。</p><p><br></p><p><strong>背景&nbsp;</strong>在人工智能时代，数据财富价值会逐步显现，数据正在催生新的经济体。如果我们不想这一切在未来只是巨头们的舞台，那么我们就需要联合起来，构建一个全球共享的数据库。我们可以由此构建全新的模型，能够在输入和输出之间建立之前无法建立起来的关系。借助人工智能模型，我们可以获得全新的洞察力。因此，我们首个提出“数据入股”的理念，以“数据挖矿”的方式实现经济激励，即数据贡献方以自身数据入股人工智能模型或产品，并共享其未来价值，铂链（Bottos）因此而生。</p>`
        }
      ],
      wordName: '',
      dialogFormVisible: false
    }
  },
  methods: {
    toDetail(i) {
      localStorage.setItem('title', this.homeCarousel[i].title);
      localStorage.setItem('content', this.homeCarousel[i].content);
      this.$router.push({
        path: '/detail?f=p'
      })
    },
    createWord() {
      this.dialogFormVisible = true;
    },
    confirmCreate() {
      let wordName = this.wordName;
      this.wordName = '';
       this.$router.push({
         path: `/edit?p=${wordName}`
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
