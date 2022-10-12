<script lang="ts">
    import ProductBox from "./ProductBox.svelte";
    
    export let listProduct: Array<String>;
    export let isWrap: boolean = true;
</script>

{#if isWrap}
    <div class="flex flex-wrap">
        {#each listProduct as Id}
            <div class="">
                <ProductBox productId={ Id }></ProductBox>
            </div>
        {/each}
    </div>
{:else}
    <div class="flex h-auto bg-scroll overflow-x-auto snap-x scrollbar-thin scrollbar-track-transparent scrollbar-thumb-gray-300 scrollbar-thumb-rounded-md">
        {#each listProduct as Id}
            <div class="snap-center">
                <ProductBox productId={ Id }></ProductBox>
            </div>
        {/each}
    </div>
{/if}
