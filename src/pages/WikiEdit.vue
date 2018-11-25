<template>
  <div class="WiKiEdit">
    <quill-editor ref="myTextEditor"
                  style="height: 100%"
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
export default {
  name: 'WiKiEdit',
  components: {
    quillEditor
  },
  data () {
    return {
      content: '<p>example content</p>',
      editorOption: {
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
    onEditorBlur() {

    },
    onEditorFocus() {

    },
    onEditorReady() {

    }
  }
}
</script>

<style scoped>
  .WiKiEdit {
    height: clac(100% - 100px);
  }
</style>
