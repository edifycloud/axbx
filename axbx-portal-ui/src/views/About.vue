<template>
  <div class="about">
    <h1>This is an about page</h1>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from "vue-property-decorator";
import Ums from "@/api/ums";

@Component
export default class About extends Vue {
  created() {
    const ums = new Ums();
    ums.getAllUser().then(x => {
      x.forEach(u => console.log(u, u.role));
    })
  }
}
</script>
