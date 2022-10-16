import { Fetcher } from '../../repository/Fetcher';

/** @type {import('./$types').Actions} */
export const actions = {
    default: async (event : any) => {
        const data = await event.request.formData();
        
        const loginData = {
            name: data.get("name"),
            password: data.get("password"),
        };
        
        const fetcher : Fetcher = new Fetcher();
        const result = await fetcher.postApi("/login", loginData);
        console.log(result);
        return result;
    }
  };