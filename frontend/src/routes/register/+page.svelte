<script>
    
    let bunny = '/src/lib/images/cutebunny.png';
    let LgID = '/src/lib/images/logoID.png';
    let LgPass = '/src/lib/images/logoPass.png';
    let LgMail = '/src/lib/images/logoEmail.png';
    function handleClick() {
		alert('Something went wrong')
	}

</script>



<div class="w-screen h-screen">
    <div class="flex h-full justify-center items-center ">
        <div class=" flex mx-8">
            <img class="object-cover h-96 mb-40" src={ bunny }>   
        </div>
        <div class=" flex-col mx-8 mb-40 border-4 border-pink-300 rounded-xl px-12 py-12 ">
            <div class="text-4xl text-black font-bold">Register</div>
            <div class="flex mt-7 w-full border-2 border-pink-300 rounded-md ">
                <img class="object-cover ml-2 h-6" src={ LgID }> 
                <input class="ml-2 focus:outline-none focus:shadow-outline text-pink-400" type="text " placeholder="Enter ID" >
            </div>
            <div class="flex mt-7 w-full border-2 border-pink-300 rounded-md ">
                <img class="object-cover ml-2 h-6" src={ LgPass }> 
                <input class="ml-2 w-full focus:outline-none focus:ring-pink-300 text-pink-400" type="text " placeholder="PassWord">
            </div>
            <div class="flex mt-7 w-full border-2 border-pink-300 rounded-md ">
                <img class="object-cover ml-2 h-6" src={ LgPass }> 
                <input class="ml-2 w-full focus:outline-none focus:ring-pink-300 text-pink-400" type="text " placeholder="Confirm PassWord">
            </div>
            <div class="flex mt-7 w-full border-2 border-pink-300 rounded-md ">
                <img class="object-cover ml-2 h-6" src={ LgMail }> 
                <input class="ml-2 w-full focus:outline-none focus:ring-pink-300 text-pink-400" type="text " placeholder="Email">
            </div>
            <div class="mt-7 w-80 border-2 py-2 px-8 border-pink-300 rounded-md bg-pink-300 text-white  text-center"><button on:click={handleClick}>
                Login
            </button></div> 
        </div>
    </div>
</div>








