<script>
    
    const userData = 'aaaaaaaa';
    let lg = '/Logo.png';
    let name = 'Search';
    import LogButton from './LoginButton.svelte';
    import RegButton from './RegisterButton.svelte';

	function handleClick() {
		alert('Button Clicked');
	}
</script>


<div class="flex my-1 w-screen font-sans">
    <div class="flex flex-row w-full items-center text-xl text-stone-400 font-semibold" >
        <img class="m-3 object-cover w-12" src={ lg } alt="logo">
        <div class="mx-4 text-stone-900 font-bold" >CuteShop</div>
        <div class="mx-4" >Shop</div>
        <div class="mx-4" >About</div>
        <div class="flex w-full items-center justify-end">
            <div class="mx-4"><a href="/register">Login</a></div>
            <div class="mx-4 py-2 px-4 border-2 border-pink-300 hover:bg-pink-300 rounded-lg text-pink-300 hover:text-white hover:shadow-md"><a href="/login">Register</a></div>
        </div>
    </div>
</div>

<div class="flex flex-col h-96 w-full p-4 bg-stone-700  text-amber-50 items-center">
    <div class="text-7xl my-4">CuteShop</div>
    <div class="text-xl mt-4">sadwqfffagasdwaagasdwaagafagasdwasdwada</div>
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

<div class=" text-xl mt-5 ml-10" >Reccommend</div>
