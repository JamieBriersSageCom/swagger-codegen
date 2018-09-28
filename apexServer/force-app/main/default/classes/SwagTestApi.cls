//package: classes


@RestResource(urlMapping='/*')
global with sharing class SwagTestApiController {


	@HttpGet
	global static string Get(){
			
        String path = req.requesturi.substring(req.requesturi.lastindexof('/')+1);
		switch on path {
            elseif(path == '/api/Test/./.'){

            when '/api/Test/./.' {
                apiTestByIdByTestGet(path);
            }
            elseif(path == '/api/Test/{id}'){

            when '/api/Test/{id}' {
                apiTestByIdDelete(path);
            }
            elseif(path == '/api/Test/{id}'){

            when '/api/Test/{id}' {
                apiTestByIdPut(path);
            }
            elseif(path == '/api/Test'){

            when '/api/Test' {
                apiTestGet(path);
            }
            elseif(path == '/api/Test'){

            when '/api/Test' {
                apiTestPost(path);
            }
		}
	}

	
	//apiTestByIdByTestGet

	private static String apiTestByIdByTestGet(String path){
	
		Integer id = null;
		Integer test = null;
	
	}
	
	//apiTestByIdDelete

	private static  apiTestByIdDelete(String path){
	
		Integer id = null;
	
	}
	
	//apiTestByIdPut

	private static  apiTestByIdPut(String path){
	
		Integer id = null;
		String value = null;
	
	}
	
	//apiTestGet

	private static List&lt;String&gt; apiTestGet(String path){
	
	
	}
	
	//apiTestPost

	private static  apiTestPost(String path){
	
		String value = null;
	
	}
	
}
