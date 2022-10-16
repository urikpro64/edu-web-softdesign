import { Fetcher } from '../../../repository/Fetcher'

/** @type {import('./$types').PageServerload} */
export function load(data: any){
	const fetcher: Fetcher = new Fetcher();
	const detail = fetcher.fetchApi(`/users/${data.params.slug}`);
	// console.log(detail);
	return {
		userDetail: detail
	}
}