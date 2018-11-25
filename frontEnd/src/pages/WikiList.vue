<template>
  <div class="WikiList">
    <div class="searchBox">
      <el-input placeholder="请搜索你的词条" style="margin-right: 0;"></el-input>
      <el-button type="primary" icon="el-icon-search">搜索词条</el-button>
    </div>
    <el-table :data="list" stripe style="width: 100%" v-loading="loading">
      <el-table-column prop="elaName" label="名称">
      </el-table-column>
      <el-table-column prop="elaHash" label="hash">
      </el-table-column>
      <el-table-column label="操作" width="100px">
        <template slot-scope="scope">
          <el-button @click="toDetail(scope.row.id)" type="text" size="small">查看</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
import {getList} from "../apis";

export default {
  name: 'WikiList',
  data () {
    return {
      list: [
        {
          name: '问渠百科',
          hash: 'dac0bfbdd7aebb16e447894e54080380'
        },
        {
          name: '亦来云',
          hash: '17332e406ead75537e1cef51334ed7c5'
        },
        {
          name: '铂链',
          hash: 'fdb94f57faf7ea38014b40de4fd3b644'
        }
      ],
      loading: false
    }
  },
  methods: {
    toDetail(id) {
      this.$router.push({
        path: `/detail?id=${id}`
      })
    }
  },
  mounted() {
    this.loading = true;
    getList().then((res) => {
      this.loading = false;
      this.list = res.data;
      console.log(res);
    })
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
