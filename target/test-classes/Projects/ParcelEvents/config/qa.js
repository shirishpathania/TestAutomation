function fn(config) {

    //URL
    config['baseURL'] = 'https://qa.apis.post.co.nz/parceleventsexperience-1-0/api';

    //OAUTH 2.0 TOKEN
    config['request_token'] = karate.callSingle('classpath:Projects/token/token.feature');

    //REQUEST PAYLOAD
    config['request'] = read('classpath:Projects/ParcelEvents/requests/request.json')

    return config;
}