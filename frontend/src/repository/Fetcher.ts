const API_PATH = 'http://127.0.0.1:8080';

export class Fetcher {

	public async getApi(path: string) {
		const response = await fetch(API_PATH+path)
			.then((response) => {
				if (!response.ok) {
					throw new Error(`HTTP error! Status: ${response.status}`);
				}
				return response.json();
			})
		return response;
	}

	public async postApi(path: string, data?:any){
		if(typeof data !== 'undefined'){
			const response = await fetch(API_PATH+path, {
				method: 'POST',
				headers: {
					'Content-Type': 'application/json'
				},
				body: JSON.stringify(data),
			}).then((response) => {
				if (!response.ok) {
					throw new Error(`HTTP error! Status: ${response.status}`);
				}
				return response.json();
			})
			return response;
		}
		else{
			const response = await fetch(API_PATH+path, {
				method: 'POST',
			}).then((response) => {
				if (!response.ok) {
					throw new Error(`HTTP error! Status: ${response.status}`);
				}
				
				return response.json();
			})
			return response;
		}
	}

}