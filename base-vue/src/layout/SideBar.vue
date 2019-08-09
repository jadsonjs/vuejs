<template>
    <div class="bg-light border-right" id="sidebar-wrapper">
      <div class="sidebar-heading"> <router-link to="/"> Home </router-link> </div>
      <div class="list-group list-group-flush">
        <a href="#" class="list-group-item list-group-item-action bg-light">Dashboard</a>
        <a href="#" class="list-group-item list-group-item-action bg-light">Shortcuts</a>
        <a href="#" class="list-group-item list-group-item-action bg-light">Overview</a>
        <a href="#" class="list-group-item list-group-item-action bg-light">Events</a>
        <a href="#" class="list-group-item list-group-item-action bg-light">Profile</a>
        <a href="#" class="list-group-item list-group-item-action bg-light">Status</a>
        <router-link to="/hello" class="list-group-item list-group-item-action bg-light"> Hello </router-link>
      </div>
    </div>
</template>

<script>
export default {

}
</script>

<style>

</style>
