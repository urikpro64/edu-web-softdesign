<script>
    
</script>


<div class="w-screen h-screen">
    <div class="flex">
        <aside class="w-64" aria-label="Sidebar">
            <div class="overflow-y-auto py-4 px-3 bg-gray-50 rounded dark:bg-white">
                <ul class="space-y-2">
                    <li>
                        <a href="/profile" class="flex items-center p-2 text-base font-bold text-gray-500 rounded-lg hover:bg-pink-300 hover:text-white">
                            <svg aria-hidden="true" class="flex-shrink-0 w-6 h-6 text-white-500 transition duration-75  " fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M10 9a3 3 0 100-6 3 3 0 000 6zm-7 9a7 7 0 1114 0H3z" clip-rule="evenodd"></path></svg>
                            <span class="flex-1 ml-3 whitespace-nowrap">Profile</span>
                        </a>
                    </li>        
                    <li>
                        <a href="/myproduct" class="flex items-center p-2 text-base font-bold text-gray-500 rounded-lg hover:bg-pink-300 hover:text-white">
                            <svg aria-hidden="true" class="flex-shrink-0 w-6 h-6 text-white-500 transition duration-75" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M10 2a4 4 0 00-4 4v1H5a1 1 0 00-.994.89l-1 9A1 1 0 004 18h12a1 1 0 00.994-1.11l-1-9A1 1 0 0015 7h-1V6a4 4 0 00-4-4zm2 5V6a2 2 0 10-4 0v1h4zm-6 3a1 1 0 112 0 1 1 0 01-2 0zm7-1a1 1 0 100 2 1 1 0 000-2z" clip-rule="evenodd"></path></svg>
                            <span class="flex-1 ml-3 whitespace-nowrap">My Product</span>
                        </a>
                    </li>
                    <li>
                        <a href="/addproduct" class="flex items-center p-2 text-base font-bold text-gray-500 rounded-lg hover:bg-pink-300 hover:text-white">
                            <svg aria-hidden="true" class="flex-shrink-0 w-6 h-6 text-white-500 transition duration-75" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M8.707 7.293a1 1 0 00-1.414 1.414l2 2a1 1 0 001.414 0l2-2a1 1 0 00-1.414-1.414L11 7.586V3a1 1 0 10-2 0v4.586l-.293-.293z"></path><path d="M3 5a2 2 0 012-2h1a1 1 0 010 2H5v7h2l1 2h4l1-2h2V5h-1a1 1 0 110-2h1a2 2 0 012 2v10a2 2 0 01-2 2H5a2 2 0 01-2-2V5z" clip-rule="evenodd"></path></svg>
                            <span class="flex-1 ml-3 whitespace-nowrap">Add Product</span>
                        </a>
                    </li> 
                    <li>
                        <a href="/" class="flex items-center p-2 text-base font-bold text-gray-500 rounded-lg hover:bg-pink-300 hover:text-white">
                            <svg aria-hidden="true" class="flex-shrink-0 w-6 h-6 text-white-500 transition duration-75" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M3 3a1 1 0 00-1 1v12a1 1 0 102 0V4a1 1 0 00-1-1zm10.293 9.293a1 1 0 001.414 1.414l3-3a1 1 0 000-1.414l-3-3a1 1 0 10-1.414 1.414L14.586 9H7a1 1 0 100 2h7.586l-1.293 1.293z" clip-rule="evenodd"></path></svg>
                            <span class="flex-1 ml-3 whitespace-nowrap">Logout</span>
                        </a>
                    </li>
                </ul>
            </div>
        </aside>
            <div class="flex flex-col w-full items-center justify-center">
                <div class="w-full text-center font-bold text-4xl mt-8">Add Product</div>
                    <div class="rounded-lg shadow-xl bg-gray-50 lg:w-1/2">
                        <div class="mt-8">
                            <label class="inline-block mb-2 text-gray-500">Upload ImageProduct(jpg,png,svg,jpeg)</label>
                            <div class="flex mt-4 items-center justify-center w-full">
                                <label class="flex flex-col w-64 h-48 border-4 border-dashed hover:bg-gray-100 hover:border-gray-300">
                                    <div class="flex flex-col items-center justify-center pt-14">
                                        <svg xmlns="http://www.w3.org/2000/svg"
                                            class="w-12 h-12 text-gray-400 group-hover:text-gray-600" viewBox="0 0 20 20"
                                            fill="currentColor">
                                            <path fill-rule="evenodd"
                                                d="M4 3a2 2 0 00-2 2v10a2 2 0 002 2h12a2 2 0 002-2V5a2 2 0 00-2-2H4zm12 12H4l4-8 3 6 2-4 3 6z"
                                                clip-rule="evenodd" />
                                        </svg>
                                        <p class="pt-1 text-sm tracking-wider text-gray-400 group-hover:text-gray-600">Select a photo</p>
                                    </div>
                                    <input type="file" class="opacity-0" />
                                </label>
                            </div>
                        <div class="flex p-2 space-x-4">
                            <button class="px-4 py-2 text-white bg-red-500 rounded shadow-xl">Delete</button>
                            <button class="px-4 py-2 text-white bg-green-500 rounded shadow-xl">Add</button>
                        </div>
                        <div class="font-bold text-xl mt-8">Name Product</div>
                        <div class="mt-2 "><input class="w-full focus:outline-none focus:shadow-outline text-pink-400" type="text " placeholder="Name Product" ></div>
                        <div class="font-bold text-xl mt-4">Price</div>
                        <div class="mt-2 "><input class="w-full focus:outline-none focus:shadow-outline text-pink-400" type="number" placeholder="Price" ></div>
                        <button class="mt-10 px-4 py-2 w-full items-center justify-center text-white bg-green-500 rounded ">Add Product</button>
                    </div>
                </div>
            </div>
    </div>
</div>
