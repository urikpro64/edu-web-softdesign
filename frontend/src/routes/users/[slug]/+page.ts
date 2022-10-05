import { error } from '@sveltejs/kit';

/** @type {import('./$types').PageLoad} */
export function load(data:any) {
    console.log(data.data);
    return {
        userDetail: data.data.userDetail
    }
}