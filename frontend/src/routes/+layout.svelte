<script>
    import "../app.css";
    import Navi from "../component/navigate.svelte";
    /** @type {import('./$types').LayoutData} */
	export let data;
    console.log("layout:",data.userData);
</script>
<div class="scrollbar-thin">
    <Navi userData={data.userData}/>
    <body class="bg-white scrollbar-none"></body>
    <slot/>
</div>