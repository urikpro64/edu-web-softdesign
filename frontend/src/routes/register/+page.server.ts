import { Fetcher } from '../../repository/Fetcher';

/** @type {import('./$types').Actions} */
export const actions = {
    default: async (event : any) => {
        const data = await event.request.formData();
        
        const registerData = {
            name: data.get("name"),
            password: data.get("password"),
            email: data.get("email")
        };
        const fetcher : Fetcher = new Fetcher();
        const result = await fetcher.postApi("/users/add", registerData);
        console.log(result);
        return result;
    }
  };
