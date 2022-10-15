<script lang="ts">
    import ProductList from "../component/ProductList.svelte";
    let listProduct = ["1", "2", "3", "2", "3", "2", "3", "2", "3"];
    function allOfProduct(){

    }
</script>
<div class="flex flex-col w-screen h-screen">
    <div class="flex flex-col h-auto w-full p-4 bg-stone-700  text-amber-50 items-center">
        <div class="text-7xl my-4"><a href="/">CuteShop</a></div>
        <div class="text-xl text-center mt-4 w-1/2">On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound to ensue...</div>
        <div class="mt-8"><input class="w-96 h-10 px-5 rounded-full text-black" type="text" placeholder="Search..." size="70" ></div>
        <div class="flex mt-8 text-xl">
            <div class=" " >Recent</div>
            <div class="px-3 ml-4 border-solid rounded-2xl border border-white" >XNXX</div>
            <div class="px-3 ml-4 border-solid rounded-2xl border border-white" >JavMost</div>
            <div class="px-3 ml-4 border-solid rounded-2xl border border-white" >Xhamter</div>
            <div class="px-3 ml-4 border-solid rounded-2xl border border-white" >Pornhub</div>
            <div class="px-3 ml-4 border-solid rounded-2xl border border-white" >Nhentai</div>
        </div>
    </div>

    
    <div>
        {#if listProduct.length}
            <div class=" text-xl mt-5 mx-10 font-semibold" >Reccommend</div>
            <ProductList isWrap={ false } listProduct={ listProduct }></ProductList>
        {:else}
            <div class="text-xl mt-5 mx-10 font-semibold text-center" >No Product in Store</div>
        {/if}
    </div>
</div>