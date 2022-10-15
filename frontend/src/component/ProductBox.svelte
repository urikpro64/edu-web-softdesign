<script lang="ts">
    export let productId: String;
    let productName: String;
    let productPrice: number;
    let productDate: String;
</script>

<div class="m-4 flex w-72 h-96 border-solid rounded-md border-2 hover:shadow-xl">
    <div class="mt-4 mb-2 mx-4 flex flex-col-reverse w-full items-center">
        <div class="self-end font-bold text-lg">$ { productPrice }</div>
        <div class="mb-5">{ productDate }</div>
        <div class="font-semibold">{ productName }</div>
        <div class="bg-slate-700 w-full h-full"></div>
        <div class="font-semibold">{ productId }</div>
    </div>
</div>