//package: classes


@RestResource(urlMapping='/*')
global with sharing class SwagValuesApiController {


	@HttpGet
	global static string Get(){
			
        String path = req.requesturi.substring(req.requesturi.lastindexof('/')+1);
		switch on path {
            elseif(path == '/api/Values/{id}'){

            when '/api/Values/{id}' {
                apiValuesByIdDelete(path);
            }
            elseif(path == '/api/Values/{id}'){

            when '/api/Values/{id}' {
                apiValuesByIdGet(path);
            }
            elseif(path == '/api/Values/{id}'){

            when '/api/Values/{id}' {
                apiValuesByIdPut(path);
            }
            elseif(path == '/api/Values'){

            when '/api/Values' {
                apiValuesGet(path);
            }
            elseif(path == '/api/Values'){

            when '/api/Values' {
                apiValuesPost(path);
            }
		}
	}

	
	//apiValuesByIdDelete

	private static  apiValuesByIdDelete(String path){
	
		Integer id = null;
	
	}
	
	//apiValuesByIdGet

	private static String apiValuesByIdGet(String path){
	
		Integer id = null;
	
	}
	
	//apiValuesByIdPut

	private static  apiValuesByIdPut(String path){
	
		Integer id = null;
		String value = null;
	
	}
	
	//apiValuesGet

	private static List&lt;String&gt; apiValuesGet(String path){
	
	
	}
	
	//apiValuesPost

	private static  apiValuesPost(String path){
	
		String value = null;
	
	}
	
}
