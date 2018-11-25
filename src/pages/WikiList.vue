<template>
  <div class="WikiList">
    <div class="searchBox">
      <el-input placeholder="请搜索你的词条" style="margin-right: 0;"></el-input>
      <el-button type="primary" icon="el-icon-search">搜索词条</el-button>
    </div>
    <el-table :data="list" stripe style="width: 100%">
      <el-table-column prop="name" label="名称">
      </el-table-column>
      <el-table-column prop="hash" label="hash">
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
export default {
  name: 'WikiList',
  data () {
    return {
      list: [
        {
          name: '比特币',
          hash: '2cb931df4e46611edddff3b062bb1a73'
        },
        {
          name: 'EOS币',
          hash: '89ec6345e66e06c3c98e5926e7d80bc1'
        },
        {
          name: '亦来云',
          hash: '17332e406ead75537e1cef51334ed7c5'
        },
        {
          name: '橡链',
          hash: 'ad78bf2ee7717d59605ebe7144346759'
        }
      ]
    }
  }
}
</script>

<style scoped>
  .WikiList {
    padding: 20px 10rem;
  }
  .searchBox {
    display: flex;
    flex-direction: row;
    align-items: center;
  }
  .listItem {
    margin-top: 10px;
    margin-bottom: 10px;
    padding-bottom: 10px;
    border-bottom: 1px solid #ccc;
  }
</style>
