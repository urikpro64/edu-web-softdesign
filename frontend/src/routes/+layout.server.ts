import { Fetcher } from '../repository/Fetcher';
import type { LayoutServerLoad } from './$types';

export const load: LayoutServerLoad = async (event) => {
    let userId;
    try { 
        userId = event.cookies.get("userId");
        const fetcher:Fetcher = new Fetcher();
        const userData = await fetcher.getApi(`/users/${userId}`);
        return {
            userData: userData
        };
    }
    catch{
        userId = '';
        console.log("Not login");
        return{
            userData: ''
        };
    }
    
    
    
};
