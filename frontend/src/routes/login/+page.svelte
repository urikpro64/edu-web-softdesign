<script>
    
    let bunny = '/src/lib/images/cutebunny.png';
    let LgID = '/src/lib/images/logoID.png';
    let LgPass = '/src/lib/images/logoPass.png';
</script>



<div class="w-screen h-screen">
    <div class="flex h-full justify-center items-center  ">
        <div class=" flex mx-8 mb-40">
            <img class="object-cover h-96" src={ bunny }>   
        </div>
        <div class=" flex-col mx-8 mb-40 border-4 border-pink-300 rounded-xl px-12 py-12 ">
            <div class="text-4xl text-black font-bold">Welcome Back!</div>
            <div class="text-xl text-gray-400">login to continue</div>
            <form method="post" action="?/login">
            <div class="flex mt-7 w-full border-2 border-pink-300 rounded-md ">
                <img class="object-cover ml-2 h-6" src={ LgID }> 
                <div class="ml-2"><input class="focus:outline-none focus:shadow-outline text-pink-400" type="text " placeholder="Enter ID" name="name"></div>
            </div>
            <div class="flex mt-7 w-full border-2 border-pink-300 rounded-md ">
                <img class="object-cover ml-2 h-6" src={ LgPass }> 
                <input class="ml-2 shadow appearance-none  rounded w-full  focus:outline-none focus:shadow-outline" type="password" placeholder="Enter password" name="password">
            </div>
            <div class=" flex mx-8 ">
                <div class="mt-7 border-2 py-2 px-8 border-pink-300 rounded-md bg-pink-300 text-white">
                    <button>Login</button>
                </div>
                <div class="mt-9 ml-10 text-gray-400">New User?</div>
                    <a href="/register"><div class="mt-9 ml-2 text-pink-400">register</div></a>
             </div>
            </form>
        </div>
    </div>
</div>










