<script>
    
    let bunny = '/src/lib/images/cutebunny.png';
    let LgID = '/src/lib/images/logoID.png';
    let LgPass = '/src/lib/images/logoPass.png';
    let LgMail = '/src/lib/images/logoEmail.png';

</script>

<div class="w-screen h-screen">
    <div class="flex h-full justify-center items-center ">
        <div class=" flex mx-8">
            <img class="object-cover h-96 mb-40" src={ bunny } alt="main pic">   
        </div>
        <div class=" flex-col mx-8 mb-40 border-4 border-pink-300 rounded-xl px-12 py-12 ">
            <div class="text-4xl text-black font-bold">Register</div>
            <form method="POST">
                <div class="flex mt-7 w-full py-2 border-2 border-pink-300 rounded-md ">
                    <img class="object-cover ml-2 h-6" src={ LgID } alt="usrname"> 
                    <input class="ml-2 focus:outline-none focus:shadow-outline text-pink-400" type="text " placeholder="Enter ID" name="name" required>
                </div>
                <div class="flex mt-7 w-full py-2 border-2 border-pink-300 rounded-md ">
                    <img class="object-cover ml-2 h-6" src={ LgPass } alt="password"> 
                    <input class="ml-2 w-full focus:outline-none focus:ring-pink-300 text-pink-400" type="password " placeholder="PassWord" name="password" required>
                </div>
                <div class="flex mt-7 w-full py-2 border-2 border-pink-300 rounded-md ">
                    <img class="object-cover ml-2 h-6" src={ LgMail } alt="email"> 
                    <input class="ml-2 w-full focus:outline-none focus:ring-pink-300 text-pink-400" type="email " placeholder="Email" name="email" required>
                </div>
                <button>
                    <div class="mt-7 w-80 border-2 py-2 px-8 border-pink-300 rounded-md bg-pink-300 text-white  text-center">
                        Register
                    </div>
                </button>
            </form>
        </div>
    </div>
</div>








