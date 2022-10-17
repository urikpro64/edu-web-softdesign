<script lang='ts'>
	import type { PageData } from "./$types";
    export let data : PageData;
    let LgID = '/src/lib/images/logoID.png';
    let LgMail = '/src/lib/images/logoEmail.png';
</script>

 {#if data.userData}
<div class="w-screen h-screen">
    <div class="flex ">
        <div class="flex flex-col w-full items-center">
            <img class="mt-10 object-cover" src={ LgID }> 
            <div class="mt-10 font-bold text-4xl">My Profile </div>
            <div class="flex-row mt-10 pr-32">
                <div class="flex">
                    <img class="object-cover ml-2 h-6" src={ LgID }> 
                    <div class="ml-4 font-bold">ID : {data.userData.name}</div>
                </div>
                <div class="flex mt-8">
                <img class="object-cover ml-2 h-6" src={ LgMail }> 
                <div class="ml-4 font-bold">Email : {data.userData.email}</div>
                </div>
            </div>
        </div>
    </div>
</div>
{/if}

