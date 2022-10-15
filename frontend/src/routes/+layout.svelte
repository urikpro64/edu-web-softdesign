<script>
    import "../app.css";
    import Navi from "../component/navigate.svelte";
</script>
<div class="scrollbar-thin">
    <Navi/>
    <body class="bg-white scrollbar-none"></body>
    <slot/>
</div>