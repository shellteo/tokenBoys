<template>
  <el-container class="Preview">
    <el-main v-loading="loading">
      <div class="container">
        <div class="titleContainer">
          <div class="title">{{title}}</div>
          <div class="articleInfo">
            <div class="desc">
              <time datetime="2018-11-25">{{datetime}}</time>
            </div>
            <div class="desc">hash: {{hash}}</div>
          </div>
        </div>
        <div v-html="content"></div>
      </div>
    </el-main>
  </el-container>
</template>

<script>
// require styles
import 'quill/dist/quill.core.css'
import 'quill/dist/quill.snow.css'
import 'quill/dist/quill.bubble.css'

import { quillEditor } from 'vue-quill-editor'

import {getDetail} from "../apis";

export default {
  name: 'WiKiEdit',
  components: {
    quillEditor
  },
  data () {
    return {
      title: '',
      content: '',
      loading: false,
      datetime: '',
      hash: ''
    }
  },
  methods: {
  },
  mounted() {
    this.loading = true;
    let f = this.$route.query.f;
    if (f === 'p') {
      setTimeout(() => {
        this.loading = false;
        this.title = localStorage.getItem('title');
        this.content = localStorage.getItem('content');
        this.datetime = (new Date()).toLocaleDateString();
        this.hash = 'dac0bfbdd7aebb16e447894e54080380';
      }, 1000)
    } else {
      let id = this.$route.query.id;
      getDetail({
        id: id
      }).then((res) => {
        this.loading = false;
        this.content = res.data.elaContent;
        this.title = res.data.elaName;
        this.datetime = (new Date(res.data.makeTime)).toLocaleDateString();
        this.hash = res.data.elaHash;
      })
    }
  }
}
</script>

<style scoped>
  .Preview {
    padding: 10px 10rem;
    box-sizing: border-box;
    background-color: #F5F5F5;
    min-height: 100%;
  }
  .container {
    padding: 20px;
    background-color: #fff;
  }
  .title {
    font-size: 22px;
  }
  .titleContainer {
    padding-bottom: 10px;
    margin-bottom: 20px;
    border-bottom: 1px solid #ccc;
  }
  .articleInfo {
    margin-top: 10px;
  }
  .desc {
    font-size: 12px;
    color: #666;
    line-height: 20px;
  }
</style>
