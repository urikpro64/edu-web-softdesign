import type { LayoutLoad } from './$types';

export const load: LayoutLoad = async (data) => {
    return {
        userData:data.data.userData
    };
};