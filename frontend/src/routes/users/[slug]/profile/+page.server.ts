import { Fetcher } from '../../../../repository/Fetcher';
import type { PageServerLoad } from './$types';

export const load: PageServerLoad = async (event) => {
    const userId = event.cookies.get("userId");
    if(userId != null || userId != 0){
        const fetcher:Fetcher = new Fetcher();
        const userData = await fetcher.getApi("/users/" + userId);
        return {
            userData: userData
        }
    }
    else {
        return {
            userData: null
        };
    }
    
};