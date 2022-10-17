import { redirect, type Action, type Actions } from '@sveltejs/kit';
import { Fetcher } from '../../repository/Fetcher';

const login: Action =async ({ cookies, request}) => {
    const data = await request.formData()
    console.log(data);
    const loginData = {
        name: data.get("name"),
        password: data.get("password"),
    };
    
    const fetcher : Fetcher = new Fetcher();
    const result = await fetcher.postApi("/login", loginData);
    console.log(result);

    cookies.set('userId',result.userId);

    throw redirect(302,'/');
}

export const actions: Actions = { login };
// /** @type {import('./$types').Actions} */
// export const actions = {
//     default: async (event : any) => {
//         const data = await event.request.formData();
        
//         const loginData = {
//             name: data.get("name"),
//             password: data.get("password"),
//         };
        
//         const fetcher : Fetcher = new Fetcher();
//         const result = await fetcher.postApi("/login", loginData);
//         console.log(result);
//         return result;
//     }
//   };