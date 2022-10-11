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


<div class="flex ">
    <img src={lg} width="100"vspace="0" hspace="50">
    <div class="flex flex-row text-xl mt-11 text-stone-600" >
        <div class=" text-stone-900 font-bold" >CuteShop</div>
        <div class=" ml-10a" >Shop</div>
        <div class=" ml-8" >About</div>
    </div>
        <div class="flex flex-row text-xl mt-8" >
            <a href="/register">
                <div class="justify-end text-right"><RegButton on:click={handleClick}/></div>
            </a>
            <a href="/login">
                <div class="ml-5"><LogButton on:click={handleClick}/></div>
            </a>
        </div>
</div>

<div class="box-border h-96 w-full p-4 bg-stone-700  text-amber-50 ">
    <div class="text-center text-7xl mt-8" >CuteShop</div>
    <div class=" text-center text-xl mt-8" >sadwqfffagasdwaagasdwaagafagasdwasdwada</div>
    <div class=" text-center text-xl " >sadwqfffagasdwaagasdwaagafagasdwasdwada</div>
    <div class="text-center text-xl " >sadwqfffagasdwaagasdwaagafagasdwasdwada</div>
    <div class="text-center mt-8 "><input type="text" placeholder="Search" size="70" ></div>
    <div class="flex justify-center mt-8 text-xl">
        <div class=" " >Recent</div>
        <div class="ml-8 border-solid rounded-md border-2 border-white" >XNXX</div>
        <div class="ml-8 border-solid rounded-md border-2 border-white" >JavMost</div>
        <div class="ml-8 border-solid rounded-md border-2 border-white" >Xhamter</div>
        <div class="ml-8 border-solid rounded-md border-2 border-white" >Pornhub</div>
        <div class="ml-8 border-solid rounded-md border-2 border-white" >Nhentai</div>
    </div>
</div>

<div class=" text-xl mt-5 ml-10" >Reccommend</div>

    
    


    