<template>
  <v-card>
      <v-flex xs12 sm10>
        <v-tree url="/item/category/list"
                :treeData="treeData"
                :isEdit="isEdit"
                @handleAdd="handleAdd"
                @handleEdit="handleEdit"
                @handleDelete="handleDelete"
                @handleClick="handleClick"
        />
      </v-flex>
  </v-card>
</template>

<script>

  export default {
    name: "category",
    data() {
      return {
        isEdit:true,
        treeData:[]
      }
    },
    methods: {
      handleAdd(node) {
        console.log("add .... ");
        console.log(node.id,node.name,node.parentId);

        this.$http({
          method: "post",
          url:"/item/category/list",
          data: node
        }).then(() => {
          // 关闭窗口
          //this.$message.success("保存成功！");
        });
        console.log(node);
      },
      handleEdit(node) {
        console.log("edit... id: " + id + ", name: " + name);

        this.$http({
          method: "put",
          url:"/item/category/list",
          data: node
        }).then(() => {
          // 关闭窗口
          //this.$message.success("保存成功！");
        });
        console.log(node);
      },
      handleDelete(id) {
        console.log("delete ... " + id)
        console.log(id);
        this.$http({
          method: "delete",
          url:"/item/category/list",
          data: id
        }).then(() => {
          // 关闭窗口
          //this.$message.success("保存成功！");
        });

      },
      handleClick(node) {
     //
      }
    }
  };
</script>

<style scoped>

</style>
