<script lang="ts">
    import type { LayoutData } from './$types';
	import Sidebar from './sidebar.svelte';
    
    export let data: LayoutData;
</script>
<div class="flex w-full h-full">
    <div class="flex flex-row">
        <Sidebar data={data}></Sidebar>
        <slot></slot>
    </div>
</div>