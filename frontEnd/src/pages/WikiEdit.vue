<template>
  <div class="WiKiEdit">
    <div class="titleContainer">
      <span class="title">{{title}}</span>
      <div>
        <el-button type="primary" @click="submit">提交</el-button>
        <el-button @click="preview">预览</el-button>
      </div>
    </div>
    <quill-editor ref="myTextEditor"
                  style="height: 100%;border: none;"
                  v-model="content"
                  :options="editorOption"
                  @blur="onEditorBlur($event)"
                  @focus="onEditorFocus($event)"
                  @ready="onEditorReady($event)">
    </quill-editor>
  </div>
</template>

<script>
// require styles
import 'quill/dist/quill.core.css'
import 'quill/dist/quill.snow.css'
import 'quill/dist/quill.bubble.css'

import { quillEditor } from 'vue-quill-editor'
import {setContent} from "../apis";

export default {
  name: 'WiKiEdit',
  components: {
    quillEditor
  },
  data () {
    return {
      title: '',
      content: '',
      editorOption: {
        placeholder: '请输入具体信息',
        modules: {
          toolbar: [
            ['bold', 'italic'],
            [{ 'list': 'ordered'}, { 'list': 'bullet' }],
            [{ 'size': ['small', false, 'large'] }],
            ['link']
          ]
        }
      }
    }
  },
  methods: {
    submit() {
      this.$confirm('确认提交本词条和内容吗？', '来自问渠百科的温馨提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        const loading = this.$loading({
          lock: true,
          text: '提交中...',
          spinner: 'el-icon-loading',
          background: 'rgba(0, 0, 0, 0.7)'
        });
        setContent({
          elaName: this.title,
          elaContent: this.content
        }).then((res) => {
          loading.close();
          if (res.code - 0 === 200) {
            this.$router.push({
              path: `/detail?id=${res.data.id}`
            })
          }
        });
      }).catch(() => {
      });
    },
    preview() {
      localStorage.setItem('title', this.title);
      localStorage.setItem('content', this.content);
      const {href} = this.$router.resolve({
        path: '/detail?f=p'
      })
      console.log(href);
      window.open(href, '_blank')
    },
    onEditorBlur() {

    },
    onEditorFocus() {

    },
    onEditorReady() {

    }
  },
  mounted() {
    this.title = this.$route.query.p
  }
}
</script>

<style scoped>
  .WiKiEdit {
    height: calc(100% - 200px);
  }
  .title {
    font-size: 22px;
    color: #bbb;
  }
  .titleContainer {
    height: 40px;
    padding: 10px 20px;
    display: flex;
    align-items: center;
    justify-content: space-between;
  }
</style>
