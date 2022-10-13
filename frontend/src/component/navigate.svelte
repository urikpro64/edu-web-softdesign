<script lang="ts">
    let lg = '/Logo.png';
</script>

<div class="flex my-1 w-screen font-sans shadow-md">
    <div class="flex flex-row w-full items-center text-xl text-stone-400 font-semibold" >
        <img class="m-3 object-cover w-12" src={ lg } alt="logo">
        <div class="mx-4 text-stone-900 font-bold" ><a href="/">CuteShop</a></div>
        <div class="mx-4" ><a href="/shop">Shop</a></div>
        <div class="mx-4" >About</div>
        <div class="flex w-full items-center justify-end">
            <div class="mx-4"><a href="/login">Login</a></div>
            <div class="mx-4 py-2 px-4 border-2 border-pink-300 hover:bg-pink-300 rounded-lg text-pink-300 hover:text-white hover:shadow-md"><a href="/register">Register</a></div>
        </div>
    </div>
</div>